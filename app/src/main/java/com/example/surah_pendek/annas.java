package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class annas extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4, timer5, timer6;
    Button play1;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annas);

        textView = findViewById(R.id.ayatannas);
        play1 = findViewById(R.id.playannas);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(annas.this, R.raw.annas);

        play1.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(7000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.annas1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annas2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annas3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annas4);
            }

            @Override
            public void onFinish() {
                timer5.start();
            }
        };

        timer5 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annas5);
            }

            @Override
            public void onFinish() {
                timer6.start();
            }
        };

        timer6 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annas6);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
