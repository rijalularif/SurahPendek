package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class alfalaq extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4, timer5;
    Button play2;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alfalaq);

        textView = findViewById(R.id.ayatalfalaq);
        play2 = findViewById(R.id.playalfalaq);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(alfalaq.this, R.raw.alfalaq);

        play2.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(8000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.alfalaq1);
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
                textView.setText(R.string.alfalaq2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alfalaq3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alfalaq4);
            }

            @Override
            public void onFinish() {
                timer5.start();
            }
        };

        timer5 = new CountDownTimer(7000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alfalaq5);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
