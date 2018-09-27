package pe.leidy_cs.labcalificado2.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

import de.cketti.mailto.EmailIntentBuilder;
import pe.leidy_cs.labcalificado2.R;

public class DetailActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = Objects.requireNonNull(getIntent().getExtras()).getString("name_text");
        String address = getIntent().getExtras().getString("address_text");
        String category = getIntent().getExtras().getString("category_text");
        String phone = getIntent().getExtras().getString("phone_text");
        String email = getIntent().getExtras().getString("email_text");
        String url = getIntent().getExtras().getString("url_text");
        String info = getIntent().getExtras().getString("info");
        String logo = getIntent().getExtras().getString("logo_image");

        TextView tv_name = findViewById(R.id.name_text);
        TextView tv_address = findViewById(R.id.address_text);
        TextView tv_category = findViewById(R.id.category_text);
        TextView tv_phone = findViewById(R.id.phone_text);
        TextView tv_email = findViewById(R.id.email_text);
        TextView tv_url = findViewById(R.id.url_text);
        TextView tv_info = findViewById(R.id.info);
        ImageView tv_logo = findViewById(R.id.logo_image);

        tv_name.setText(name);
        tv_address.setText(address);
        tv_category.setText(category);
        tv_phone.setText(phone);
        tv_email.setText(email);
        tv_url.setText(url);
        tv_info.setText(info);

        Context context = this;
        int idRes = context.getResources().getIdentifier(logo, "drawable", context.getPackageName());
        tv_logo.setImageResource(idRes);
    }

    public void BtnSetCall_onClick(View view){
        String number = getIntent().getExtras().getString("phone_text");
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + number));
        intent.setData(Uri.parse("tel:" + number));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            return;
        }
        startActivity(intent);
    }

    public void BtnSMS_onClick(View v){
        String number = getIntent().getExtras().getString("phone_text");  // The number on which you want to send SMS
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null)));
    }

    public void BtnSetNavigation_onclick(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(getIntent().getExtras().getString("url_text")));
        startActivity(intent);
    }

    public void BtnSendMessage(View view){
        Intent emailIntent = EmailIntentBuilder.from(this)
                .to(getIntent().getExtras().getString("email_text"))
                .subject("Consulta")
                .build();
        startActivity(emailIntent);
    }

    public void BtnShare_onClick(View view){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Vamos a este lugar.");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
