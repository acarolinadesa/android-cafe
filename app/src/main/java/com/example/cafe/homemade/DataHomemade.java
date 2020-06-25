package com.example.cafe.homemade;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.cafe.DatabaseHelper;

public class DataHomemade {
    private DatabaseHelper conexao;
    private SQLiteDatabase banco;

    public DataHomemade(Context context){
        conexao = new DatabaseHelper(context);
        banco = conexao.getWritableDatabase();
    }
    public long inserir(HomemadeExp aluno){
        ContentValues values = new ContentValues();
        values.put("coffeebean", aluno.getCoffeebean());
//        values.put("cpf", aluno.getCpf());
//        values.put("telefone", aluno.getTelefone());
        return banco.insert("registerhomemade", null, values);
    }

}
