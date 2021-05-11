package com.example.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCounter;
    private Button btnPlus, btnMinus, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCounter = findViewById(R.id.txt_counter);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnReset = findViewById(R.id.btnReset);

        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnReset.setOnClickListener(this);

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

    public void plusFunction(View v) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        counter++;
        txtCounter.setText(counter+"");
    }

    public void minusFunction(View v) {
        int counter = Integer.parseInt(txtCounter.getText().toString());
        if (counter!=0){
            counter--;
            txtCounter.setText(counter+"");
        }
    }

    public void resetFunction(View v) {
        txtCounter.setText("0");
    }

//    public void operation(View v) {
//        int id = v.getId();
//        int counter = 0;
//        switch (id) {
//            case R.id.btnPlus:
//                counter = Integer.parseInt(txtCounter.getText().toString());
//                counter++;
//                txtCounter.setText(counter+"");
//                break;
//            case R.id.btnMinus:
//                counter = Integer.parseInt(txtCounter.getText().toString());
//                if (counter!=0){
//                    counter--;
//                    txtCounter.setText(counter+"");
//                }
//                break;
//            case R.id.btnReset:
//                txtCounter.setText("0");
//                break;
//        }
//    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        int counter = 0;
        switch (id) {
            case R.id.btnPlus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                counter++;
                txtCounter.setText(counter+"");
                break;
            case R.id.btnMinus:
                counter = Integer.parseInt(txtCounter.getText().toString());
                if (counter!=0){
                    counter--;
                    txtCounter.setText(counter+"");
                }
                break;
            case R.id.btnReset:
                txtCounter.setText("0");
                break;
        }
    }
}