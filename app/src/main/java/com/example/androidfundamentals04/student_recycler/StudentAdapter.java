package com.example.androidfundamentals04.student_recycler;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidfundamentals04.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        
        return new StudentViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        
        holder.getTextViewFirstName().setText(currentStudent.getFirstName());
        holder.getTextViewLastName().setText(currentStudent.getLastName());
        
        if (position % 2 != 0) {
            holder.itemView.setBackgroundColor(Color.parseColor("#C0C0C0"));
        }
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
