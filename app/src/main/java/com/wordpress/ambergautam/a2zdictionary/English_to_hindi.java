package com.wordpress.ambergautam.a2zdictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class English_to_hindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_to_hindi);
        ImageButton b2;
        b2 = (ImageButton)findViewById(R.id.b2);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(English_to_hindi.this,Home.class);
                        startActivity(i);
                    }
                }

        );
        Button b1;
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(English_to_hindi.this,Result.class);
                        startActivity(i);
                        Toast.makeText(English_to_hindi.this, "Developed by: Amber Gautam",Toast.LENGTH_SHORT).show();

                    }
                }

        );

    }
}
