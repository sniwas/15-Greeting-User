package com.example.greetinguser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText user;
    Button b;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.username);
        b=findViewById(R.id.enter);
        b.setOnClickListener(V ->{
            String name=user.getText().toString();
            if(TextUtils.isEmpty(name))
            {
                user.setError("Enter username");
            }
            else {
                Intent intent = new Intent(getApplicationContext(), greetingscreen.class);
                intent.putExtra("username", name);
                startActivity(intent);
            }
        });
    }
}