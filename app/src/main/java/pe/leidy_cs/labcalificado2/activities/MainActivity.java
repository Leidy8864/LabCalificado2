package pe.leidy_cs.labcalificado2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.leidy_cs.labcalificado2.R;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.edittext);
    }

    public void Buscar(View view) {
        String dato = textInput.getText().toString();
        if(dato.isEmpty()){
            Toast.makeText(this, "Complete el campos", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this, SearchResultActivity.class);
        intent.putExtra("dato", dato);
        startActivity(intent);
    }
}
