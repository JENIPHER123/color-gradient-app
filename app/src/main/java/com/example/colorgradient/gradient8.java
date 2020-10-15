package com.example.colorgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class gradient8 extends AppCompatActivity {

    public Button prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient8);

        prev=findViewById(R.id.button2);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient8.this,gradient7.class);
                startActivity(intent);
            }
        });
    }
}
