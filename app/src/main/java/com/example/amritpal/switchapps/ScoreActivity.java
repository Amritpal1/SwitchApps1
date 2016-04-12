package com.example.amritpal.switchapps;

/**
 * Created by Amritpal on 4/11/2016.
 */
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by Amritpal on 4/11/2016.
 */
public class ScoreActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(this);

    }

    public void onClick(View v){
        Intent myintent = new Intent(this, SecondActivity.class);
        startActivity(myintent);
    }

}
