package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alkautsar extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3;
    Button play7;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alkautsar);

        textView = findViewById(R.id.ayatalkautsar);
        play7 = findViewById(R.id.playalkautsar);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(alkautsar.this, R.raw.alkauthar);

        play7.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(12000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.alkautsar1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(4000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkautsar2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alkautsar3);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
