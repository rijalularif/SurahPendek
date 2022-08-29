package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alkafirun extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4, timer5, timer6;
    Button play6;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alkafirun);

        textView = findViewById(R.id.ayatalkafirun);
        play6 = findViewById(R.id.playalkafirun);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(alkafirun.this, R.raw.alkafirun);

        play6.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.alkafirun1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkafirun2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkafirun3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkafirun4);
            }

            @Override
            public void onFinish() {
                timer5.start();
            }
        };

        timer5 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkafirun5);
            }

            @Override
            public void onFinish() {
                timer6.start();
            }
        };

        timer6 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkafirun6);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
