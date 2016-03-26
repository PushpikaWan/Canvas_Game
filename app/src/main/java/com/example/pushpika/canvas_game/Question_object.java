package com.example.pushpika.canvas_game;

/**
 * Created by pushpika on 3/23/16.
 */
public class Question_object {
    String keywords_id [],keywords [],variable_id [],variable [],answer_sequence,question_topic,question_desc;
    int question_id;

    public Question_object(String[] keywords_id,String[] keyword_array,String[] variable_id,String[] variable_array,String question_topic,String question_desc,String answer_sequence, int question_id) {
        this.keywords_id= keywords_id;
        this.keywords = keyword_array;
        this.variable_id = variable_id;
        this.variable = variable_array;
        this.answer_sequence = answer_sequence;
        this.question_id = question_id;
        this.question_topic = question_topic;
        this.question_desc = question_desc;
    }
}
