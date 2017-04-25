package com.example.andrew.hassapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText regBusinessName = (EditText) findViewById(R.id.regBusinessName);
        final EditText regUserName = (EditText) findViewById(R.id.regUserName);
        final EditText regPassword = (EditText) findViewById(R.id.regPassword);
    }

    public void register(View view){

    }

}
