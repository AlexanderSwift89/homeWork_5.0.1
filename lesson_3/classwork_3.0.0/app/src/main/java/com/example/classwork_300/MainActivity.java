package com.example.classwork_300;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText upperEdtx;
    private EditText lowerEdtx;
    private EditText pulseEdtx;
    private CheckBox tachChbx;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"saved button clicked");
                String upperStr = upperEdtx.getText().toString();
                String lowerStr = lowerEdtx.getText().toString();
                String pulseStr = pulseEdtx.getText().toString();
                boolean haveTach = tachChbx.isChecked();

                try {
                    int upper = Integer.parseInt(upperStr);
                    int lower = Integer.parseInt(lowerStr);
                    int pulse = Integer.parseInt(pulseStr);

                    String result = getString(R.string.upperHint) + ": " + upper + " " +
                            getString(R.string.lowerHint) + ": " + lower + " " + getString(R.string.pulse) +
                            ": " + pulse + " " + getString(R.string.tachCbx) + ": " + haveTach;
                    Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, R.string.incorrect_value, Toast.LENGTH_SHORT).show();
                } finally {
                    upperEdtx.getText().clear();
                    lowerEdtx.getText().clear();
                    pulseEdtx.getText().clear();
                }
            }
        });
    }

    private void init() {
        upperEdtx = findViewById(R.id.upperEdtx);
        lowerEdtx = findViewById(R.id.lowerEdtx);
        pulseEdtx = findViewById(R.id.pulseEdtx);
        tachChbx = findViewById(R.id.tachChbx);
        saveBtn = findViewById(R.id.saveBtn);
        Log.d(TAG, "All views initialized");
    }
}