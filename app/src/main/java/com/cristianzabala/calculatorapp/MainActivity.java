package com.cristianzabala.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sumar, restar, dividir, multiplicar;
    EditText num1, num2;
    TextView resultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumar = findViewById(R.id.sumar);
        restar = findViewById(R.id.restar);
        dividir = findViewById(R.id.dividir);
        multiplicar = findViewById(R.id.multiplicar);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSumar(view);
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickRestar(view);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMultiplicar(view);
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickDividir(view);
            }
        });
    }

    public void clickSumar(View view) {
        try {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double result = n1 + n2;
            resultado.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingrese números válidos", Toast.LENGTH_SHORT).show();
        }23
    }

    public void clickRestar(View view) {
        try {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double result = n1 - n2;
            resultado.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingrese números válidos", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickMultiplicar(View view) {
        try {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double result = n1 * n2;
            resultado.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingrese números válidos", Toast.LENGTH_SHORT).show();
        }
    }

    public void clickDividir(View view) {
        try {
            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            if (n2 != 0) {
                double result = n1 / n2;
                resultado.setText(String.valueOf(result));
            } else {
                Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show();
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor ingrese números válidos", Toast.LENGTH_SHORT).show();
        }
    }
}
