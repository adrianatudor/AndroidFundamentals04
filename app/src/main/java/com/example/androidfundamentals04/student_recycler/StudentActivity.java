package com.example.androidfundamentals04.student_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.androidfundamentals04.R;

import java.util.ArrayList;
import java.util.List;

public class StudentActivity extends AppCompatActivity {
    private List<Student> students;
    private RecyclerView recyclerViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        getStudents();
        recyclerViewStudent = this.findViewById(R.id.recyclerViewStudents);
        setLayoutManager(recyclerViewStudent);
        setAdapter(recyclerViewStudent);
    }

    private void getStudents() {
        Student student;
        students = new ArrayList<>();

        for (int i = 0; i < 30; ++i) {
            student = new Student();

            student.setFirstName("FirstName " + i);
            student.setLastName("LastName " + i);
        }
    }

    private void setLayoutManager(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerView) {
        StudentAdapter studentAdapter = new StudentAdapter(students);

        recyclerView.setAdapter(studentAdapter);
    }
}
