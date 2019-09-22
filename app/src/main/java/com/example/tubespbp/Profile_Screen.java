package com.example.tubespbp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Profile_Screen extends AppCompatActivity
{
    private Button btnNextEditProfile, btnPrevMenuScreenUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_screen);

        btnNextEditProfile=(Button) findViewById(R.id.nextEditProfile);
        btnNextEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextEditProfile= new Intent(Profile_Screen.this, Edit_Profile.class);
                startActivity(nextEditProfile);
            }
        });

        btnPrevMenuScreenUser= (Button) findViewById(R.id.backMenuScreenUser);
        btnPrevMenuScreenUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prevMenuScreenUser= new Intent(Profile_Screen.this, MenuScreen_User.class);
                startActivity(prevMenuScreenUser);
            }
        });

    }
}
