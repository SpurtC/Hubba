package com.example.nils_martin.hubba;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddHabitController extends AppCompatActivity {

    EditText habit;
    Button saveBtn;
    Button undoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_habit);
        init();
    }

    public void init() {
        habit = (EditText) findViewById(R.id.habitInput);
        saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Habit createdHabit = new Habit(habit.getText().toString());
                MainActivityController.habits.add(createdHabit);

                finish();
            }
        });

        undoBtn = (Button) findViewById(R.id.undoBtn);
        undoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
