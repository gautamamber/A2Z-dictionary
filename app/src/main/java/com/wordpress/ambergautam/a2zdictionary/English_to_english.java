package com.wordpress.ambergautam.a2zdictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.wordpress.ambergautam.a2zdictionary.R.id.write;

public class English_to_english extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_to_english);
        EditText e1;
        e1 = (EditText) findViewById(write);
        ImageButton b2;
        b2 = (ImageButton)findViewById(R.id.b2);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(English_to_english.this,Home.class);
                        startActivity(i);
                    }
                }

        );
        final Button b1;
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {


                        Intent i =new Intent(English_to_english.this,Result.class);
                        startActivity(i);
                        Toast.makeText(English_to_english.this, "Developed by: Amber Gautam",Toast.LENGTH_SHORT).show();

                    }



                }



        );
    }
}
