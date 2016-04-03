package com.example.pushpika.canvas_game;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;


public class AnimationActivity extends AppCompatActivity {
    //Activity_animation_layout activity_animation_layout;
    board_layout bd_layout;
    public static int position_width=0,position_height=0,cur_position=1,is_increment=-1,current_pos=1,target_pos=1;
    public static String target_class="A"; // A for

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().hide();
        //activity_animation_layout = new Activity_animation_layout(this);

        bd_layout = new board_layout(this);
        bd_layout.setBackgroundResource(R.drawable.boardnew);
        getSupportActionBar().hide();
        //setContentView(activity_animation_layout);
        setContentView(bd_layout);
        Log.i("TAG", "current pos-- "+ AnimationActivity.current_pos);
        Log.i("TAG", "target pos" + AnimationActivity.target_pos);
        Log.i("TAG", "Target class " + AnimationActivity.target_class);
        Handler handler = new Handler();
        final Intent intent = new Intent(this, MainActivity.class);
        handler.postDelayed(new Runnable() {
            public void run() {
                startActivity(intent);
                bd_layout.setBackgroundColor(Color.WHITE);
                finish();
            }
        }, 4000);

    }
}
