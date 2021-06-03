package com.example.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity implements View.OnClickListener {

    private Button btnConvert;
    private EditText edtDollar;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        btnConvert = findViewById(R.id.btn_convert);
        edtDollar = findViewById(R.id.edit_dollar);
        txtResult = findViewById(R.id.txt_result);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (edtDollar.getText().toString().length() > 0){
            double dollar = Double.parseDouble(edtDollar.getText().toString());
            double convertPound = dollar * 0.77;
            txtResult.setText(convertPound+"");
        } else {
            Toast.makeText(this, "Enter Value!", Toast.LENGTH_SHORT).show();
        }
    }
}