package ru.baturov.myapplication;

import static java.lang.Math.max;
import static java.lang.Math.min;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText aField, bField, cField;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        aField = findViewById(R.id.afield);
        bField = findViewById(R.id.bfield);
        cField = findViewById(R.id.сfield);
        findViewById(R.id.resultbtn).setOnClickListener((view) -> getResult());
        findViewById(R.id.button1).setOnClickListener((view) -> openActivity(1));
        findViewById(R.id.button3).setOnClickListener((view) -> openActivity(3));
    }

    private void getResult(){
        try {
            double a = Double.parseDouble(aField.getText().toString());
            double b = Double.parseDouble(bField.getText().toString());
            double c = Double.parseDouble(cField.getText().toString());
            double res1 = a * b;
            double res2 = b * c;
            String res = min(res1, res2) + " " + max(res1, res2);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Result")
                    .setMessage(res)
                    .setPositiveButton("Закрыть", null);

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
            case 3:
                finish();
                intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
        }
    }
}
