package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class annashr extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3;
    Button play5;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annashr);

        textView = findViewById(R.id.ayatannashr);
        play5 = findViewById(R.id.playannashr);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(annashr.this, R.raw.annasr);

        play5.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(8000, 1000) {
                @Override
                public void onTick(long l) {
                    textView.setText(R.string.annashr1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(9000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annashr2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.annashr3);
            }

            @Override
            public void onFinish() {
                finish();
            }
        };
    }
}
