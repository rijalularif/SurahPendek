package com.example.surah_pendek;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class alikhlas extends AppCompatActivity {
    CountDownTimer timer1, timer2, timer3, timer4;
    Button play3;
    MediaPlayer mediaPlayer;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alikhlas);

        textView = findViewById(R.id.ayatalikhlash);
        play3 = findViewById(R.id.playalikhlash);
        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(alikhlas.this, R.raw.alikhlas);

        play3.setOnClickListener(view -> {
            mediaPlayer.start();
            timer1 = new CountDownTimer(6000, 1000) {

                @Override
                public void onTick(long l) {
                    textView.setText(R.string.alikhlas1);
                }

                @Override
                public void onFinish() {
                    timer2.start();
                }
            }.start();
        });

        timer2 = new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alikhlas2);
            }

            @Override
            public void onFinish() {
                timer3.start();
            }
        };

        timer3 = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alikhlas3);
            }

            @Override
            public void onFinish() {
                timer4.start();
            }
        };

        timer4 = new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long l) {
                textView.setText(R.string.alikhlas4);
            }

            @Override
            public void onFinish() {
            finish();
            }
        };

    }
}
