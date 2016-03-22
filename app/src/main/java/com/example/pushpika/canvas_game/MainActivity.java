package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void go_page(View view){
        //Intent transition_page = new Intent(this,Question_view.class);
        Intent transition_page = new Intent(this,AnimationActivity.class);
        startActivity(transition_page);
    }
    public void go_question(View view){
        //Intent transition_page = new Intent(this,Question_view.class);
        Intent transition_page = new Intent(this,database_data_entry_initial.class);
        startActivity(transition_page);
    }


}
