package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.nio.channels.NonReadableChannelException;

public class database_data_entry_initial extends AppCompatActivity {

    DatabaseHelper mydb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_data_entry_initial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn = (Button) findViewById(R.id.go_firstpage);
        btn.setVisibility(View.GONE);
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

    public void go_first_page(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
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

        mydb.insert_tag_que_assist(5,27);
        mydb.insert_tag_que_assist(5,28);
        mydb.insert_tag_que_assist(5,29);
        mydb.insert_tag_que_assist(5,30);
        mydb.insert_tag_que_assist(5,31);
        mydb.insert_tag_que_assist(5,32);
        mydb.insert_tag_que_assist(5,33);
        mydb.insert_tag_que_assist(5,34);
        mydb.insert_tag_que_assist(5,35);

        mydb.insert_tag_que_assist(6,36);
        mydb.insert_tag_que_assist(6,37);
        mydb.insert_tag_que_assist(6,38);
        mydb.insert_tag_que_assist(6,39);
        mydb.insert_tag_que_assist(6,40);
        mydb.insert_tag_que_assist(6,41);
        mydb.insert_tag_que_assist(6,42);
        mydb.insert_tag_que_assist(6,43);
        mydb.insert_tag_que_assist(6,44);
        mydb.insert_tag_que_assist(6,45);
        mydb.insert_tag_que_assist(6,46);
        mydb.insert_tag_que_assist(6,47);
        mydb.insert_tag_que_assist(6,48);
        mydb.insert_tag_que_assist(6,49);
        mydb.insert_tag_que_assist(6,50);
        mydb.insert_tag_que_assist(6,51);


        mydb.insert_tag_que_assist(7,52);
        mydb.insert_tag_que_assist(7,53);
        mydb.insert_tag_que_assist(7,54);
        mydb.insert_tag_que_assist(7,55);
        mydb.insert_tag_que_assist(7,56);
        mydb.insert_tag_que_assist(7,57);
        mydb.insert_tag_que_assist(7,58);
        mydb.insert_tag_que_assist(7,59);
        mydb.insert_tag_que_assist(7,60);
        mydb.insert_tag_que_assist(7,61);
        mydb.insert_tag_que_assist(7,62);
        mydb.insert_tag_que_assist(7,63);
        mydb.insert_tag_que_assist(7,64);
        mydb.insert_tag_que_assist(7,65);
        mydb.insert_tag_que_assist(7,66);
        mydb.insert_tag_que_assist(7,67);

        mydb.insert_tag_que_assist(8,68);
        mydb.insert_tag_que_assist(8,69);
        mydb.insert_tag_que_assist(8,70);
        mydb.insert_tag_que_assist(8,71);
        mydb.insert_tag_que_assist(8,72);
        mydb.insert_tag_que_assist(8,73);
        mydb.insert_tag_que_assist(8,74);
        mydb.insert_tag_que_assist(8,75);
        mydb.insert_tag_que_assist(8,76);
        mydb.insert_tag_que_assist(8,77);
        mydb.insert_tag_que_assist(8,78);
        mydb.insert_tag_que_assist(8,79);
        mydb.insert_tag_que_assist(8,80);
        mydb.insert_tag_que_assist(8,81);
        mydb.insert_tag_que_assist(8,82);
        mydb.insert_tag_que_assist(8,83);
        mydb.insert_tag_que_assist(8,84);
        mydb.insert_tag_que_assist(8,85);
        mydb.insert_tag_que_assist(8,86);
        mydb.insert_tag_que_assist(8,87);
        mydb.insert_tag_que_assist(8,88);

        //after all data stored
        btn.setVisibility(View.VISIBLE);
    }


