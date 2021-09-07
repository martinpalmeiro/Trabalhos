package com.example.mobile2021_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void cadastroActivity(View view){
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(getBaseContext(), MainActivity3.class));
            }
        });
    }
}
