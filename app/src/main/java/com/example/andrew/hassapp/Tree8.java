package com.example.andrew.hassapp;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.MediaController;

public class Tree8 extends AppCompatActivity {

    DownloadManager downloadManager;
    Button button;
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

        //Button Click
        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManager= (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("http://192.168.0.17/WebD/HASSAPP/files/tree8.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference=downloadManager.enqueue(request);
            }
        });

    }

}
