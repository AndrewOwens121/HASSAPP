package com.example.andrew.hassapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
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
        final Button regButton = (Button) findViewById(R.id.regButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String businessname = regBusinessName.getText().toString();
                final String username = regUserName.getText().toString();
                final String password = regPassword.getText().toString();
            }
        });

    }


}
