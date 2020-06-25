package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText mTextGrao;
    Button mButtonRegister;


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
//                if(pwd.equals(cnf_pwd) && pwd.length() !=0){
//                    long val = db.addUser(user, pwd);
//                    if(val > 0){
//                        Toast.makeText(RegisterActivity.this, "You have registered", Toast.LENGTH_SHORT).show();
//                        Intent moveToLogin  = new Intent(RegisterActivity.this, LoginActivity.class);
//                        startActivity(moveToLogin);
//                    }else if (val == 0){
//                        Toast.makeText(RegisterActivity.this, "Registration error", Toast.LENGTH_SHORT).show();
//                    }
//                }else{
//                    Toast.makeText(RegisterActivity.this, "Password is not matching", Toast.LENGTH_SHORT).show();
//
//                }
            }
        });


    }
}
