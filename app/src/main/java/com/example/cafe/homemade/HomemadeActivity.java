package com.example.cafe.homemade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.cafe.DatabaseHelper;
import com.example.cafe.NewActivity;
import com.example.cafe.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HomemadeActivity extends AppCompatActivity {

    private ListView listView;
    private DataHomemade data;
    private List<HomemadeExp> homemade;
    private List<HomemadeExp> homemadeFiltrados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemade);

        listView = findViewById(R.id.homemadeList);
        data = new DataHomemade(this);
        homemade = data.getAll();
        homemadeFiltrados.addAll(homemade);
        ArrayAdapter<HomemadeExp> adapter = new ArrayAdapter<HomemadeExp>(this, android.R.layout.simple_list_item_1, homemade);
        listView.setAdapter(adapter);


//        Intent intent = getIntent();
//        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
//
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);

    }

//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater i =  getMenuInflater();
//        i.inflate(R.menu.menu_principal, menu);
//        return true;
//    }
}
