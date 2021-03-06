package com.example.nils_martin.hubba;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

public class Notification extends AppCompatActivity{
    public void Alert (String title, String message, String pathToIcon){
        AlertDialog.Builder Alert = new AlertDialog.Builder(this);
        Alert.setTitle(title).setMessage(message).setIcon(Drawable.createFromPath(pathToIcon)).create();
        Alert.show().setCanceledOnTouchOutside(true);
    }
}
