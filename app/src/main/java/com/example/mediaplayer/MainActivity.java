package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  MediaPlayer player;
  public void Play(View v){
      player.start();
  }
  public void Pause(View v){
      player.pause();
  }

  public void Stop(View  v){
      player.stop();
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player=MediaPlayer.create(this, R.raw.music);
    }
}