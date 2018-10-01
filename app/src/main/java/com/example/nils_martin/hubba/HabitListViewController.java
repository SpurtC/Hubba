package com.example.nils_martin.hubba;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class HabitListViewController extends AppCompatActivity{

    private List<Habit> habits;
    private ImageView fire;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.habit_list_view);
    }

    public HabitListViewController(User user){
        habits = user.getHabits();
        ImageView
    }

}
