package com.example.amritpal.switchapps;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Amritpal on 4/11/2016.
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "You will be able to play Solitaire here", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //the fab button return to main menu
                Intent myintent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(myintent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClick(View v){
        Intent myintent = new Intent(this, MainActivity.class);
        startActivity(myintent);
    }
    public void onHomeClick(View v) {
        Intent myintent = new Intent(this, MainActivity.class);
        startActivity(myintent);
    }
}
