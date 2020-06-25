package com.example.cafe.homemade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.cafe.NewActivity;
import com.example.cafe.R;

public class HomemadeActivity extends AppCompatActivity {

//    ListView listview;
//    DatabaseHelper databaseHelper;
//    List<HomemadeExp> homemadeExp;
//    List<HomemadeExp> homemadeExpFilter = new ArrayList<>();

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
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater i =  getMenuInflater();
        i.inflate(R.menu.homemade_main, menu);
        return true;
    }

    public void register(MenuItem menu){
        Intent newItem = new Intent(this, NewActivity.class);
        startActivity(newItem);
    }
}
