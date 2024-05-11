package com.example.library_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        Button btnAddBook = findViewById(R.id.btnAddbBook);
        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Method to handle button click for adding a member
    public void onClick(View v) {
        // Navigate to MainActivity_2
        Intent intent = new Intent(TaskActivity.this, MainActivity_2.class);
        startActivity(intent);
    }
}