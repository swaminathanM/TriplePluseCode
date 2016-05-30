package com.triplepluse.triplepulseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity implements View.OnClickListener {
    private Button createAccountButton;
    private TextView loginIdAvailable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        createAccountButton = (Button) findViewById(R.id.create_account_button);
        loginIdAvailable = (TextView) findViewById(R.id.login_id_available);
        createAccountButton.setOnClickListener(this);
        loginIdAvailable.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==createAccountButton) {
            Intent dashboardActivityIntent = new Intent(this, NavigationDrawerActivity.class);
            startActivity(dashboardActivityIntent);
        } else {
            Intent signInActivityIntent =new Intent(this,LoginActivity.class);
            startActivity(signInActivityIntent);
        }
    }
}
