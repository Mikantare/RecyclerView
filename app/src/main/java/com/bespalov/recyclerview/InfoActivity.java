package com.bespalov.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class InfoActivity extends AppCompatActivity {

    private ImageView imageViewLogoInfo;
    private TextView textViewNameINfo, textViewDescriptionInfo;
    public List<Dop> dops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        imageViewLogoInfo = findViewById(R.id.imageViewLogo);
        textViewNameINfo = findViewById(R.id.textViewNameINfo);
        textViewDescriptionInfo = findViewById(R.id.textViewDescriptionInfo);
        imageViewLogoInfo.setImageResource(intent.getIntExtra("image",0));
        textViewNameINfo.setText(intent.getStringExtra("name"));
        textViewDescriptionInfo.setText(intent.getStringExtra("info"));

    }
}