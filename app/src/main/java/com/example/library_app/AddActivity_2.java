package com.example.library_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity_2 extends AppCompatActivity {

    EditText name_input, tel_num_input;
    Button add_button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_2);

        name_input = findViewById(R.id.name_input);
        tel_num_input = findViewById(R.id.tel_num_input);
        add_button_2 = findViewById(R.id.add_button);
        add_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity_2.this);
                myDB.addMember(name_input.getText().toString().trim(),
                        tel_num_input.getText().toString().trim()
                );
            }
        });
    }
}
