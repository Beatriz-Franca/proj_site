package com.liorspencer.projex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextBmaior;
    private TextView textViewResultado;
    private Trapezio trapezio;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText editTextBmenor = findViewById(R.id.editTextBmenor);
        editTextBmaior = findViewById(R.id.editTextBmaior);
        EditText editTextAltura = findViewById(R.id.editTextAltura);
        Button buttonCalcula = findViewById(R.id.buttonCalcula);
        textViewResultado = findViewById(R.id.editTextAltura);

        buttonCalcula.setOnClickListener(new View.OnClickListener() {

                                             @Override
            public void onClick(View view) {
                trapezio = new Trapezio(Double.parseDouble(editTextBmaior.getText().toString()),Double.parseDouble(editTextBmenor.getText().toString()),Double.parseDouble(editTextAltura.getText().toString()));
                textViewResultado.setText("resultado: " + trapezio.calcularArea());
                editTextBmenor.setText("");
                editTextBmaior.setText("");
                editTextAltura.setText("");

            }
        }
        );
    }
    }

