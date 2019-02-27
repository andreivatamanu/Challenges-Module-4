package com.example.module4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void challenge1(View view) {

        Intent i = new Intent( this, Challenge1.class);
        startActivity(i);
    }

    public void challenge2(View view) {
        Intent i = new Intent( this, Challenge2.class);
        startActivity(i);
    }

    public void challenge3(View view) {
        Intent i = new Intent( this, Challenge3.class);
        startActivity(i);
    }

    public void challenge4(View view) {
        Intent i = new Intent( this, Challenge4.class);
        startActivity(i);
    }


    public void extraChallenge(View view) {
        Intent i = new Intent( this, ExtraChallenge.class);
        startActivity(i);
    }

    public void extraCallenge2(View view) {
        Intent i = new Intent( this, ExtraChallenge2.class);
        startActivity(i);
    }
}
