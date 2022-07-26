package com.example.androidregisterscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_registration);

        Intent intent = getIntent();
        String userNameText = intent.getStringExtra(MainActivity.EXTRA_TEXT_USERNAME);
        String emailText = intent.getStringExtra(MainActivity.EXTRA_TEXT_EMAIL);
        String phoneText = intent.getStringExtra(MainActivity.EXTRA_TEXT_PHONE);
        String cityText = intent.getStringExtra(MainActivity.EXTRA_TEXT_CITY);
        String passwordText = intent.getStringExtra(MainActivity.EXTRA_TEXT_PASSWORD);

        TextView confirmUsername = findViewById(R.id.confirmUsername);
        TextView confirmEmail = findViewById(R.id.confirmEmail);
        TextView confirmPhone = findViewById(R.id.confirmPhone);
        TextView confirmCity = findViewById(R.id.confirmCity);
        TextView confirmUPassword = findViewById(R.id.confirmPassword);

        confirmUsername.setText("Login: " + userNameText);
        confirmEmail.setText("Email: " + emailText);
        confirmPhone.setText("Phone: " + phoneText);
        confirmCity.setText("City: " + cityText);
        confirmUPassword.setText("Password: "+ passwordText);
    }
}