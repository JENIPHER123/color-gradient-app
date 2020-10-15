package com.example.colorgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gradient3 extends AppCompatActivity {
    public Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient3);

        next= (Button)findViewById(R.id.button2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient3.this,grasient4.class);
                startActivity(intent);
            }
        });

        prev= (Button)findViewById(R.id.button1);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient3.this,gradient2.class);
                startActivity(intent);
            }
        });
    }
}
