package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;

    private List<String> androidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Spinner */
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spinnerAndroid);
        spinner.setOnItemSelectedListener(this);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());
    }

    private void setSpinnerSource() {
        androidVersions = new ArrayList<>();

        androidVersions.add("Cupcake");
        androidVersions.add("Donut");
        androidVersions.add("Eclair");
        androidVersions.add("KitKat");
        androidVersions.add("Pie");
    }

    private ArrayAdapter<String> getSpinnerAdapter() {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, androidVersions);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Toast.makeText(getApplicationContext(), getString(R.string.selected_spinner) + androidVersions.get(pos), Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), R.string.spinner_pick, Toast.LENGTH_LONG).show();
    }
}