    public void insertData_Question() {
        mydb.insert_Question("Swap ","SWAP two values , x=10 and y=20 using temp variable", "A","5,2,1,3,4","1","3","1","B","A");
        mydb.insert_Question("If-Else and isPrime() ","Check whether the given number is prime or not", "B","10,9,8,6,7","3","5","1","C","A");
        mydb.insert_Question("If-Elseif-else ","Use if-elseif and else conditions to put numbers into the correct categories.", "C","10,16,15,11,14,12,6,13","5","12","3","D","B");
        mydb.insert_Question("Switch ","Print month name when month number entered,if that month number is less than 4,print month name as an output", "D","20,18,23,19,17,22,25,17,24,26,17,21,17","12","16","12","E","D");
        mydb.insert_Question("for loop ","Print numbers one to ten using for loop", "E","29,33,27,31,30,35,30,31,32,28,34","16","20","12","F","D");
        mydb.insert_Question("for-each ","Create integer array list and add 1,2 to the list,then remove all numbers in list", "F","36,37,44,38,40,39,51,36,37,44,38,41,42,40,48,41,49,42,40,48,41,50,42,47,41,44,45,46,40,42,40,43,41,45,42","20","25","16","G","E");
        mydb.insert_Question("do-while ","Print numbers 10 to 0 using do while loop(use semi colan at end of the lines )", "G","65,53,52,64,67,66,56,63,55,53,54,67,53,52,53,57,60,67,62,59,55,53,61,58,54,67","25","30","16","H","E");
        mydb.insert_Question("while-do ","Print Fibonacci Series using while loop until and equal to n numbers", "H","71,70,80,88,81,69,83,68,82,79,74,81,73,84,75,72,81,78,87,77,83,76,82,72,84,83,78,81,77,75,77,81,72,83,79,86,79,85","30","36","25","H","G");
        //change promotion class in while -do
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


        //question 05 class - E

        mydb.insert_Tag("(","VARIABLE","None");//id=27
        mydb.insert_Tag(") \n","VARIABLE","None");//id=28
        mydb.insert_Tag("int i = 0;\n","VARIABLE","None");//id=29
        mydb.insert_Tag(";","MAIN","None");//id=30
        mydb.insert_Tag("i","VARIABLE","None");//id=31
        mydb.insert_Tag("++","MAIN","None");//id=32
        mydb.insert_Tag("for","MAIN","None");//id=33
        mydb.insert_Tag("print i;","VARIABLE","None");//id=34
        mydb.insert_Tag("i<=10","VARIABLE","None");//id=35


        //question 06 class - F

        mydb.insert_Tag("List ","MAIN","None");//id=36
        mydb.insert_Tag("<","VARIABLE","None");//id=37
        mydb.insert_Tag("> ","VARIABLE","None");//id=38
        mydb.insert_Tag(" = ","VARIABLE","None");//id=39
        mydb.insert_Tag("list","VARIABLE","None");//id=40
        mydb.insert_Tag("(","VARIABLE","None");//id=41
        mydb.insert_Tag(")\n","VARIABLE","None");//id=42
        mydb.insert_Tag(".Remove","MAIN","None");//id=43
        mydb.insert_Tag("int","VARIABLE","None");//id=44
        mydb.insert_Tag(" element ","MAIN","None");//id=45
        mydb.insert_Tag("in ","MAIN","None");//id=46
        mydb.insert_Tag("foreach","MAIN","None");//id=47
        mydb.insert_Tag(".Add","MAIN","None");//id=48
        mydb.insert_Tag("1","VARIABLE","None");//id=49
        mydb.insert_Tag("2","VARIABLE","None");//id=50
        mydb.insert_Tag("new ","MAIN","None");//id=51


        //question 07 class - G

        mydb.insert_Tag("=","VARIABLE","None");//id=52
        mydb.insert_Tag("i","VARIABLE","None");//id=53
        mydb.insert_Tag(")","VARIABLE","None");//id=54
        mydb.insert_Tag("(","VARIABLE","None");//id=55
        mydb.insert_Tag("{\n","VARIABLE","None");//id=56
        mydb.insert_Tag("-","VARIABLE","None");//id=57
        mydb.insert_Tag("0","VARIABLE","None");//id=58
        mydb.insert_Tag("while","MAIN","None");//id=59
        mydb.insert_Tag("1","VARIABLE","None");//id=60
        mydb.insert_Tag(">","VARIABLE","None");//id=61
        mydb.insert_Tag("}","VARIABLE","None");//id=62
        mydb.insert_Tag("print","MAIN","None");//id=63
        mydb.insert_Tag("10 ","VARIABLE","None");//id=64
        mydb.insert_Tag("int","VARIABLE","None");//id=65
        mydb.insert_Tag("do","MAIN","None");//id=66
        mydb.insert_Tag(";\n","VARIABLE","None");//id=67


        //question 08 class - H

        mydb.insert_Tag("while","MAIN","None");//id=68
        mydb.insert_Tag("3","VARIABLE","None");//id=69
        mydb.insert_Tag("prev=0,curr=1,term,n,i","VARIABLE","None");//id=70
        mydb.insert_Tag("int","VARIABLE","None");//id=71
        mydb.insert_Tag("term","VARIABLE","None");//id=72
        mydb.insert_Tag("n","VARIABLE","None");//id=73
        mydb.insert_Tag("<","VARIABLE","None");//id=74
        mydb.insert_Tag("{\n","VARIABLE","None");//id=75
        mydb.insert_Tag("print","MAIN","None");//id=76
        mydb.insert_Tag("curr","VARIABLE","None");//id=77
        mydb.insert_Tag("prev","VARIABLE","None");//id=78
        mydb.insert_Tag("i","VARIABLE","None");//id=79
        mydb.insert_Tag(";\n","VARIABLE","None");//id=80
        mydb.insert_Tag("=","VARIABLE","None");//id=81
        mydb.insert_Tag("(","VARIABLE","None");//id=82
        mydb.insert_Tag(";\n","VARIABLE","None");//id=83
        mydb.insert_Tag(")","VARIABLE","None");//id=84
        mydb.insert_Tag("}","VARIABLE","None");//id=85
        mydb.insert_Tag("++","MAIN","None");//id=86
        mydb.insert_Tag("+","VARIABLE","None");//id=87
        mydb.insert_Tag("i","VARIABLE","None");//id=88











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
