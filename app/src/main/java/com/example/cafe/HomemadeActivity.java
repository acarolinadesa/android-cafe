package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class HomemadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemade);


    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater i =  getMenuInflater();
        i.inflate(R.menu.homemade_main, menu);
        return true;
    }

    public void register(MenuItem item){
        Intent it = new Intent(this, NewActivity.class);
        startActivity(it);
    }
}
