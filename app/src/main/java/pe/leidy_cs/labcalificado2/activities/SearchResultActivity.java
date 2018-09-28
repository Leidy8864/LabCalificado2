package pe.leidy_cs.labcalificado2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.leidy_cs.labcalificado2.R;
import pe.leidy_cs.labcalificado2.adapters.CompanyAdapter;
import pe.leidy_cs.labcalificado2.models.Company;
import pe.leidy_cs.labcalificado2.repositories.CompanyRepository;

public class SearchResultActivity extends AppCompatActivity {

    private RecyclerView companiesList;
    private TextView textDato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        companiesList = findViewById(R.id.companies_list);
        companiesList.setLayoutManager(new LinearLayoutManager(this));

        textDato = findViewById(R.id.textDato);
        if(this.getIntent().getExtras() != null) {

            if(this.getIntent().getExtras().get("dato") != null) {
                String dato = this.getIntent().getExtras().getString("dato");
                textDato.setText("Resultados para : "+dato.toLowerCase());
                filter(dato);
            }
        }
    }

    public void filter(String dato){
        CompanyAdapter adapter = new CompanyAdapter();

        List<Company> companies = CompanyRepository.getCompanies();

        List<Company> filteredList = new ArrayList<>();
        for (Company item : companies){
            if(item.getCategory().toLowerCase().contains(dato.toLowerCase())){
                filteredList.add(item);
            }
        }
        adapter.setCompanies(filteredList, this);
        companiesList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
