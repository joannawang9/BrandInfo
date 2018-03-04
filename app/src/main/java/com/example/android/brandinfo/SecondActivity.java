package com.example.android.brandinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle main = getIntent().getExtras();
        String brandInfo = main.getString("string");
        TextView brand = findViewById(R.id.brand);
        brand.setText(brandInfo);

    }
}
