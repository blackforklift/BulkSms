package com.example.bulksms;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class IntroActivity extends AppCompatActivity {
    FirebaseAuth lAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);
        findViewById(R.id.intro_kayit).setOnClickListener(view -> {startActivity(new Intent(IntroActivity.this,RegisterActivity.class));});
        lAuth = FirebaseAuth.getInstance();

        if(lAuth.getCurrentUser() != null){
            //startActivity(new Intent(IntroActivity.this, MainActivity.class));
            Toast.makeText(IntroActivity.this, "Yönlendiriliyorsunuz", Toast.LENGTH_SHORT).show();
        }
    }
}