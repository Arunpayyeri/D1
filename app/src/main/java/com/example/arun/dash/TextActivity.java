package com.example.arun.dash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
TextView text,textg;
Button btnminus,btnplus,btngminus,btngplus;
int mint=04;
int gint=06;
int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        btnminus=(Button)findViewById(R.id.btnminus);
        btnplus=(Button)findViewById(R.id.btnplus);
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
        btngminus=(Button)findViewById(R.id.btngminus);
        btngplus=(Button)findViewById(R.id.btngplus);
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



