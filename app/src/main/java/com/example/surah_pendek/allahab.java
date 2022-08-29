package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class allahab extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4, timer5;
    Button play4;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allahab);

        textView = findViewById(R.id.ayatallahab);
        play4 = findViewById(R.id.playallahab);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(allahab.this, R.raw.allahab);

        play4.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(14000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.allahab1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.allahab2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.allahab3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.allahab4);
            }

            @Override
            public void onFinish() {
                timer5.start();
            }
        };

        timer5 = new CountDownTimer(9000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.allahab5);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
