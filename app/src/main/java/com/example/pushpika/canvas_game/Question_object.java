package com.example.pushpika.canvas_game;

/**
 * Created by pushpika on 3/23/16.
 */
public class Question_object {
    String keywords [], variable [],answer_sequence;
    int question_id;

    public Question_object(String[] keyword_array, String[] variable_array, String answer_sequence, int question_id) {
        this.keywords = keyword_array;
        this.variable = variable_array;
        this.answer_sequence = answer_sequence;
        this.question_id = question_id;
    }
}
