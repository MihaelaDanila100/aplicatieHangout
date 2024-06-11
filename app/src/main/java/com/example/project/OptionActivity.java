package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OptionActivity extends AppCompatActivity
{
    ImageButton img_btn1, img_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        img_btn1 = findViewById(R.id.imageButton);
        img_btn2=findViewById(R.id.imageButton2);
        img_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this, LocatiiActivity.class));
            }
        });

        img_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionActivity.this, UsersPage.class));
            }
        });

    }
}
