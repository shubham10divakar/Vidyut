package com.example.subhamdivakar.alice.Vidyut;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.subhamdivakar.alice.AboutDeveloper;
import com.example.subhamdivakar.alice.GPSTracking;
import com.example.subhamdivakar.alice.MainActivity;
import com.example.subhamdivakar.alice.Navigation;
import com.example.subhamdivakar.alice.R;

public class VMain2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vmain2);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        // Sets the Toolbar to act as the ActionBar for this Activity window.
//        // Make sure the toolbar exists in the activity and is not null
//        setSupportActionBar(toolbar);
        GridView gridview = (GridView) findViewById(R.id.simpleGridView);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id)
            {
                // Send intent to SingleViewActivity
//                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
//                // Pass image index
//                i.putExtra("id", position);
//                startActivity(i);
                if(position == 0)
                {
                    Intent obj=new Intent(VMain2Activity.this, MainActivity.class);
                    startActivity(obj);
                }
                else if(position == 1)
                {
                    Intent obj=new Intent(VMain2Activity.this, GPSTracking.class);
                    startActivity(obj);
                }
                else if(position == 2)
                {
                    Intent obj=new Intent(VMain2Activity.this, MyProfile.class);
                    startActivity(obj);
                }
                else if(position==4)
                {
                    //Toast.makeText(VMain2Activity.this, "Selected"+position, Toast.LENGTH_SHORT).show();
                    Intent obj=new Intent(VMain2Activity.this, AboutDeveloper.class);
                    startActivity(obj);
                }
                else {
                    Toast.makeText(VMain2Activity.this, "Feature in development", Toast.LENGTH_SHORT).show();
                }
//                Toast.makeText(VMain2Activity.this, "Selected"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
