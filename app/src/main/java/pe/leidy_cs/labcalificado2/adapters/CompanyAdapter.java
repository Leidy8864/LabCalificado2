package pe.leidy_cs.labcalificado2.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.leidy_cs.labcalificado2.R;
import pe.leidy_cs.labcalificado2.activities.DetailActvity;
import pe.leidy_cs.labcalificado2.models.Company;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    Context mContext;
    List<Company> companies;

    public CompanyAdapter(){
        this.companies = new ArrayList<>();
    }

    public void setCompanies(List<Company> companies, Context mContext){
        this.mContext = mContext;
        this.companies = companies;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryText;
        TextView nameText;
        TextView addressText;
        TextView phoneText;
        ImageView logoImage;
        LinearLayout view_container;
        ImageButton imageButton;

        public ViewHolder(View itemView) {
            super(itemView);
            view_container  = itemView.findViewById(R.id.container);
            categoryText    = itemView.findViewById(R.id.category_text);
            nameText        = itemView.findViewById(R.id.name_text);
            addressText     = itemView.findViewById(R.id.address_text);
            phoneText       = itemView.findViewById(R.id.phone_text);
            logoImage       = itemView.findViewById(R.id.logo_image);
            imageButton     = itemView.findViewById(R.id.imageButton);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_company, parent, false);
        final ViewHolder viewHolder = new ViewHolder(itemView);

        viewHolder.imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
             public void onClick(View v){
                 Intent i = new Intent(mContext, DetailActvity.class);
                 i.putExtra("name_text"     , companies.get(viewHolder.getAdapterPosition()).getName());
                 i.putExtra("category_text", companies.get(viewHolder.getAdapterPosition()).getCategory());
                 i.putExtra("address_text", companies.get(viewHolder.getAdapterPosition()).getAddress());
                 i.putExtra("phone_text", companies.get(viewHolder.getAdapterPosition()).getPhone());
                 i.putExtra("email_text", companies.get(viewHolder.getAdapterPosition()).getEmail());
                 i.putExtra("url_text", companies.get(viewHolder.getAdapterPosition()).getUrl());
                 i.putExtra("logo_image", companies.get(viewHolder.getAdapterPosition()).getLogo());
                 i.putExtra("info", companies.get(viewHolder.getAdapterPosition()).getInfo());

                 mContext.startActivity(i);
                }
            });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {
        Company company = this.companies.get(position);
        viewHolder.categoryText.setText(company.getCategory());
        viewHolder.nameText.setText(company.getName());
        viewHolder.addressText.setText(company.getAddress());
        viewHolder.phoneText.setText(company.getPhone());

        Context context = viewHolder.itemView.getContext();
        int idRes = context.getResources().getIdentifier(company.getLogo(), "drawable", context.getPackageName());
        viewHolder.logoImage.setImageResource(idRes);
    }

    @Override
    public int getItemCount() {
        return this.companies.size();
    }
}
