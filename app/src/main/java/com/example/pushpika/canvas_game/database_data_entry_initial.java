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


        mydb.insert_tag_que_assist(6,35);
        mydb.insert_tag_que_assist(6,36);
        mydb.insert_tag_que_assist(6,37);
        mydb.insert_tag_que_assist(6,38);
        mydb.insert_tag_que_assist(6,39);
        mydb.insert_tag_que_assist(6,40);
        mydb.insert_tag_que_assist(6,41);
        mydb.insert_tag_que_assist(6,42);
        mydb.insert_tag_que_assist(6,43);


        mydb.insert_tag_que_assist(7,44);
        mydb.insert_tag_que_assist(7,45);
        mydb.insert_tag_que_assist(7,46);
        mydb.insert_tag_que_assist(7,47);
        mydb.insert_tag_que_assist(7,48);
        mydb.insert_tag_que_assist(7,49);
        mydb.insert_tag_que_assist(7,50);
        mydb.insert_tag_que_assist(7,51);
        mydb.insert_tag_que_assist(7,52);

        mydb.insert_tag_que_assist(8,53);
        mydb.insert_tag_que_assist(8,54);
        mydb.insert_tag_que_assist(8,55);
        mydb.insert_tag_que_assist(8,56);
        mydb.insert_tag_que_assist(8,57);
        mydb.insert_tag_que_assist(8,58);


        mydb.insert_tag_que_assist(9,59);
        mydb.insert_tag_que_assist(9,60);
        mydb.insert_tag_que_assist(9,61);
        mydb.insert_tag_que_assist(9,62);
        mydb.insert_tag_que_assist(9,63);
        mydb.insert_tag_que_assist(9,64);
        mydb.insert_tag_que_assist(9,65);
        mydb.insert_tag_que_assist(9,66);


        mydb.insert_tag_que_assist(10,67);
        mydb.insert_tag_que_assist(10,68);
        mydb.insert_tag_que_assist(10,69);
        mydb.insert_tag_que_assist(10,70);
        mydb.insert_tag_que_assist(10,71);
        mydb.insert_tag_que_assist(10,72);
        mydb.insert_tag_que_assist(10,73);
        mydb.insert_tag_que_assist(10,74);
        mydb.insert_tag_que_assist(10,75);


        mydb.insert_tag_que_assist(11,76);
        mydb.insert_tag_que_assist(11,77);
        mydb.insert_tag_que_assist(11,78);
        mydb.insert_tag_que_assist(11,79);
        mydb.insert_tag_que_assist(11,80);
        mydb.insert_tag_que_assist(11,81);
        mydb.insert_tag_que_assist(11,82);
        mydb.insert_tag_que_assist(11,83);
        mydb.insert_tag_que_assist(11,84);
        mydb.insert_tag_que_assist(11,85);
        mydb.insert_tag_que_assist(11,86);
        mydb.insert_tag_que_assist(11,87);
        mydb.insert_tag_que_assist(11,88);
        mydb.insert_tag_que_assist(11,89);
        mydb.insert_tag_que_assist(11,90);


        mydb.insert_tag_que_assist(12,91);
        mydb.insert_tag_que_assist(12,92);
        mydb.insert_tag_que_assist(12,93);
        mydb.insert_tag_que_assist(12,94);
        mydb.insert_tag_que_assist(12,95);
        mydb.insert_tag_que_assist(12,96);
        mydb.insert_tag_que_assist(12,97);
        mydb.insert_tag_que_assist(12,98);
        mydb.insert_tag_que_assist(12,99);



        mydb.insert_tag_que_assist(13,100);
        mydb.insert_tag_que_assist(13,101);
        mydb.insert_tag_que_assist(13,102);
        mydb.insert_tag_que_assist(13,103);
        mydb.insert_tag_que_assist(13,104);
        mydb.insert_tag_que_assist(13,105);
        mydb.insert_tag_que_assist(13,106);
        mydb.insert_tag_que_assist(13,107);
        mydb.insert_tag_que_assist(13,108);
        mydb.insert_tag_que_assist(13,109);
        mydb.insert_tag_que_assist(13,110);
        mydb.insert_tag_que_assist(13,111);
        mydb.insert_tag_que_assist(13,112);
        mydb.insert_tag_que_assist(13,113);
        mydb.insert_tag_que_assist(13,114);


        mydb.insert_tag_que_assist(14,115);
        mydb.insert_tag_que_assist(14,116);
        mydb.insert_tag_que_assist(14,117);
        mydb.insert_tag_que_assist(14,118);
        mydb.insert_tag_que_assist(14,119);
        mydb.insert_tag_que_assist(14,120);
        mydb.insert_tag_que_assist(14,121);
        mydb.insert_tag_que_assist(14,122);
        mydb.insert_tag_que_assist(14,123);
        mydb.insert_tag_que_assist(14,124);
        mydb.insert_tag_que_assist(14,125);
        mydb.insert_tag_que_assist(14,126);
        mydb.insert_tag_que_assist(14,127);
        mydb.insert_tag_que_assist(14,128);
        mydb.insert_tag_que_assist(14,129);



        mydb.insert_tag_que_assist(15,130);
        mydb.insert_tag_que_assist(15,131);
        mydb.insert_tag_que_assist(15,132);
        mydb.insert_tag_que_assist(15,133);
        mydb.insert_tag_que_assist(15,134);
        mydb.insert_tag_que_assist(15,135);
        mydb.insert_tag_que_assist(15,136);
        mydb.insert_tag_que_assist(15,137);
        mydb.insert_tag_que_assist(15,138);
        mydb.insert_tag_que_assist(15,139);
        mydb.insert_tag_que_assist(15,140);
        mydb.insert_tag_que_assist(15,141);


        //after all data stored
        btn.setVisibility(View.VISIBLE);
    }


    public void insertData_Question() {
        mydb.insert_Question("Swap ","SWAP two values , x=10 and y=20 using temp variable", "A","5,2,1,3,4","1","3","1","B","A");
        mydb.insert_Question("If-Else and isPrime() ","Check whether your score is prime or not", "B","10,9,8,6,7","3","5","1","C","A");
        mydb.insert_Question("If-Elseif-else ","Use if-elseif and else conditions to put numbers into the correct categories.", "C","10,16,15,11,14,12,6,13","5","12","3","D","B");
        mydb.insert_Question("Switch ","Print month name when month number entered,if that month number is less than 4,print month name as an output", "D","20,18,23,19,17,22,25,17,24,26,17,21,17","12","20","12","E","D");
        mydb.insert_Question("for loop ","Print even numbers up to your score using for loop", "E","30,34,27,29,33,28,32","20","25","12","F","D");
        mydb.insert_Question("for-each ","Get the sum of this array using for-each loop", "F","41,39,35,43,37","25","30","20","G","E");
        mydb.insert_Question("do-while ","Print numbers 10 to 0 using do while loop", "G","47,48,44,46,45,52","30","35","30","H","G");
        mydb.insert_Question("while-do ","Print Fibonacci Series using while loop until your score","H","58,53,56,54,57,55","35","45","30","I","G");
        mydb.insert_Question("Break statement ","Print the 'Algo' word fragment from 'Algorithm' word using break statement", "I","65,60,64,59,61,66,62","45","50","45","J","I");
        mydb.insert_Question("Continue statement ","Print 'gain' word from 'grain' ", "J","72,74,71,67,75,69,73","50","55","45","K","I");
        mydb.insert_Question("Nested for loop","Print prime number up to your position","K","82,81,87,80,83,81,85,76,89,77,79,86,77,88,90","55","62","50","L","J");
        mydb.insert_Question("pattern-1","Print below pattern.\n1111\n" +"1     1\n"+"1     1\n"+"1     1\n" +"1111","L","94,93,94,98,92,97,99,91,95,96","62","72","55","M","K");
        mydb.insert_Question("Palindrome number","Implement an algorithm for check input (number) is palindrome or not.","M","106,110,112,100,105,101,109,102,107,103,108,111","72","80","72","N","M");
        mydb.insert_Question("Sentence Capitalizing","Write a program that accepts sequence of lines as input and prints the lines after making all characters in the sentence capitalized.","N","120,127,124,129,115,119,116,123,125,121,118,128,126,122","80","90","80","O","N");
        mydb.insert_Question("Bubble sort","Implement the bubble sort algorithm","O","139,133,138,134,141,134,140,132,136,135,130,137","90","100","80","P","N");

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
        mydb.insert_Tag("(isPrime(myScore))\n","MAIN","None"); //id=9
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


        mydb.insert_Tag("i<=myScore;","VARIABLE","None"); //id =27
        mydb.insert_Tag("i%2== 0) \n","VARIABLE","None"); //id=28
        mydb.insert_Tag("i++) { \n","MAIN","None");  //id=29
        mydb.insert_Tag("for ( ","MAIN","None"); //id=30
          mydb.insert_Tag("i>=myScore;","VARIABLE","None"); //id =31
        mydb.insert_Tag("print(i); }\n","VARIABLE","None"); //id=32
        mydb.insert_Tag("if( ","MAIN","None"); //id=33
        mydb.insert_Tag("i=0; ","VARIABLE","None");//id=34

        //question 06 class - F


        mydb.insert_Tag(" item in data ) { \n","VARIABLE","None");//id=35
        mydb.insert_Tag("sum=+data; }\n","VARIABLE","None");//id=36
        mydb.insert_Tag("print(sum); \n","VARIABLE","None");//id=37
          mydb.insert_Tag("print(item) \n","VARIABLE","None");//id=38
        mydb.insert_Tag("for-each( ","MAIN","None");//id=39
          mydb.insert_Tag("sum =+item; } \n","VARIABLE","None");//id=40
        mydb.insert_Tag("data =[20,30,40,50,60]; sum=0; \n","VARIABLE","None");//id=41
          mydb.insert_Tag(" data in item ) { \n","VARIABLE","None");//id=42
        mydb.insert_Tag("sum = sum+item; }\n","VARIABLE","None");//id=43

        //41,39,35,43,37

        //question 07 class - G

        mydb.insert_Tag("print(x); \n","VARIABLE","None"); //id= 44
        mydb.insert_Tag("} while ","MAIN","None"); //id= 45
        mydb.insert_Tag("x = x-1; \n","VARIABLE","None"); //id=46
        mydb.insert_Tag("x = 10; \n","VARIABLE","None"); //id= 47
        mydb.insert_Tag("do{ \n","MAIN","None"); //id= 48
          mydb.insert_Tag("(x < 0); \n","VARIABLE","None"); //id= 49
          mydb.insert_Tag("x = x+1; \n","VARIABLE","None"); //id= 50
          mydb.insert_Tag("x = 9; \n","VARIABLE","None"); //id= 51
        mydb.insert_Tag("(x >= 0); \n","VARIABLE","None"); //id= 52

        //question 08 class - H

        mydb.insert_Tag("while (a<=myScore) \n","MAIN","None");//id=53
          mydb.insert_Tag("temp =b; \n","VARIABLE","None");//id=54
        mydb.insert_Tag("a = temp; \n","VARIABLE","None");//id=55
        mydb.insert_Tag("print(a); \n","VARIABLE","None");//id=56
        mydb.insert_Tag("b =a+b; \n","VARIABLE","None");//id=57
        mydb.insert_Tag("a=0;b=1; \n","VARIABLE","None");//id=58




        //question 09 class - I

        mydb.insert_Tag("letter == ","VARIABLE","None");//id=59
        mydb.insert_Tag("letter in 'ALGORITHM' )\n","VARIABLE","None");//id=60
        mydb.insert_Tag(" r ) \n","VARIABLE","None");//id=61
        mydb.insert_Tag("print(letter); \n","VARIABLE","None");//id=62
           mydb.insert_Tag(" for( \n","MAIN","None");//id=63
        mydb.insert_Tag("if (","MAIN","None");//id=64
        mydb.insert_Tag("for-each( ","MAIN","None");//id=65
        mydb.insert_Tag("break; \n","MAIN","None");//id=66
        //65 60 64 59 61 66 62

        //question 10 class - J

        mydb.insert_Tag(" letter == ","VARIABLE","None");//id=67
        mydb.insert_Tag(" 'i' ) \n","VARIABLE","None");//id=68
        mydb.insert_Tag(" continue; \n","MAIN","None");//id=69
        mydb.insert_Tag(" 'a') \n","VARIABLE","None");//id=70
        mydb.insert_Tag("if ( ","MAIN","None");//id=71
        mydb.insert_Tag("for-each ( ","MAIN","None");//id=72
        mydb.insert_Tag(" print(letter) \n","VARIABLE","None");//id=73
        mydb.insert_Tag("letter in 'grain' )\n","VARIABLE","None");//id=74
        mydb.insert_Tag(" 'r') \n","VARIABLE","None");//id=75

        //72 74 71 67 75 69 73

        //question 11 class - k

        mydb.insert_Tag("j <= i/j;","VARIABLE","None");//id= 76
        mydb.insert_Tag("if","MAIN","None");//id= 77
          mydb.insert_Tag("i--){ \n","VARIABLE","None");//id= 78
        mydb.insert_Tag("(!(i % j)){ \n","VARIABLE","None");//id= 79
        mydb.insert_Tag("i <= end;","VARIABLE","None");//id= 80
        mydb.insert_Tag("for(","MAIN","None");//id= 81
        mydb.insert_Tag("start = 2; end = myScore; \n","VARIABLE","None");//id= 82
        mydb.insert_Tag("i++){ \n","VARIABLE","None");//id= 83
          mydb.insert_Tag("start = myScore; end =2; \n","VARIABLE","None");//id= 84
        mydb.insert_Tag("j = start;","VARIABLE","None");//id= 85
        mydb.insert_Tag("break;}} \n","VARIABLE","None");//id= 86
        mydb.insert_Tag("i = start;","VARIABLE","None");//id= 87
        mydb.insert_Tag("(j>(i/j)){ \n","VARIABLE","None");//id= 88
        mydb.insert_Tag("j++){ \n","VARIABLE","None");//id= 89
        mydb.insert_Tag("print(i);} } \n","MAIN","None");//id= 90

        // 82,81,87,80,83,81,85,76,89,77,79,86,77,88,90



        //question 12 class - L

        mydb.insert_Tag("else {\n","MAIN","None"); //id=91
        mydb.insert_Tag("if","MAIN","None"); //id=92
        mydb.insert_Tag("(i=1;i<=5;i++) { \n","VARIABLE","None"); //id=93
        mydb.insert_Tag("for","MAIN","None"); //id=94
//        mydb.insert_Tag("for","MAIN","None"); //id=94
        mydb.insert_Tag("print(' '); }\n","VARIABLE","None"); //id=95
        mydb.insert_Tag("} println(); } \n","VARIABLE","None"); //id=96
        mydb.insert_Tag("(j==4 || j==1 || i==1 || i==5){ \n","VARIABLE","None"); //id=97
        mydb.insert_Tag("(j=1;j<=4;j++){ \n","VARIABLE","None"); //id=98
        mydb.insert_Tag("print(1); }\n","VARIABLE","None"); //id=99

        //94 93 94 98 92 97 99 91 95 96

        //question 13 class - M

        mydb.insert_Tag("(a > 0){ \n","VARIABLE","None");//id=100
        mydb.insert_Tag("s = s + (a % 10); \n","VARIABLE","None");//id=101
        mydb.insert_Tag("}if","MAIN","None");//id=102
        mydb.insert_Tag("print('Palindrome'); \n","VARIABLE","None");//id=103
            mydb.insert_Tag("t = a;s = len(a) \n","VARIABLE","None");//id=104
        mydb.insert_Tag("s = s * 10; \n","VARIABLE","None");//id=105
        mydb.insert_Tag("a = input(); \n","VARIABLE","None");//id=106
        mydb.insert_Tag("(t == s){ \n","VARIABLE","None");//id=107
        mydb.insert_Tag("}else{ \n","MAIN","None");//id=108
        mydb.insert_Tag("a = a / 10; \n","VARIABLE","None");//id=109
        mydb.insert_Tag("s = 0;t = a; \n","MAIN","None");//id=110
        mydb.insert_Tag("print('Not a palindrome');} \n","VARIABLE","None");//id=111
        mydb.insert_Tag("while","MAIN","None");//id=112
            mydb.insert_Tag("(t == a){ \n","VARIABLE","None");//id=113
            mydb.insert_Tag("(a > 9){ \n","VARIABLE","None");//id=114

        //106,110,112,100,105,101,109,102,107,103,108,111


        //question 14 class - N

        mydb.insert_Tag("if","VARIABLE","None");//id=115
        mydb.insert_Tag("array.","VARIABLE","None");//id=116
          mydb.insert_Tag("(s); \n","VARIABLE","None");//id=117
        mydb.insert_Tag("break; \n","MAIN","None");//id=118
        mydb.insert_Tag("(s): \n","VARIABLE","None");//id=119
        mydb.insert_Tag("array = []; \n","MAIN","None");//id=120
        mydb.insert_Tag("else: \n","MAIN","None");//id=121
        mydb.insert_Tag("print(sentence); \n","VARIABLE","None");//id=122
        mydb.insert_Tag("append","MAIN","None");//id=123
        mydb.insert_Tag("True: \n","VARIABLE","None");//id=124
        mydb.insert_Tag("(s.upper()); \n","VARIABLE","None");//id=125
        mydb.insert_Tag("sentence in array: \n","VARIABLE","None");//id=126
        mydb.insert_Tag("while","MAIN","None");//id=127
        mydb.insert_Tag("for","MAIN","None");//id=128
        mydb.insert_Tag("s = input(); \n","MAIN","None");//id=129

        //120,127,124,129,115,119,116,123,125,121,118,128,126,122

        //question 15 class - O


        mydb.insert_Tag("(j,j+1); \n","VARIABLE","None");//id=130
          mydb.insert_Tag("(j=0;j<=array.length-1;j++){ \n","VARIABLE","None");//id=131
        mydb.insert_Tag("if","VARIABLE","None");//id=132
        mydb.insert_Tag("bubble_sort","MAIN","None");//id=133
        mydb.insert_Tag("for","MAIN","None");//id=134
        mydb.insert_Tag("swap","MAIN","None");//id=135
        mydb.insert_Tag("(array[j]>array[j+1]) \n","VARIABLE","None");//id=136
        mydb.insert_Tag("(i,i+1); \n","VARIABLE","None");//id=137
        mydb.insert_Tag("(array): \n","MAIN","None");//id=138
        mydb.insert_Tag("function","MAIN","None");//id=139
        mydb.insert_Tag("(j=0;j<=array.length-1-i;j++){ \n","VARIABLE","None");//id=140
        mydb.insert_Tag("(i=0;i<=array.length;i++){ \n","VARIABLE","None");//id=141



        //139,133,138,134,141,134,140,132,136,135,130,137

    }

}
