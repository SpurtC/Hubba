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

public class Streak extends AppCompatActivity{

    private String days;
    private ImageView streakImage;
    private String pathToImage = "C:\\Users\\User\\Documents\\GitHub\\Hubba\\app\\src\\main\\res\\drawable\\fire.jpg";

    private TextView textTitle;
    private TextView textDays;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.habit_list_view);
    }

    public Streak(Habit habit){
        this.days = String.valueOf(habit.getStreak(habit));
    }
    

}
