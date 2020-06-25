package com.example.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomemadeActivity extends AppCompatActivity {
    Button mButtonPlus;

    ListView listview;
    DatabaseHelper databaseHelper;
    List<HomemadeExp> homemadeExp;
    List<HomemadeExp> homemadeExpFilter = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemade);

//        listview = findViewById(R.id.homemadeList);
//        databaseHelper = new DatabaseHelper(this);
//        homemadeExp = databaseHelper.getAll();
//        homemadeExpFilter.addAll(homemadeExp);
//        ArrayAdapter<DatabaseHelper> adapter = new ArrayAdapter<DatabaseHelper>(this, android.R.layout.simple_list_item_1);
//        listview.setAdapter(adapter);


//        Intent intent = getIntent();
//        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
//
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);

        ImageButton mButtonPlus = (ImageButton) findViewById(R.id.imageButtonPlus);
        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(HomemadeActivity.this,NewActivity.class);
                startActivity(registerIntent);
            }
        });



    }
}
