package com.mydhitz.berkicau;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MuraiUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.murai_utama);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.muraibatu);
        Button play = (Button) findViewById (R.id.btnPutar);
        Button stop = (Button) findViewById (R.id.btnJeda);
        Button replay = (Button) findViewById(R.id.btnBerhenti);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mp3.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mp3.pause();
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mp3.stop();
            }
        });
    }
}
