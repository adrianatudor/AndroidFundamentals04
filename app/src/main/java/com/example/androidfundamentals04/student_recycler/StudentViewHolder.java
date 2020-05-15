package com.example.androidfundamentals04.student_recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidfundamentals04.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewFirstName;
    private TextView textViewLastName;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        textViewFirstName = itemView.findViewById(R.id.textViewFirstName);
        textViewLastName = itemView.findViewById(R.id.textViewLastName);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }
}
