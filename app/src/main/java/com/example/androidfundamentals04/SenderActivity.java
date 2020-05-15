package com.example.androidfundamentals04;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SenderActivity extends AppCompatActivity {
    public static final String ECHO = "echo";
    public static final int ECHO_CHANNEL = 255;
    public static final String RESPONSE_ECHO = "responseEcho";

    private TextView textViewSenderUp;
    private TextView textViewSenderDown;
    private EditText editTextSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        textViewSenderUp = findViewById(R.id.textViewSenderUp);
        textViewSenderDown = findViewById(R.id.textViewSenderDown);
        editTextSender = findViewById(R.id.editTextSender);
    }

    public void sendMessageOnClick(View view) {
        Intent intent = new Intent(SenderActivity.this, ReceiverActivity.class);

        intent.putExtra(ECHO, editTextSender.getText().toString());
        startActivityForResult(intent, ECHO_CHANNEL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ECHO_CHANNEL && resultCode == RESULT_OK) {
            String resultFromReceiver= data.getStringExtra(RESPONSE_ECHO);

            textViewSenderUp.setText("Reply received");
            textViewSenderDown.setText(resultFromReceiver);
        }
    }
}
