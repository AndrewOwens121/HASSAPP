package com.example.andrew.hassapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;
import static com.example.andrew.hassapp.R.id.etUsername;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);//Edit to change title text
        setSupportActionBar(toolbar);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            //tester.setText(response);
                            JSONObject jsonResponse1 = new JSONObject(response);

                            boolean success = jsonResponse1.getBoolean("success");

                            if (success) {
                                String businessname = jsonResponse1.getString("businessname");
                                String username = jsonResponse1.getString("username");

                                Intent intent = new Intent(Login.this, MainActivity.class);
                                intent.putExtra("businessname", businessname);
                                intent.putExtra("username", username);
                                Login.this.startActivity(intent);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                                builder.setMessage("Login Failed , Details Incorrect").setNegativeButton("Retry", null).create().show();
                            }

                        } catch (JSONException e) {


                            e.printStackTrace();
                        }
                    }
                };


                LoginRequest loginrequest = new LoginRequest(username, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Login.this);
                queue.add(loginrequest);

            }
        });
    }


    public void bReg(View view){
        Intent i = new Intent(this,Register.class);
        startActivity(i);
    }
}
