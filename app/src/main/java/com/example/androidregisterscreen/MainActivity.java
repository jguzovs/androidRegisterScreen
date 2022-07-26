package com.example.androidregisterscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT_USERNAME = "com.example.androidregisterscreen.EXTRA_TEXT_USERNAME";
    public static final String EXTRA_TEXT_EMAIL = "com.example.androidregisterscreen.EXTRA_TEXT_EMAIL";
    public static final String EXTRA_TEXT_PHONE = "com.example.androidregisterscreen.EXTRA_TEXT_PHONE";
    public static final String EXTRA_TEXT_CITY = "com.example.androidregisterscreen.EXTRA_TEXT_CITY";
    public static final String EXTRA_TEXT_PASSWORD = "com.example.androidregisterscreen.EXTRA_TEXT_PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConfirmRegistration();
            }
        });
    }

    //method to open ConfirmRegistration activity and print out all user inputs
    public void openConfirmRegistration() {

        EditText inputUsername = (EditText) findViewById(R.id.inputUsername);
        String inputUsernameText = inputUsername.getText().toString();

        EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
        String inputEmailText = inputEmail.getText().toString();

        EditText inputPhone = (EditText) findViewById(R.id.inputPhone);
        String inputPhoneText = inputPhone.getText().toString();


        EditText inputCity = (EditText) findViewById(R.id.inputCity);
        String inputCityText = inputCity.getText().toString();

        EditText inputPassword = (EditText) findViewById(R.id.inputPassword);
        String inputPasswordText = inputPassword.getText().toString();

        Intent intent = new Intent(this, ConfirmRegistration.class);
        intent.putExtra(EXTRA_TEXT_USERNAME, inputUsernameText);
        intent.putExtra(EXTRA_TEXT_EMAIL, inputEmailText);
        intent.putExtra(EXTRA_TEXT_PHONE, inputPhoneText);
        intent.putExtra(EXTRA_TEXT_CITY, inputCityText);
        intent.putExtra(EXTRA_TEXT_PASSWORD, inputPasswordText);
        startActivity(intent);
    }
}