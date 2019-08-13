package com.kdotz.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {
        Button button = (Button) view;
        Log.i("Button pressed" , button.getTag().toString());
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(), "raw", getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
