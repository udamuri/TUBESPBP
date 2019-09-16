package com.example.tubespbp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Screen extends AppCompatActivity
{
    private Button btnLogin;
    private TextView txtReg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        txtReg = (TextView)findViewById(R.id.txtReg);
        txtReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Screen.this, Register_Screen.class);
            }
        });

        btnLogin = (Button) findViewById(R.id.btnLogLog);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login_Screen.this, MenuScreen_Guest.class);
                startActivity(i);
            }

        });
    }
}
