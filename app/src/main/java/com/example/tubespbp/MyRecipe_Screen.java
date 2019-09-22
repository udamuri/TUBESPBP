package com.example.tubespbp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyRecipe_Screen extends AppCompatActivity
{
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myrecipe_screen);

        btnNext = (Button) findViewById(R.id.recipeBack);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuScreen_User= new Intent(MyRecipe_Screen.this, MenuScreen_User.class);
                startActivity(menuScreen_User);
            }
        });
    }
}
