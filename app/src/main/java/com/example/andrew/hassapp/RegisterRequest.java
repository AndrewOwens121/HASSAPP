package com.example.andrew.hassapp;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest{

    private static final String REGISTER_REQUEST_URL="https://hassapp.000webhostapp.com/register.php";
    private Map<String, String> params;

    public RegisterRequest(String businessname,String username,String password , Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("businessname",businessname);
        params.put("username",username);
        params.put("password",password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
