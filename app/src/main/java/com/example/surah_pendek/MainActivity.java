package com.example.surah_pendek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play1(View view) {
        Intent i = new Intent(MainActivity.this, annas.class);
        startActivity(i);
    }

    public void play2(View view) {
        Intent i = new Intent(MainActivity.this, alfalaq.class);
        startActivity(i);
    }

    public void play3(View view) {
        Intent i = new Intent(MainActivity.this, alikhlas.class);
        startActivity(i);
    }

    public void play4(View view) {
        Intent i = new Intent(MainActivity.this, allahab.class);
        startActivity(i);
    }

    public void play5(View view) {
        Intent i = new Intent(MainActivity.this, annashr.class);
        startActivity(i);
    }

    public void play6(View view) {
        Intent i = new Intent(MainActivity.this, alkafirun.class);
        startActivity(i);
    }

    public void play7(View view) {
        Intent i = new Intent(MainActivity.this, alkautsar.class);
        startActivity(i);
    }

    public void play8(View view) {
        Intent i = new Intent(MainActivity.this, almaun.class);
        startActivity(i);
    }
}