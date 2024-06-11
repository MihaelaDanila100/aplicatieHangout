package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RegisterActivity extends AppCompatActivity {

    TextInputEditText username1;
    EditText password1, repassword1, email1;
    TextView login;

    Button register;
    DBHelper DB;
    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        login = findViewById(R.id.alreadyHaveAccount);
        DB = new DBHelper(this);
        username1 = findViewById(R.id.inputUsername);
        password1 = findViewById(R.id.inputPassword);
        repassword1 = findViewById(R.id.inputConfirmPassword);
        email1 = findViewById(R.id.inputEmail);
        register = findViewById(R.id.btnregister);
        imageView1 = findViewById(R.id.imageView8);
        imageView2 = findViewById(R.id.imageView9);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertLocal();
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                repassword1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        });

    }

    private void insertLocal() {
        Boolean checkuser = DB.checkusername(username1.getText().toString());

        if (TextUtils.isEmpty(username1.getText().toString()) || TextUtils.isEmpty(email1.getText().toString()) || TextUtils.isEmpty(password1.getText().toString()) || TextUtils.isEmpty(repassword1.getText().toString())) {
            Toast.makeText(RegisterActivity.this, "All fields Required", Toast.LENGTH_SHORT).show();
        } else
        //               else Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
        {
            if (password1.getText().toString().equals(repassword1.getText().toString())) {

                if (checkuser == false) {
                    Boolean insert = DB.insertData(username1.getText().toString(), email1.getText().toString(), password1.getText().toString());
                    if (insert == true) {
                        Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                    } else
                        Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(RegisterActivity.this, "That username’s been taken. I guess great minds really do think alike.", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(RegisterActivity.this, "Passwords are not matching", Toast.LENGTH_SHORT).show();
        }
    }
}


