package com.example.myapplication;



import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spFrom = findViewById(R.id.spi032);
        spTo = findViewById(R.id.spi031);
        etFrom = findViewById(R.id.spiName);
        tvTo = findViewById(R.id.txt03);

        ArrayAdapter <String> adp =new <String> ArrayAdapter(this, android.R.layout.simple_list_item_1);

        adp.add("mm");
        adp.add("cm");
        adp.add("m");
        adp.add("km");

        spFrom.setAdapter(adp);
        spTo.setAdapter(adp);
    }
    Spinner spFrom;
    Spinner spTo;
    EditText etFrom;
    TextView tvTo;


    public void on_convert(View v)
    {
        float from = Float.parseFloat(etFrom.getText().toString());

        String aFrom = (String) spFrom.getSelectedItem();
        String aTo = (String) spTo.getSelectedItem();

        float to = 0.0f;

        if (aFrom.equals("mm"))
        {
            if (aTo.equals("mm")) to = from;
            if (aTo.equals("cm")) to = from * 0.1f;
            if (aTo.equals("m")) to = from * 0.001f;
            if (aTo.equals("km")) to = from * 0.000001f;

            tvTo.setText(String.valueOf(to));


        }
        if (aFrom.equals("cm"))
        {
            if (aTo.equals("mm")) to = from * 10;
            if (aTo.equals("cm")) to = from;
            if (aTo.equals("m")) to = from * 0.01f;
            if (aTo.equals("km")) to = from * 0.00001f;

            tvTo.setText(String.valueOf(to));


        }
        if (aFrom.equals("m"))
        {
            if (aTo.equals("mm")) to = from * 1000;
            if (aTo.equals("cm")) to = from * 100;
            if (aTo.equals("m")) to = from;
            if (aTo.equals("km")) to = from * 0.001f;

            tvTo.setText(String.valueOf(to));


        }
        if (aFrom.equals("km"))
        {
            if (aTo.equals("mm")) to = from * 1000000;
            if (aTo.equals("cm")) to = from *  100000;
            if (aTo.equals("m")) to = from * 1000;
            if (aTo.equals("km")) to = from;

            tvTo.setText(String.valueOf(to));


        }



    }
}
