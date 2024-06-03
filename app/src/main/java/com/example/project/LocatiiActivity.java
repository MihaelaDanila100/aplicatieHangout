package com.example.project;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class LocatiiActivity  extends AppCompatActivity {

       Button interes1;
       Button interes2;
       Button interes3;
       Button interes4;
       Button interes5;
       Button interes6;

       Button report1;
       Button report2;
       Button report3;
       Button report4;
       Button report5;
       Button report6;
       Button people;
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_locatii);
            interes1 = findViewById(R.id.messageButton);
            interes2 = findViewById(R.id.messageButton3);
            interes3 = findViewById(R.id.interesButton3);
            interes4 = findViewById(R.id.messageButton4);
            interes5 = findViewById(R.id.messageButton5);
            interes6 = findViewById(R.id.messageButton6);
            report1 = findViewById(R.id.reportButton);
            report2 = findViewById(R.id.reportButton3);
            report3 = findViewById(R.id.reportButton4);
            report4 = findViewById(R.id.reportButton5);
            report5 = findViewById(R.id.reportButton6);
            report6 = findViewById(R.id.reportButton7);
            people = findViewById(R.id.buttonPeople);
            interes1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });

            interes2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });
            interes3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });
            interes4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });
            interes5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });
            interes6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati aratat interes!", Toast.LENGTH_SHORT).show();
                }
            });

            report1.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });
            report2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });
            report3.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });
            report4.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });
            report5.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });
            report6.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Toast.makeText(LocatiiActivity.this, "Ati raportat!", Toast.LENGTH_SHORT).show();
                }
            });

            people.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    startActivity(new Intent(getApplicationContext(), UsersPage.class));
                }
            });



    }

}
