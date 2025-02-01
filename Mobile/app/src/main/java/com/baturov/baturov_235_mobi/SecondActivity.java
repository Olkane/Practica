package com.baturov.baturov_235_mobi;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

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

public class SecondActivity extends AppCompatActivity {
    EditText was;
    TextView sad;
    TextView das;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        was = findViewById(R.id.editTextText2);
        das = findViewById(R.id.textView5);
        sad = findViewById(R.id.textView6);
    }

    public void Perech3(View view) {
        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
    }

    public void Rechit(View view) {
        double was1 = Double.parseDouble(was.getText().toString());
        sad.setText("D =" + sqrt((4 * was1) / PI));
        das.setText("L =" + PI * (sqrt(((4 * was1) / PI))));

    }
}
