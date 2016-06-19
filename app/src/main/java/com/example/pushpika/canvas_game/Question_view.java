package com.example.pushpika.canvas_game;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
    TextView textView,pos_view;
    String cur_text="",quest_topic="",quest_desc="",cur_seq="",answer_get="",start_node="",promotion_node="",punishment_node="",promotion_class="",punishment_class="";
    String text="",id="";
    String text_arr [] = new String [100];
    String id_arr [] = new String[100];
    int cur_len=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_view);
        pos_view = (TextView) findViewById(R.id.position_number);
        compulsary_words_field = (LinearLayout) findViewById(R.id.compulsary_words);
        optional_words_field = (LinearLayout) findViewById(R.id.optional_words);
        textView = (TextView) findViewById(R.id.text1);
        dynamic_content();
        show_message(quest_topic,quest_desc);
    }

    public void dynamic_content(){
        mydb = new DatabaseHelper(this);
        final Animation animation_fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out_anim);
        // create the layout params that will be used to define how your
        // button will be displayed
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        final Question_object question_object = mydb.get_data_object(MainActivity.target_class); // we can change class according to question

        quest_topic=question_object.question_topic;
        quest_desc = question_object.question_desc;
        answer_get = question_object.answer_sequence;
        start_node = question_object.start_node;
        promotion_node = question_object.promotion_node;
        punishment_node = question_object.punishment_node;
        promotion_class =question_object.promotion_class;
        punishment_class = question_object.punishment_class;


        Log.i("TAG", "promotion class "+ promotion_class);
        Log.i("TAG", "punishment class "+ punishment_class);
        LinearLayout ll = null;
        //Create
        for(int j=0;j<question_object.keywords.length;j++)
        {
            // Create LinearLayout
            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            // Create Button
            final Button btn = new Button(this);
            Log.i("TAG", "The index is"+ question_object.keywords[j]);

            final int finalJ = j;
            btn.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Log.i("TAG", "The index is" + question_object.keywords[finalJ]); //set text for button action
                    //cur_text = textView.getText().toString();
                    //cur_text = cur_text + " " + question_object.keywords[finalJ];
                    //cur_seq = cur_seq + "," + question_object.keywords_id[finalJ];
                    //textView.setText(cur_text);
                    text = question_object.keywords[finalJ];
                    id= question_object.keywords_id[finalJ];
                    add_tag(text, id);
                    v.startAnimation(animation_fade_out);
                }
            });

            // Give button an ID
            btn.setId(j);
            btn.setText(question_object.keywords[j]);
            //btn.setBackgroundColor(Color.parseColor("#CBE32D"));
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
            Log.i("TAG", "The index is"+ question_object.variable[i]);
            final int finalI = i;
            btn.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {
                    Log.i("TAG", "The index is" + question_object.variable[finalI]); //set text for button action

                    //cur_text = textView.getText().toString();
                    //cur_text = cur_text + " " + question_object.variable[finalI];
                    //cur_seq = cur_seq + "," + question_object.variable_id[finalI];
                    text = question_object.variable[finalI];
                    id= question_object.variable_id[finalI];
                    add_tag(text, id);
                    //textView.setText(cur_text);
                    v.startAnimation(animation_fade_out);

                }
            });

            // Give button an ID
            btn.setId(i);
            btn.setText(question_object.variable[i]);
            // set the layoutParams on the button
            btn.setLayoutParams(params);
            //Add button to LinearLayout
            ll1.addView(btn);

            //Add button to LinearLayout defined in XML
            optional_words_field.addView(ll1);
        }
        //add position
        //String pos = (String) pos_view.getText();
        pos_view.setText("Position - "+start_node);

    }
    public void add_tag(String tag, String tag_id){
        String temp_str="";
        int i;
        text_arr[cur_len]=tag;
        id_arr[cur_len]=tag_id;
        cur_len+=1;
        for (i=0;i<cur_len;i++){
            temp_str= temp_str+ " " +text_arr[i];
        }
        textView.setText(temp_str);

    }

    public void remove_tag(View view){
        String temp_str="";
        int i;
        if(cur_len!=0) {
            text_arr[cur_len] = null;
            id_arr[cur_len] = null;
            cur_len = cur_len - 1;
        }
        for (i=0;i<cur_len;i++){
            temp_str= temp_str+ " " +text_arr[i];
        }
        textView.setText(temp_str);

    }



    public void view_question(View view){
        show_message(quest_topic,quest_desc);

    }

    public void show_message(String title, String message){

        AlertDialog.Builder dialog_box = new AlertDialog.Builder(this);
        dialog_box.setCancelable(true);
        dialog_box.setTitle(title);
        dialog_box.setMessage(message);
        dialog_box.show();
    }



    public void check_answer(View view){
        answer_get = answer_get.replaceAll(",", "");
        cur_seq="";
        int i;
        for(i=0;i<cur_len;i++){
            cur_seq =cur_seq+ ","+id_arr[i];
        }
        cur_seq = cur_seq.replaceAll(",", "");
        Log.i("TAG", "The answer sequence is" +answer_get); //set text for button action
        Log.i("TAG", "The current sequence is" + cur_seq ); //set text for button action
        if(answer_get.equals(cur_seq)){
            //return true
            Dialog settingsDialog = new Dialog(this);
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.correct_answer_image
                    , null));
            settingsDialog.show();
            textView.setBackgroundColor(Color.GREEN);
            increment_board();

        }
        else if(cur_seq.equals("")){
            //input field is empty
        }
        else{
            //return false
            Dialog settingsDialog = new Dialog(this);
            settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.wrong_answer_image
                    , null));
            settingsDialog.show();
            textView.setBackgroundColor(Color.RED);
            decrement_board();
        }
    }


    public void increment_board(){
        //Intent transition_page = new Intent(this,Question_view.class);
        Intent transition_page = new Intent(this,AnimationActivity.class);
        MainActivity.current_pos=Integer.parseInt(start_node);
        MainActivity.is_increment = 1;
        MainActivity.target_pos = Integer.parseInt(promotion_node);
        MainActivity.target_class = promotion_class;
        Log.i("TAG", "current pos-- "+ MainActivity.current_pos);
        Log.i("TAG", "target pos"+ MainActivity.target_pos);
        Log.i("TAG", "Target class "+ MainActivity.target_class);
        startActivity(transition_page);
        finish();

    }

    public void decrement_board(){
        Intent transition_page = new Intent(this,AnimationActivity.class);
        MainActivity.current_pos=Integer.parseInt(start_node);
        MainActivity.is_increment = 0;
        MainActivity.target_pos = Integer.parseInt(punishment_node);
        MainActivity.target_class = punishment_class;
        Log.i("TAG", "current pos-- "+ MainActivity.current_pos);
        Log.i("TAG", "target pos"+ MainActivity.target_pos);
        Log.i("TAG", "Target class "+ MainActivity.target_class);
        startActivity(transition_page);
        finish();
    }

}