package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity
{
   Button btn_people, btn_locations, btn_logout;
   BottomNavigationView nav;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_people = findViewById(R.id.btnPeople);
        btn_locations = findViewById(R.id.btnLocation);
        btn_logout = findViewById(R.id.btnLogout);
        nav = findViewById(R.id.bottomNavigationView);
        btn_people.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), UsersPage.class));
            }
        });
        btn_locations.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), LocatiiActivity.class));
            }
        });
        btn_logout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });


        nav.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.people:

                        startActivity(new Intent(getApplicationContext(), UsersPage.class));
                        break;

                    case R.id.location:

                        startActivity(new Intent(getApplicationContext(), LocatiiActivity.class));
                        break;

                }
                return true;
            }
        });



    }
}
