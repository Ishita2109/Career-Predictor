package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.navigationtry.Home;
import com.example.navigationtry.LoadPage;


public class login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);
//        getSupportActionBar().setTitle("LogIn Form");
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(), Signup_form.class));
    }

    public void btn_home(View view) {
       startActivity(new Intent(getApplicationContext(), LoadPage.class));
    }
}
