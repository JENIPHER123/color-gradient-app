package com.example.colorgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class grasient4 extends AppCompatActivity {

    public Button next,prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grasient4);

        next=findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grasient4.this,gradient5.class);
                startActivity(intent);
            }
        });

        prev=findViewById(R.id.button1);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grasient4.this,gradient3.class);
                startActivity(intent);
            }
        });
    }
}
