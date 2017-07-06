package com.wordpress.ambergautam.a2zdictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1;
        b1 = (Button)findViewById(R.id.ete);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Home.this,English_to_english.class);
                        startActivity(i);
                    }
                }

        );
        Button b2;
        b2 = (Button)findViewById(R.id.eth);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Home.this,English_to_english.class);
                        startActivity(i);
                    }
                }

        );
        Button b3;
        b3 = (Button)findViewById(R.id.about);
        b3.setOnClickListener(
                new Button.OnClickListener(){


                    public void onClick(View v)
                    {
                        Toast.makeText(Home.this, "Developed by: Amber Gautam",Toast.LENGTH_SHORT).show();

                    }
                }

        );
    }
}
