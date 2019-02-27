package com.example.module4homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 extends AppCompatActivity {

    private RecyclerView mRecyclerViewStudents;
    private final static int STUDENTS_NUM = 35;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge2);

        initView();

    }

   private void initView () {

        mRecyclerViewStudents = findViewById(R.id.recyclerview_students);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Challenge2.this);
        mRecyclerViewStudents.setLayoutManager(layoutManager);

        StudentAdapter studentsAdapter = new StudentAdapter(getStudents(), Challenge2.this);
        mRecyclerViewStudents.setAdapter(studentsAdapter);
   }

   private List<Student> getStudents () {

        List<Student> students = new ArrayList<>();
        Student student;

        for (int i = 1; i < STUDENTS_NUM; i++) {

            student = new Student();
            student.setFirstName(getString(R.string.first_name));
            student.setSecondName(getString(R.string.last_name));
            students.add(student);
        }

        return students;

   }
}
