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
        register();


    }
    public void register() {
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = db.addCoffee(mTextCoffeeBean.getText().toString()
                        //add more itens here
                );

                if (isInserted = true) {
                    Toast.makeText(NewActivity.this, "Experience saved", Toast.LENGTH_LONG).show();
                    Intent homemadeIntent = new Intent(NewActivity.this, HomemadeActivity.class);
                    startActivity(homemadeIntent);
                } else {
                    Toast.makeText(NewActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
