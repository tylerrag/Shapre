package com.example.tylershaprefrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressLint("Registered")
public class PresenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presenter);

        Button end_button = findViewById(R.id.end);
        end_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLandingActivity();
            }
        });
    }


    public void openLandingActivity() {
        Intent intent = new Intent(this, LandingActivity.class);
        startActivity(intent);
    }
}