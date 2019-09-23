package com.example.tubespbp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Screen extends AppCompatActivity
{
    private Button btnLogin;
    private TextView txtReg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);


        txtReg=findViewById(R.id.txtReg);


        String text =
                "Click Here";

        // Initialize a new SpannableStringBuilder instance
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(text);

        // Initialize a new ClickableSpan to display red background
        ClickableSpan redClickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                // Do something
                startActivity(new Intent(Login_Screen.this,Register_Screen.class));
            }
        };

        ssBuilder.setSpan(
                redClickableSpan, // Span to add
                text.indexOf("Click Here"), // Start of the span (inclusive)
                text.indexOf("Click Here") + String.valueOf("Click Here").length(), // End of the span (exclusive)
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE // Do not extend the span when text add later
        );

        // Display the spannable text to TextView
        txtReg.setText(ssBuilder);

        // Specify the TextView movement method
        txtReg.setMovementMethod(LinkMovementMethod.getInstance());

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
