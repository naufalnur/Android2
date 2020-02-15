package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSin, btnCos, btnTan, btnCosec, btnSec, btnCotan, btnLog;
    private TextView tvHasil;
    private EditText etInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSin = findViewById(R.id.b1);
        btnCos = findViewById(R.id.b2);
        btnTan = findViewById(R.id.b3);
        btnCosec = findViewById(R.id.b4);
        btnSec = findViewById(R.id.b5);
        btnCotan = findViewById(R.id.b6);
        btnLog = findViewById(R.id.b7);
        tvHasil = findViewById(R.id.tv1);
        etInput = findViewById(R.id.et1);

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.sin(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.cos(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.tan(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.sin(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.cos(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCotan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1/Math.tan(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput= etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.log10(input);
                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
