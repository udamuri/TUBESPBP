package com.example.tubespbp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuScreen_User extends AppCompatActivity
{
    private Button btnNextMyRecipe, btnNextProfile, btnNextHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuscreen_user);

        btnNextMyRecipe = (Button) findViewById(R.id.myRecipe);
        btnNextMyRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextMyRecipe= new Intent(MenuScreen_User.this, MyRecipe_Screen.class);
                startActivity(nextMyRecipe);
            }
        });

        btnNextHomeScreen = (Button) findViewById(R.id.homeScreen);
        btnNextHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextHomeScreen= new Intent(MenuScreen_User.this, Home_Screen.class);
                startActivity(nextHomeScreen);
            }
        });

        btnNextProfile = (Button) findViewById(R.id.profile);
        btnNextProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextProfile= new Intent(MenuScreen_User.this, Profile_Screen.class);
                startActivity(nextProfile);
            }
        });
    }
}
