package com.codingbusters.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView LoginIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Initialization();
        LoginIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 SendUserToSignUpActivity();
            }
        });
    }

    private void Initialization() {
        LoginIntent = findViewById(R.id.login_sign_up_btn);
    }

    private void SendUserToSignUpActivity() {
        Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}