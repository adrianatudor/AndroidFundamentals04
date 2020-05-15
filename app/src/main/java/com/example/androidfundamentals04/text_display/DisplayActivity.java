package com.example.androidfundamentals04.text_display;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidfundamentals04.R;

public class DisplayActivity extends AppCompatActivity {
    public static String CHOSEN = "Button";
    private Button textOne;
    private Button textTwo;
    private Button textThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textOne = findViewById(R.id.buttonTextOne);
        textTwo = findViewById(R.id.buttonTextTwo);
        textThree = findViewById(R.id.buttonTextThree);
    }

    public void launchNextActivity(View view) {
        Intent intent = new Intent(DisplayActivity.this, LaunchedActivity.class);

        if (textOne.isPressed()) {
            intent.putExtra(CHOSEN, "first");
        } else if (textTwo.isPressed()) {
            intent.putExtra(CHOSEN, "second");
        } else if (textThree.isPressed()) {
            intent.putExtra(CHOSEN, "third");
        }

        startActivity(intent);
    }
}
