package com.example.pushpika.canvas_game;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;


public class AnimationActivity extends AppCompatActivity {
    Activity_animation_layout activity_animation_layout;
    public static int position_width=0,position_height=0,cur_position=1,is_increment=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().hide();
        activity_animation_layout = new Activity_animation_layout(this);
        getSupportActionBar().hide();
        setContentView(activity_animation_layout);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);




    }
}
