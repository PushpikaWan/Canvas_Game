package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb = new DatabaseHelper(this);
        insertData();
        show_data();

    }

    public void go_page(View view){
        //Intent transition_page = new Intent(this,Question_view.class);
        Intent transition_page = new Intent(this,AnimationActivity.class);
        startActivity(transition_page);
    }
    public void go_question(View view){
        Intent transition_page = new Intent(this,Question_view.class);
        //Intent transition_page = new Intent(this,AnimationActivity.class);
        startActivity(transition_page);
    }

    public void insertData(){
        boolean is_inserted = mydb.insert_data();
        if(is_inserted){
            Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Data inseting failed",Toast.LENGTH_LONG).show();
        }
    }

    public void show_data(){

        Cursor data_obj  = mydb.get_data("Name_tag");
        if (data_obj.getCount()==0){
            Toast.makeText(MainActivity.this,"Nothing to show",Toast.LENGTH_LONG).show();
            show_message("Error","No data found");
            return;
        }
        StringBuffer buffer = new StringBuffer();
        while (data_obj.moveToNext()){
            buffer.append("Tag_ID : "+ data_obj.getString(0)+"\n");
            buffer.append("Tag_Name : "+ data_obj.getString(1)+"\n");
            buffer.append("Tag_Type : "+ data_obj.getString(2)+"\n");
            buffer.append("Tag_DESC : "+ data_obj.getString(3)+"\n");
        }
        show_message("Data",buffer.toString());
        Toast.makeText(MainActivity.this,"Result has been shown",Toast.LENGTH_LONG).show();


    }

    public void show_message(String title, String message){

        AlertDialog.Builder dialog_box = new AlertDialog.Builder(this);
        dialog_box.setCancelable(true);
        dialog_box.setTitle(title);
        dialog_box.setMessage(message);
        dialog_box.show();
    }
}
