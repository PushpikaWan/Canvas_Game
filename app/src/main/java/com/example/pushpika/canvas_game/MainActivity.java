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
        //insertData_tags();
        //insertData_Question();
        //insertData_tag_ques_assist();
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

    public void insertData_tag_ques_assist() {
        mydb.insert_tag_que_assist(1,5);
        mydb.insert_tag_que_assist(1,3);
        mydb.insert_tag_que_assist(1,25);
        mydb.insert_tag_que_assist(1,18);
        mydb.insert_tag_que_assist(1,4);

        mydb.insert_tag_que_assist(2,5);
        mydb.insert_tag_que_assist(2,3);
        mydb.insert_tag_que_assist(2,25);
        mydb.insert_tag_que_assist(2,18);
        mydb.insert_tag_que_assist(2,4);
        mydb.insert_tag_que_assist(2,1);

        mydb.insert_tag_que_assist(3,5);
        mydb.insert_tag_que_assist(3,3);
        mydb.insert_tag_que_assist(3,25);
        mydb.insert_tag_que_assist(3,18);
        mydb.insert_tag_que_assist(3,4);
        mydb.insert_tag_que_assist(3,1);
        mydb.insert_tag_que_assist(3,15);

        mydb.insert_tag_que_assist(4,5);
        mydb.insert_tag_que_assist(4,3);
        mydb.insert_tag_que_assist(4,25);
        mydb.insert_tag_que_assist(4,18);
        mydb.insert_tag_que_assist(4,4);
        mydb.insert_tag_que_assist(4,1);
        mydb.insert_tag_que_assist(4,15);
        mydb.insert_tag_que_assist(4,16);

        mydb.insert_tag_que_assist(5,5);
        mydb.insert_tag_que_assist(5,3);
        mydb.insert_tag_que_assist(5,25);
        mydb.insert_tag_que_assist(5,18);
        mydb.insert_tag_que_assist(5,4);
        mydb.insert_tag_que_assist(5,1);
        mydb.insert_tag_que_assist(5,15);
        mydb.insert_tag_que_assist(5,16);
        mydb.insert_tag_que_assist(5,2);
    }


    public void insertData_Question() {

        mydb.insert_Question("A","5,3,25,18,4");//if(x.isPrime())...
        mydb.insert_Question("B","5,3,25,18,4,1");//if(x.isPrime()){...
        mydb.insert_Question("C","5,3,25,18,4,1,15");//if(x.isPrime()){return...
        mydb.insert_Question("D","5,3,25,18,4,1,15,16");//if(x.isPrime()){return true...
        mydb.insert_Question("E","5,3,25,18,4,1,15,16,2");//if(x.isPrime()){return true}...
        mydb.insert_Question("F","5,3,25,18,4,1,15,16,2,6");//if(x.isPrime()){return true}else...
        mydb.insert_Question("G","5,3,25,18,4,1,15,16,2,6,1");//if(x.isPrime())else{...
        mydb.insert_Question("H","5,3,25,18,4,1,15,16,2,6,1,15");//if(x.isPrime())else{return...
        mydb.insert_Question("I","5,3,25,18,4,1,15,16,2,6,1,15,17");//if(x.isPrime())else{return false...
        mydb.insert_Question("J","5,3,25,18,4,1,15,16,2,6,1,15,17,2");//if(x.isPrime())else{return false}...

    }


    public void insertData_tags(){

        //parenthesis
        mydb.insert_Tag("{","KEYWORD","None");
        mydb.insert_Tag("}","KEYWORD","None");
        mydb.insert_Tag("(","KEYWORD","None");
        mydb.insert_Tag(")","KEYWORD","None");

        mydb.insert_Tag("if","KEYWORD","description of if condition");
        mydb.insert_Tag("else","KEYWORD","description of else condition");
        mydb.insert_Tag("else if","KEYWORD","description of else if condition");
        mydb.insert_Tag("swap","KEYWORD","description of swap");
        mydb.insert_Tag("for","KEYWORD","description of for condition");
        mydb.insert_Tag("while","KEYWORD","description of while condition");
        mydb.insert_Tag("break","KEYWORD","description of break condition");
        mydb.insert_Tag("continue","KEYWORD","description of continue condition");
        mydb.insert_Tag("switch","KEYWORD","description of for switch");
        mydb.insert_Tag("case","KEYWORD","description of for use with switch");
        mydb.insert_Tag("return","KEYWORD","description of return statement");
        mydb.insert_Tag("true","KEYWORD","None");
        mydb.insert_Tag("false","KEYWORD","None");

        mydb.insert_Tag(".isPrime()","VARIABLE","NONE");
        mydb.insert_Tag(".isNumber()","VARIABLE","NONE");
        mydb.insert_Tag(".isOdd()","VARIABLE","NONE");
        mydb.insert_Tag(".isEven()","VARIABLE","NONE");
        mydb.insert_Tag(".isAlphaNumeric()","VARIABLE","NONE");
        mydb.insert_Tag(".isUpperCase","VARIABLE","NONE");
        mydb.insert_Tag(".isLowerCase","VARIABLE","NONE");

        mydb.insert_Tag("x","VARIABLE","NONE");
        mydb.insert_Tag("y","VARIABLE","NONE");
        mydb.insert_Tag("z","VARIABLE","NONE");




        /*boolean is_inserted = mydb.insert_Tag();
        if(is_inserted){
            Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Data inseting failed",Toast.LENGTH_LONG).show();
        }
        */
    }

    public void show_data(){

        Cursor data_obj  = mydb.get_data("Question");
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
            //buffer.append("Tag_DESC : "+ data_obj.getString(3)+"\n");
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
