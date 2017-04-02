package com.example.derrick.mymaruti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button1=(Button)findViewById(R.id.option1);
        Button button2=(Button)findViewById(R.id.option2);
        Button button3=(Button)findViewById(R.id.option3);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(Second.this, Main_Info.class);
                Second.this.startActivity(myIntent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(Second.this,TipTricks.class);
                Second.this.startActivity(myIntent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent myIntent = new Intent(Second.this, trouble.class);
                Second.this.startActivity(myIntent);
            }
        });
    }
}
