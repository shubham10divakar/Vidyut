package com.example.subhamdivakar.alice.Vidyut;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.subhamdivakar.alice.R;

public class VMainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vmain);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(VMainActivity.this, VMain2Activity.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}
