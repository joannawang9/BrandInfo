package com.example.android.brandinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    EditText mName;
    EditText mHistory;
    CheckBox mLocal;
    EditText mInformation;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.name);
        mHistory = findViewById(R.id.history);
        mLocal = findViewById(R.id.checkbox);
        mInformation = findViewById(R.id.information);
        submit = findViewById(R.id.submit);

    }

    public void onClick(View view){
        String name = mName.getText().toString();
        String history = mHistory.getText().toString();
        int historyLength;
        try{
            historyLength = Integer.parseInt(history);
        }catch(NumberFormatException ex){
            historyLength = 0;
        }
        boolean isLocal = mLocal.isChecked();
        String information = mInformation.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        Brand b = new Brand(name,historyLength,isLocal,information);
        //intent.putExtra(Keys.STRING,b.toString());
        intent.putExtra("string",b.toString());
        startActivity(intent);

    }


}
