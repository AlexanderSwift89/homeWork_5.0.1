package com.example.classwork_401;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText inputEdtx;
    private Spinner countriesSpnr;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.countries,
                android.R.layout.simple_list_item_1);
        countriesSpnr.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String inputEdtxStr = inputEdtx.getText().toString();
                String countriesSpnrStr = (String) countriesSpnr.getSelectedItem();
                Toast.makeText(MainActivity.this, "Email: " + inputEdtxStr + ". Country: " + countriesSpnrStr,Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initViews(){
        textView = findViewById(R.id.textView);
        inputEdtx = findViewById(R.id.inputEdtx);
        countriesSpnr = findViewById(R.id.countriesSpnr);
        btnSubmit = findViewById(R.id.btnSubmit);
    }
}