package com.example.myapplication;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewFromCode = new TextView(this);

        textViewFromCode.setText("Text");
        RelativeLayout.LayoutParams relativeLp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        textViewFromCode.setLayoutParams(relativeLp);
        relativeLp.addRule(RelativeLayout.BELOW, R.id.b96);
        relativeLp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        RelativeLayout root = findViewById(R.id.root);
        root.addView(textViewFromCode);
    }
}