package com.example.a012;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageView) findViewById(R.id.imageView2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageButton.setImageResource(R.drawable.ytr7y);
            }
        });
    }
}
