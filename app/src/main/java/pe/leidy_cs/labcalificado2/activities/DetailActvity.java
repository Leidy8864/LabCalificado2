package pe.leidy_cs.labcalificado2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import pe.leidy_cs.labcalificado2.R;

public class DetailActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name = getIntent().getExtras().getString("name_text");

        TextView tv_name = findViewById(R.id.name_text);

        tv_name.setText(name);
    }
}
