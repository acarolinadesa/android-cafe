package com.example.cafe.homemade;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.cafe.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class DataHomemade {
    private DatabaseHelper conexao;
    private SQLiteDatabase banco;

    public DataHomemade(Context context){
        conexao = new DatabaseHelper(context);
        banco = conexao.getWritableDatabase();
    }

    public long insertOne(HomemadeExp homemade){
        ContentValues values = new ContentValues();
        values.put("coffeebean", homemade.getCoffeebean());
        return banco.insert("registercoffee", null, values);
    }

    public List<HomemadeExp> getAll(){
        List<HomemadeExp> homemade = new ArrayList<>();
        Cursor cursor = banco.query("registercoffee", new String[]{"id", "coffebean"}, null, null, null, null, null);
        while(cursor.moveToNext()){
            HomemadeExp a = new HomemadeExp();
            a.setId(cursor.getInt(0));
            a.setCoffeebean(cursor.getString(1));
            homemade.add(a);
        }
        return homemade;
    }


}
