package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Week 2 setup*/
        // setContentView(R.layout.activity_main);

        /* Week 3 setup */
        /* FrameLayout */
        // setContentView(R.layout.frame_layout);

        /* ScrollView */
        // setContentView(R.layout.scroll_view);

        /* Week 4 setup */
        /* Recap */
        // setContentView(R.layout.android_challenge1_layout);

        /* Constraint Layout */
        setContentView(R.layout.constraint_layout);
    }
}
