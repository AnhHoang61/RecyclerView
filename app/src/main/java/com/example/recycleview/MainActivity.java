package com.example.recycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Country> countries;
    private RecyclerView re_country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        countries = new ArrayList<Country>();
        countries.add(new Country(R.drawable.ic_flag_of_vietnam, "Việt Nam", "Hà Nội"));
        countries.add(new Country(R.drawable.ic_flag_of_america, "America", "Washington"));
        countries.add(new Country(R.drawable.ic_flag_of_india, "India", "New Delhi"));
        countries.add(new Country(R.drawable.ic_flag_of_england, "England", "London"));

        CountryAdapter adapter = new CountryAdapter(countries);
        re_country = findViewById(R.id.re_country);
        re_country.setAdapter(adapter);
        re_country.setHasFixedSize(true);
        re_country.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView re_country = findViewById(R.id.re_country);
        re_country.setAdapter(adapter);
        re_country.setHasFixedSize(true);
        re_country.setLayoutManager(new LinearLayoutManager(this));
        re_country.setHasFixedSize(true);
    }
}