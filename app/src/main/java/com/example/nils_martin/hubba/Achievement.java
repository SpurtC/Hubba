package com.example.nils_martin.hubba;

import android.widget.ImageView;

public abstract class Achievement {
    //private User user;
    private String title = "";
    private Boolean isAchieved = false;
    private ImageView achievementImage;

    Achievement(String title){
        this.title = title;
    }

    public void setAchieved(Boolean achieved) {
        isAchieved = achieved;
    }

    public void assessAchievement(){
        
    }
}
