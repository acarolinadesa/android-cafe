package com.example.cafe.homemade;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.cafe.DatabaseHelper;
import com.example.cafe.NewCoffee;

public class DataNewCoffee {
    private DatabaseHelper conexao;
    private SQLiteDatabase banco;

    public DataNewCoffee(Context context){
        conexao = new DatabaseHelper(context);
        banco = conexao.getWritableDatabase();
    }

    public long insertCoffee(NewCoffee coffee){
        ContentValues values = new ContentValues();
        values.put("coffeebean", coffee.getCoffebean());


//        values.put("cpf", aluno.getCpf());
//        values.put("telefone", aluno.getTelefone());
        return banco.insert("registerhomemade", null, values);
    }

}
