package com.example.pushpika.canvas_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.FormatFlagsConversionMismatchException;

/**
 * Created by pushpika on 3/22/16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "board_game_db";
    public static final String TABLE_NAME_TAG = "Name_tag";
    public static final String TABLE_QUESTIOn= "Question";
    public static final String TABLE_LOG = "log";
    public static final String TABLE_TAG_QUE_ASSIST = "Tag_que_assist";

    //Tag name table
    public static final String COLUMN_TAG_ID = "Tag_ID";
    public static final String COLUMN_TAG_NAME = "Tag_Name";
    public static final String COLUMN_TAG_TYPE = "Tag_Type"; //keyword or variable
    public static final String COLUMN_TAG_DESC = "Tag_DESC";

    //Question table
    public static final String COLUMN_QUESTION_ID = "Question_ID";
    public static final String COLUMN_QUESTION_CLASS = "Question_class";
    public static final String COLUMN_ANSWER_SEQUENCE = "Answer_Sequence";

    //Log table
    public static final String COLUMN_LOG_ID = "Log_ID";
    //public static final String COLUMN_QUESTION_ID = "Question_ID";
    public static final String COLUMN_STATUS = "Status";
    public static final String COLUMN_POSITION = "Position";

    //Tag que assist table
    //public static final String COLUMN_QUESTION_ID = "Question_ID";
    // public static final String COLUMN_TAG_ID = "Tag_ID";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null,1);
        //SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME_TAG + " ( Tag_ID INTEGER PRIMARY KEY AUTOINCREMENT, Tag_Name VARCHAR(20) , Tag_Type VARCHAR(20) , Tag_DESC VARCHAR(100) ); ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME_TAG);
        onCreate(db);
    }

    public boolean insert_data(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_TAG_NAME,"if");
        contentValues.put(COLUMN_TAG_TYPE,"KEYWORD");
        contentValues.put(COLUMN_TAG_DESC, "if is an important key word");
        long result =  db.insert(TABLE_NAME_TAG,null,contentValues);
        if (result ==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor get_data(String Table_name){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res= db.rawQuery("SELECT * FROM "+Table_name,null);
        return res;
    }
}
