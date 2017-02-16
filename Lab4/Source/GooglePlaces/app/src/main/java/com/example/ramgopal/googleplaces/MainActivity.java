package com.example.ramgopal.googleplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button butt;
    public EditText eu;
    public EditText ep;
    public void hello(){
        butt=(Button)findViewById(R.id.buttonLogin);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eu=(EditText)findViewById(R.id.etUsername);
                ep=(EditText)findViewById(R.id.etPassword);
                if(eu.getText().toString().equals("Google")&& ep.getText().toString().equals("Google"))
                {
                    Intent hello=new Intent(MainActivity.this,GooglePlacesActivity.class);
                    startActivity(hello);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello();
    }
}