package com.example.cafe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.widget.TabHost;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String name ="register.db";
    public static final int version = 1;

    public static final String TABLE_USER ="registeruser";
    public static final String USER_1 ="ID";
    public static final String USER_2 ="username";
    public static final String USER_3 ="password";
    public static final String TABLE_COFFEE ="registercoffee";
    public static final String COFFEE_1 ="id";
    public static final String COFFEE_2 ="coffeebean";
//    public static final String COFFEE_3 ="";


    public DatabaseHelper(Context context) {
<<<<<<< HEAD
        super(context, name, null, version);
=======
        super(context, DATABASE_NAME, null, 1);
>>>>>>> 904fbaa6e2f33fcb2a6b91caed8fa0365ad7785d
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create tables
        db.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT, password TEXT)");
<<<<<<< HEAD
        db.execSQL("CREATE TABLE registercoffee (id INTEGER PRIMARY KEY AUTOINCREMENT, " + " coffeebean varchar(50))");
=======
        db.execSQL("create table " + TABLE_COFFEE + "(id integer primary key autoincrement, coffeebean text)");
>>>>>>> 904fbaa6e2f33fcb2a6b91caed8fa0365ad7785d
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop existing tables
<<<<<<< HEAD
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_USER );
//        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_HOMEMADE);
=======
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER );
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COFFEE);
>>>>>>> 904fbaa6e2f33fcb2a6b91caed8fa0365ad7785d
        onCreate(db);
    }

    // Insert methods
    public long addUser(String user, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(USER_2, user);
        contentValues.put(USER_3, password);
        long result = db.insert(TABLE_USER, null, contentValues);
        db.close();
        return result;
    }

    public boolean addCoffee(String coffeebean){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COFFEE_2, coffeebean);
        long result = db.insert(TABLE_COFFEE, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

<<<<<<< HEAD
=======

>>>>>>> 904fbaa6e2f33fcb2a6b91caed8fa0365ad7785d

    public boolean checkUser(String username, String password){
        String[] columns = { USER_1 };
        SQLiteDatabase db = getReadableDatabase();
        String selection = USER_2 + "=?" + " and " + USER_3 + "=?";
        String[] selectionArgs = {username, password};
        Cursor cursor = db.query(TABLE_USER, columns, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if(count>0)
            return true;
        else
            return false;
    }
}
