package com.example.andrew.hassapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private GestureDetectorCompat gestureObject;
    private TextView message1;
    private GestureDetectorCompat gestureDetector;
    //TextView abc1 = (TextView) findViewById(R.id.abc1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        final TextView Username = (TextView) findViewById(R.id.wUsername);

        //getSupportActionBar().hide();
         //message1 = (TextView) findViewById(R.id.message1);
        //this.gestureDetector = new GestureDetectorCompat(this,this);
        Intent intent = getIntent();
        String businessname = intent.getStringExtra("businessname");
        String username = intent.getStringExtra("username");
        //Welcome String
        String usernamemessage = username + ",";
        Username.setText(usernamemessage);
    }

    public void hassapp(View view){
        Intent i = new Intent(this,Tree1.class);
        startActivity(i);
    }

    public void tutorial(View view){
        Intent i = new Intent(this,tutorial.class);
        startActivity(i);
    }


}
