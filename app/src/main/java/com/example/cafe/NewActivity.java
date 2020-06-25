package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cafe.homemade.DataHomemade;
import com.example.cafe.homemade.HomemadeActivity;
import com.example.cafe.homemade.HomemadeExp;

public class NewActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText mTextGrao;
    Button mButtonRegister;
    DataHomemade dataHomemade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        db = new DatabaseHelper(this);
        mTextGrao = (EditText) findViewById(R.id.edittext_graocafe);
        mButtonRegister = (Button) findViewById(R.id.button_cadastrar);


        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String coffeebean = mTextGrao.getText().toString().trim();
                if(coffeebean.length()!=0) {
                    Toast.makeText(NewActivity.this, "Experiência cadastrada", Toast.LENGTH_SHORT).show();
                    Intent moveToHomemade = new Intent(NewActivity.this, HomemadeActivity.class);
                    startActivity(moveToHomemade);
                }else{
                   Toast.makeText(NewActivity.this, "Preenchimento incompleto", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
    public void cadastrar(View view){
        HomemadeExp coffee = new HomemadeExp();
        coffee.setCoffeebean(mTextGrao.getText().toString());
//        a.setCpf(cpf.getText().toString());
//        a.setTelefone(telefone.getText().toString());
        long id = dataHomemade.inserir(coffee);
        Toast.makeText(this, "Aluno inserido com id: " + id, Toast.LENGTH_SHORT).show();
    }
}
