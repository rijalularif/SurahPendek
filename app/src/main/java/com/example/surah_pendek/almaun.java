package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class almaun extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4, timer5, timer6, timer7;
    Button play8;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.almaun);

        textView = findViewById(R.id.ayatalmaun);
        play8 = findViewById(R.id.playalmaun);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(almaun.this, R.raw.almaun);

        play8.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(13000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.almaun1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(8000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun4);
            }

            @Override
            public void onFinish() {
                timer5.start();
            }
        };

        timer5 = new CountDownTimer(8000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun5);
            }

            @Override
            public void onFinish() {
                timer6.start();
            }
        };

        timer6 = new CountDownTimer(8000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun6);
            }

            @Override
            public void onFinish() {
                timer7.start();
            }
        };

        timer7 = new CountDownTimer(8000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.almaun7);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
