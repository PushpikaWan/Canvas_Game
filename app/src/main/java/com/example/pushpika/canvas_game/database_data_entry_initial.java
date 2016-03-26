package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.nio.channels.NonReadableChannelException;

public class database_data_entry_initial extends AppCompatActivity {

    DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_data_entry_initial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mydb = new DatabaseHelper(this);
        insertData_tags();
        insertData_Question();
        insertData_tag_ques_assist();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void insertData_tag_ques_assist() {
        mydb.insert_tag_que_assist(1,1);
        mydb.insert_tag_que_assist(1,2);
        mydb.insert_tag_que_assist(1,3);
        mydb.insert_tag_que_assist(1,4);
        mydb.insert_tag_que_assist(1,5);

        mydb.insert_tag_que_assist(2,6);
        mydb.insert_tag_que_assist(2,7);
        mydb.insert_tag_que_assist(2,8);
        mydb.insert_tag_que_assist(2,9);
        mydb.insert_tag_que_assist(2,10);

        mydb.insert_tag_que_assist(3,6);
        mydb.insert_tag_que_assist(3,10);
        mydb.insert_tag_que_assist(3,11);
        mydb.insert_tag_que_assist(3,12);
        mydb.insert_tag_que_assist(3,13);
        mydb.insert_tag_que_assist(3,14);
        mydb.insert_tag_que_assist(3,15);
        mydb.insert_tag_que_assist(3,16);

        mydb.insert_tag_que_assist(4,17);
        mydb.insert_tag_que_assist(4,18);
        mydb.insert_tag_que_assist(4,19);
        mydb.insert_tag_que_assist(4,20);
        mydb.insert_tag_que_assist(4,21);
        mydb.insert_tag_que_assist(4,22);
        mydb.insert_tag_que_assist(4,23);
        mydb.insert_tag_que_assist(4,24);
        mydb.insert_tag_que_assist(4,25);
        mydb.insert_tag_que_assist(4,26);

    }


    public void insertData_Question() {
        mydb.insert_Question("Swap ","You need to SWAP two values , x=10 and y=20 using temp variable", "A","5,2,1,3,4","1","3","1");
        mydb.insert_Question("If-Else and isPrime() ","You need to check whether the given number is prime or not", "B","10,9,8,6,7","3","5","1");
        mydb.insert_Question("If-Elseif-else ","you need to use if-elseif and else conditions to put numbers into the correct categories.", "C","10,16,15,11,14,12,6,13","5","12","3");
        mydb.insert_Question("Switch ","you need to print month name when month number entered,if that month number is less than 4,print month name as an output", "D","20,18,23,19,17,22,25,17,24,26,17,21,17","12","16","12");
        
    }

        //
    public void insertData_tags(){

        //keyword is used for mainly use variables

        //question 01 class - A
        mydb.insert_Tag("x=y;\n","MAIN","None"); //id=1
        mydb.insert_Tag("temp=x;\n","MAIN","None"); //id=2
        mydb.insert_Tag("y=temp;\n","MAIN","None"); //id=3
        mydb.insert_Tag("print(x,y)\n","VARIABLE","None"); //id=4
        mydb.insert_Tag("x=10;y=20;\n","VARIABLE","None"); //id=5

        //question 02 class - B
        mydb.insert_Tag("else\n","MAIN","None"); //id=6
        mydb.insert_Tag(" return false\n","VARIABLE","None"); //id=7
        mydb.insert_Tag(" return true\n","VARIABLE","None"); //id=8
        mydb.insert_Tag("(isPrime(x))\n","MAIN","None"); //id=9
        mydb.insert_Tag("if","MAIN","None");//id=10

        //question 03 class - C
        //mydb.insert_Tag("if","MAIN","None"); //id=10
        //mydb.insert_Tag("else","MAIN","None"); //id=6

        mydb.insert_Tag("Elseif","MAIN","None"); //id=11
        mydb.insert_Tag(" print(\"x is less than 20\");\n","VARIABLE","None"); //id=12
        mydb.insert_Tag(" print(\"x>20 or x=20\");\n","VARIABLE","None"); //id=13
        mydb.insert_Tag("(x<20)\n","VARIABLE","None"); //id=14
        mydb.insert_Tag(" print(\"x is less than 10\");\n","VARIABLE","None"); //id=15
        mydb.insert_Tag("(x<10)\n","VARIABLE","None"); //id=16


        //question 04 class - D

        mydb.insert_Tag("break\n","MAIN","None");//id=17
        mydb.insert_Tag("(month)\n","VARIABLE","None");//id=18
        mydb.insert_Tag("print('January')\n","VARIABLE","None");//id=19
        mydb.insert_Tag("switch","MAIN","None"); //id=20
        mydb.insert_Tag("default:","MAIN","None");//id=21
        mydb.insert_Tag("case 2:","MAIN","None");//id=22
        mydb.insert_Tag("case 1:","MAIN","None");//id=23
        mydb.insert_Tag("case 3:","MAIN","None");//id=24
        mydb.insert_Tag("print('February')\n","VARIABLE","None"); //id=25
        mydb.insert_Tag("print('March')\n","VARIABLE","None"); //id=26




        /*boolean is_inserted = mydb.insert_Tag();
        if(is_inserted){
            Toast.makeText(MainActivity.this,"Data inserted",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Data inseting failed",Toast.LENGTH_LONG).show();
        }
        */
    }

}
