package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Question_view extends AppCompatActivity {
    DatabaseHelper mydb;
    LinearLayout compulsary_words_field,optional_words_field;
    TextView textView;
    String cur_text="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_view);

        compulsary_words_field = (LinearLayout) findViewById(R.id.compulsary_words);
        optional_words_field = (LinearLayout) findViewById(R.id.optional_words);
        textView = (TextView) findViewById(R.id.text1);
        dynamic_content();
        }

    public void dynamic_content(){
        mydb = new DatabaseHelper(this);
        // create the layout params that will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        final Question_object question_object = mydb.get_data_object("A"); // we can change class according to question
        LinearLayout ll = null;
        //Create
        for(int j=0;j<question_object.keywords.length;j++)
        {

                // Create LinearLayout
                ll = new LinearLayout(this);
                ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create Button
            final Button btn = new Button(this);

            final int finalJ = j;
            btn.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Log.i("TAG", "The index is" +question_object.keywords[finalJ] ); //set text for button action
                    cur_text = textView.getText().toString();
                    cur_text = cur_text+" "+question_object.keywords[finalJ];
                    textView.setText(cur_text);
                }
            });

            // Give button an ID
            btn.setId(j + 1);
            btn.setText(question_object.keywords[j]);
            // set the layoutParams on the button
            btn.setLayoutParams(params);
            //Add button to LinearLayout
            ll.addView(btn);

            //Add button to LinearLayout defined in XML
            compulsary_words_field.addView(ll);
        }

        LinearLayout ll1 = null;
        //Create
        for(int i=0;i<question_object.variable.length;i++)
        {

                // Create LinearLayout
                ll1 = new LinearLayout(this);
                ll1.setOrientation(LinearLayout.HORIZONTAL);

            // Create Button
            final Button btn = new Button(this);
            final int finalI = i;
            btn.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Log.i("TAG", "The index is" +question_object.variable[finalI] ); //set text for button action

                    cur_text = textView.getText().toString();
                    cur_text = cur_text+" "+question_object.variable[finalI];
                    textView.setText(cur_text);
                }
            });

            // Give button an ID
            btn.setId(i+1);
            btn.setText(question_object.variable[i]);
            // set the layoutParams on the button
            btn.setLayoutParams(params);
            //Add button to LinearLayout
            ll1.addView(btn);

            //Add button to LinearLayout defined in XML
            optional_words_field.addView(ll1);
        }

    }


    public void show_message(String title, String message){

        AlertDialog.Builder dialog_box = new AlertDialog.Builder(this);
        dialog_box.setCancelable(true);
        dialog_box.setTitle(title);
        dialog_box.setMessage(message);
        dialog_box.show();
    }

    public void reset_text(View view){
        cur_text = "";
        textView.setText(cur_text);
    }

    public void check_answer(View view){

    }

}
