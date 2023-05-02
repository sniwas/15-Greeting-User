package com.example.greetinguser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class greetingscreen extends AppCompatActivity {
    TextView tv;
    String username,quote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greetingscreen);
        tv=findViewById(R.id.textView);
        Intent intent2=getIntent();
        username=intent2.getStringExtra("username");
        quote=username+" if you don't believe the sun will rise, stand alone and greet the coming night in the last remaining light.\n ~ Chris Cornell";
        tv.setText(quote);
    }
}