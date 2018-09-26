package pe.leidy_cs.labcalificado2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import pe.leidy_cs.labcalificado2.R;
import pe.leidy_cs.labcalificado2.adapters.CompanyAdapter;
import pe.leidy_cs.labcalificado2.models.Company;
import pe.leidy_cs.labcalificado2.repositories.CompanyRepository;

public class SearchResultActivity extends AppCompatActivity {

    private RecyclerView companiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        companiesList = (RecyclerView)findViewById(R.id.companies_list);
        companiesList.setLayoutManager(new LinearLayoutManager(this));

        CompanyAdapter adapter = new CompanyAdapter();

        List<Company> companies = CompanyRepository.getCompanies();
        adapter.setCompanies(companies, this);
        companiesList.setAdapter(adapter);
    }
}
