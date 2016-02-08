package com.example.mars.group_project_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerAdvisor beerAdvisor = new BeerAdvisor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.beercolorspinner);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = beerAdvisor.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for(String brandname : brandsList) {
            brandsFormatted.append(brandname).append('\n');

        }
        brands.setText(brandsFormatted);
    }
}
