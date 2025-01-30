package com.baturov.baturov_235_mobi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
EditText was;
TextView sad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        was = findViewById(R.id.editTextText);
        sad = findViewById(R.id.textView4);
    }
    public void Perech2(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void Resh(View view) {
        double was1 = Double.parseDouble(was.getText().toString());
        sad.setText( String.valueOf(was1 * was1));
    }
}