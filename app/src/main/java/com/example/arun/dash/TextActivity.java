package com.example.arun.dash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.arun.dash.activity.MainActivity;

public class TextActivity extends AppCompatActivity {
TextView text,textg;
Button btnpass;
ImageButton btnminus,btnplus,btngminus,btngplus;
int mint=04;
int gint=06;
int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        btnminus=(ImageButton)findViewById(R.id.btnminus);
        btnplus=(ImageButton) findViewById(R.id.btnplus);
        text=(TextView)findViewById(R.id.text);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mint=mint+1;
                display(mint);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mint=mint-1;
                display(mint);
            }
        });
        textg=(TextView)findViewById(R.id.textg);
        btngminus=(ImageButton) findViewById(R.id.btngminus);
        btngplus=(ImageButton) findViewById(R.id.btngplus);
        btngplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gint=gint+1;
                displayg(gint);
            }
        });
        btngminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gint=gint-1;
                displayg(gint);
            }
        });

     /*   btnpass=(Button)findViewById(R.id.btnpass);
        btnpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent myIntent = new Intent(TextActivity.this, MainActivity.class);
                //myIntent.putExtra("key", "value");
                //startActivity(myIntent);


                String text1 = text.getText().toString();

                Intent myIntent = new Intent(TextActivity.this,MainActivity.class);
                myIntent.putExtra("mytext",text1);
                finish();
                startActivity(myIntent);

            }
        }); */
    }
  /*  public void increase(View view)
    {
        mint=mint+1;
        display(mint);
    } */
    private void display(int number)
    {
        text.setText(""+number);
        if (number<=9)
        {
            text.setText("0"+number);
        }
        if (number<=0)
        {
            text.setText("00");
            btnminus.setClickable(false);

        }
        else {
            btnminus.setClickable(true);
        }
    }
    private void displayg(int number)
    {
        textg.setText(""+number);


        if (number<=9)
        {
            textg.setText("0"+number);
        }
        if (number<=0)
        {
            textg.setText("00");
            btngminus.setClickable(false);

        }
        else {
            btngminus.setClickable(true);
        }
    }
}



