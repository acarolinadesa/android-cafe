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
    EditText mTextCoffeeBean;
    Button mButtonRegister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        db = new DatabaseHelper(this);

        mTextCoffeeBean = (EditText) findViewById(R.id.edittext_graocafe);
        mButtonRegister = (Button) findViewById(R.id.button_cadastrar);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String coffeebeans = mTextCoffeeBean.getText().toString().trim();

                Toast.makeText(NewActivity.this, "Experiência salva", Toast.LENGTH_SHORT).show();

                Intent homemadeIntent = new Intent(NewActivity.this,HomeActivity.class);
                startActivity(homemadeIntent);



//                boolean isInserted = db.addCoffee(mTextCoffeeBean.getText().toString()
//                        //add more itens here
//                );
//                if(isInserted = true)
//                    Toast.makeText(NewActivity.this, "Experience saved", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(NewActivity.this, "Error", Toast.LENGTH_SHORT).show();




//                String user = mTextUsername.getText().toString().trim();
//                String pwd = mTextPassword.getText().toString().trim();
//                Boolean res = db.checkUser(user, pwd);
//                if(res == true){
//                    Toast.makeText(LoginActivity.this, "Successfuly Logged In", Toast.LENGTH_SHORT).show();
//                    Intent homeIntent = new Intent(LoginActivity.this,HomeActivity.class);
//                    //Send username to HomeActivity
//                    mTextUsername = (EditText) findViewById(R.id.edittext_username);
//                    String message = mTextUsername.getText().toString();
//                    homeIntent.putExtra(EXTRA_MESSAGE, message);
//                    startActivity(homeIntent);
//
//                }else{
//                    Toast.makeText(LoginActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}