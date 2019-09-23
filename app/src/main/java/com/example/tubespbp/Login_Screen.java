package com.example.tubespbp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Screen extends AppCompatActivity
{
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);

        btnLogin= (Button)findViewById(R.id.btnLogLog);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnLogin= new Intent(Login_Screen.this, Beranda.class);
                startActivity(btnLogin);
            }
        });
    }
}
