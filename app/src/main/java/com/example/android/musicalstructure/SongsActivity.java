package com.example.android.musicalstructure;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button playing;
    Button stopping;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

                playing = (Button) findViewById(R.id.play1);
                playing.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp = MediaPlayer.create(SongsActivity.this, R.raw.lady);
                        mp.start();
                    }
                });

        stopping = (Button) findViewById(R.id.stop1);
        stopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });
    }

    }




