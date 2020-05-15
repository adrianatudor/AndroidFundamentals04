package com.example.androidfundamentals04;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {
    private TextView textViewReceiverUp;
    private TextView textViewReceiverDown;
    private EditText editTextReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        textViewReceiverUp = findViewById(R.id.textViewReceiverUp);
        textViewReceiverDown = findViewById(R.id.textViewReceiverDown);
        editTextReceiver = findViewById(R.id.editTextReceiver);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String messageFromActivity = bundle.getString(SenderActivity.ECHO);

            if (messageFromActivity != null) {
                textViewReceiverUp.setText("Message received");
                textViewReceiverDown.setText(messageFromActivity);
            }
        }
    }

    public void replySenderOnClick(View view) {
        String response = editTextReceiver.getText().toString();

        Intent intent = new Intent();

        intent.putExtra(SenderActivity.RESPONSE_ECHO, response);

        setResult(RESULT_OK, intent);

        finish();
    }
}
