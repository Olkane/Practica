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

public class StartActivity extends AppCompatActivity {
    EditText was;
    TextView sad;
    EditText das;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        was = findViewById(R.id.editTextText3);
        das = findViewById(R.id.editTextText4);
        sad = findViewById(R.id.textView7);
    }

    public void Perech4(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Rechat(View view) {
        double was1 = Double.parseDouble(was.getText().toString());
        double was2 = Double.parseDouble(das.getText().toString());
        sad.setText(String.valueOf(-1 * was1 / was2));
    }
}