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
        setContentView(R.layout.activity_main);
         //message1 = (TextView) findViewById(R.id.message1);
        //this.gestureDetector = new GestureDetectorCompat(this,this);


    }

//    public void hassapp(){
//        abc1.setText("Hassapp pressed");
//    }

    public void tutorial(View view){
        Intent i = new Intent(this,tutorial.class);
        startActivity(i);
    }


}
