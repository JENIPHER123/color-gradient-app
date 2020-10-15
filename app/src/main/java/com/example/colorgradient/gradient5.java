package com.example.colorgradient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class gradient5 extends AppCompatActivity {

    public Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradient5);

        next=(Button)findViewById(R.id.button2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient5.this,gradient6.class);
                startActivity(intent);
            }
        });
        prev=(Button)findViewById(R.id.button1);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gradient5.this,grasient4.class);
                startActivity(intent);
            }
        });
    }
}
