package com.example.tylershaprefrontend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class LandingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setContentView(R.layout.landing);

        Button button = findViewById(R.id.start_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUploadActivity();
            }
        });

        button = findViewById(R.id.join_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClientActivity();
            }
        });
    }

    public void openUploadActivity() {
        Intent intent = new Intent(this, UploadActivty.class);
        startActivity(intent);
    }

    public void openClientActivity() {
        Intent intent = new Intent(this, ClientActivity.class);
        startActivity(intent);
    }
}
