package com.example.fabian.tinf15b4_lsmf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.app.Activity;
public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void navToRegister(View view)
    {
        Intent i = new Intent(getApplicationContext(), register.class);
        startActivity(i);

    }
}