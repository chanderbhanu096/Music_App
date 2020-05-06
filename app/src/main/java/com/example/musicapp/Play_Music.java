package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Play_Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Now Playing");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play__music);
    }
}
