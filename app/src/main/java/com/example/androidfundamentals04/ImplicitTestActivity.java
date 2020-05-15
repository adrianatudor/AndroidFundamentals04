package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.androidfundamentals04.R;

public class ImplicitTestActivity extends AppCompatActivity {
    private EditText urlEditText;
    private EditText locationEditText;
    private EditText shareTextEditText;
    private EditText phoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_test);

        urlEditText = findViewById(R.id.editText);
        locationEditText = findViewById(R.id.editText5);
        shareTextEditText = findViewById(R.id.editText6);
        phoneEditText = findViewById(R.id.editText7);
    }

    public void openLinkOnClick(View view) {
        Intent openUrlImplicitIntent = new Intent(Intent.ACTION_VIEW);

        openUrlImplicitIntent.setData(Uri.parse(urlEditText.getText().toString()));
        startActivity(openUrlImplicitIntent);
    }

    public void openLocationOnClick(View view) {
        Intent openLocationImplicitIntent = new Intent(Intent.ACTION_VIEW);
        openLocationImplicitIntent.setData(Uri.parse(locationEditText.getText().toString()));

        if(openLocationImplicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(openLocationImplicitIntent);
        }
    }

    public void shareTextOnClick(View view) {
        Intent shareTextImplicitIntent = new Intent(Intent.ACTION_SEND);
        shareTextImplicitIntent.putExtra(Intent.EXTRA_TEXT, shareTextEditText.getText().toString());
        shareTextImplicitIntent.setType("text/plain");

        if(shareTextImplicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(shareTextImplicitIntent);
        }
    }

    public void callOnClick(View view) {
        Intent callImplicitIntent = new Intent(Intent.ACTION_DIAL);
        callImplicitIntent.setData(Uri.parse(phoneEditText.getText().toString()));

        if(callImplicitIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(callImplicitIntent);
        }
    }
}
