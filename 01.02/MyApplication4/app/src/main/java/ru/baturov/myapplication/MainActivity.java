package ru.baturov.myapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText aField, bField;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        aField = findViewById(R.id.afield);
        bField = findViewById(R.id.bfield);
        findViewById(R.id.resultbtn).setOnClickListener((view) -> getResult());
        findViewById(R.id.button2).setOnClickListener((view) -> openActivity(2));
        findViewById(R.id.button3).setOnClickListener((view) -> openActivity(3));
    }

    private void getResult(){
        try {
            double a = Double.parseDouble(aField.getText().toString());
            double b = Double.parseDouble(bField.getText().toString());
            String res = "";
            for (int i = 0; i <= a; i += b) {
                res += i + " ";
            }
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
            case 2:
                intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(this, ThirdActivity.class);
                startActivity(intent);
                break;
        }
    }
}