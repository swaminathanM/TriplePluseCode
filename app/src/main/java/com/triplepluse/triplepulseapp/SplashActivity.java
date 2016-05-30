package com.triplepluse.triplepulseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    private Button signInButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        signInButton = (Button) findViewById(R.id.btn_signin);
        signUpButton = (Button) findViewById(R.id.btn_signup);
        signInButton.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_signup:
                Intent signUpIntent = new Intent(this, CreateAccount.class);
                startActivity(signUpIntent);
                break;
            case R.id.btn_signin:
                Intent signInIntent = new Intent(this, LoginActivity.class);
                startActivity(signInIntent);
                break;
        }
    }
}
