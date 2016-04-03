package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void go_page(View view){
        final Animation animation_translate_1 = AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        //Intent transition_page = new Intent(this,Question_view.class);
        Intent transition_page = new Intent(this,database_data_entry_initial.class);
        //Intent transition_page = new Intent(this,AnimationActivity.class);
        view.startAnimation(animation_translate_1);
        startActivity(transition_page);
        finish();
    }
    public void go_question(View view){
        final Animation animation_translate_2 = AnimationUtils.loadAnimation(this,R.anim.translate_anim);
        Intent transition_page = new Intent(this,Question_view.class);
        //Intent transition_page = new Intent(this,database_data_entry_initial.class);
        view.startAnimation(animation_translate_2);
        startActivity(transition_page);
        finish();
    }



}
