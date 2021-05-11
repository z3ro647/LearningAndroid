package com.example.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCounter = findViewById(R.id.txt_counter);
        btnPlus = findViewById(R.id.plus);
        btnMinus = findViewById(R.id.minus);
        btnReset = findViewById(R.id.reset);

//        btnPlus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int counter = Integer.parseInt(txtCounter.getText().toString());
//                counter++;
//                txtCounter.setText(counter+"");
//            }
//        });
//
//        btnMinus.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View v){
//                 int counter = Integer.parseInt(txtCounter.getText().toString());
//                 counter--;
//                 txtCounter.setText(counter+"");
//            }
//        });
//
//        btnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtCounter.setText("0");
//            }
//        });
    }

    public void plusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        counter++;
        txtCounter.setText(counter+"");
    }

    public void minusFunction(View view) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        if (counter!=0){
            counter--;
            txtCounter.setText(counter+"");
        }
    }

    public void resetFunction(View view) {
        txtCounter.setText("0");
    }
}