package ru.baturov.myapplication;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    EditText xField, yField, mField, nField, aField;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        xField = findViewById(R.id.xfield);
        yField = findViewById(R.id.yfield);
        mField = findViewById(R.id.mfield);
        nField = findViewById(R.id.nfield);
        aField = findViewById(R.id.afield);
        findViewById(R.id.resultbtn).setOnClickListener((view) -> getResult());
        findViewById(R.id.button1).setOnClickListener((view) -> openActivity(1));
        findViewById(R.id.button2).setOnClickListener((view) -> openActivity(2));
    }

    private void getResult(){
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Result").setPositiveButton("Закрыть", null);
            double x = Double.parseDouble(xField.getText().toString());
            double y = Double.parseDouble(yField.getText().toString());
            double m = Double.parseDouble(mField.getText().toString());
            double n = Double.parseDouble(nField.getText().toString());
            double A = Double.parseDouble(aField.getText().toString());
            double r = sqrt(pow(x, 2) + pow(y, 2));
            if (pow(m + x, 2) + pow(n + y, 2) <= pow(r, 2) && pow(m + x, 2) + pow(n - A + y, 2) <= pow(r, 2) && pow(m - A + x, 2) + pow(n - A + y, 2) <= pow(r, 2) && pow(m - A + x, 2) + pow(n + y, 2) <= pow(r, 2)) {
                builder.setMessage("Принадлежит");
            } else {
                builder.setMessage("Не принадлежит");
            }
            AlertDialog dialog = builder.create();
            dialog.show();
        }catch (Exception e){
            System.out.println("Ошибка" + e);
        }
    }
    private void openActivity(int id){
        switch (id){
            case 1:
                finish();
                break;
            case 2:
                finish();
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}