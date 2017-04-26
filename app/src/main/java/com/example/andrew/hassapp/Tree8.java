package com.example.andrew.hassapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.VideoView;
import android.widget.MediaController;

public class Tree8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree8);


        final VideoView tree8video = (VideoView) findViewById(R.id.tree8video);
        tree8video.setVideoPath("http://192.168.0.17/WebD/HASSAPP/video/tree8.mp4");
        //Player Controls - play -  pause
        MediaController media = new MediaController(this);
        media.setAnchorView(tree8video);
        tree8video.setMediaController(media);
        //starts video
        tree8video.start();

    }

}
