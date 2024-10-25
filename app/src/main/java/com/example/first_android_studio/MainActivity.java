package com.example.first_android_studio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonLogin = findViewById(R.id.button_login);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchLogin();
            }
        });

        Button botonRegister = findViewById(R.id.button_register);
        botonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRegister();
            }
        });
    }

    public void launchLogin() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void launchRegister() {
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}



