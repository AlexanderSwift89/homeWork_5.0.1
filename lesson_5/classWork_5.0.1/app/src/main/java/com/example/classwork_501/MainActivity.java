package com.example.classwork_501;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText enteredEditText;
    private Button saveBtn;
    private static final String SHARED_PREF_NAME="main_name";
    private static final String SHARED_KEY_TEXT="shared_key_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        getSupportActionBar().setTitle("Awesome title");

        String saveText = getSavedText();
        enteredEditText.setText(saveText);

        saveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String enteredStr = enteredEditText.getText().toString();
                saveText(enteredStr);
            }
        });
    }

    private String getSavedText(){
        return getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE).getString(SHARED_KEY_TEXT," ");
    }

    private void saveText(String enteredStr){
        SharedPreferences shared = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        shared.edit()
              .putString(SHARED_KEY_TEXT,enteredStr)
              .apply();
    }

    private void initView(){
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        enteredEditText = findViewById(R.id.eneteredEditText);
        saveBtn = findViewById(R.id.saveBtn);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.exit) {
            Toast.makeText(MainActivity.this, "Exiting...", Toast.LENGTH_LONG).show();
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}