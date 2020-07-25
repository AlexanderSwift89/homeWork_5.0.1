package com.example.classwork_200;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_test);
        button.setOnClickListener(new View.OnClickListener[] {
        @Override
                public void onClickView(View v){
            System.out.println("Hi bro");
        }
    }};
}