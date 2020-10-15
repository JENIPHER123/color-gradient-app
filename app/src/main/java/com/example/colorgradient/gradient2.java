package com.example.colorgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class gradient2 extends AppCompatActivity {

    public Button next , prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient2);
        next= (Button)findViewById(R.id.button2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient2.this,gradient3.class);
                startActivity(intent);
            }
        });

        prev= (Button)findViewById(R.id.button1);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
