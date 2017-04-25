package com.example.andrew.hassapp;


import com.android.volley.Request;
import com.android.volley.Response;

import java.util.Map;

public class LoginRequest {


    private static final String REGISTER_REQUEST_URL="http://192.168.0.17/WebD/HASSAPP/register.php";
    private Map<String, String> params;

    public RegisterRequest(String businessname,String email,String username,String password , Response.Listener<String> listener) {
        super(Request.Method.POST, REGISTER_REQUEST_URL, listener, null);
    }

}
