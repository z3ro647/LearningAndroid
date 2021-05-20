package com.example.learningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    private ImageView ivPlaceholder;
    private Button btnRollDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        ivPlaceholder = findViewById(R.id.iv_placeholder);
        btnRollDice = findViewById(R.id.btn_roll_dice);

        final Random random = new Random();

        btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(6)+1;
                if (randomNumber == 1) {
                    ivPlaceholder.setImageResource(R.drawable.one);
                } else if (randomNumber == 2) {
                    ivPlaceholder.setImageResource(R.drawable.two);
                } else if (randomNumber == 3) {
                    ivPlaceholder.setImageResource(R.drawable.three);
                } else if (randomNumber == 4) {
                    ivPlaceholder.setImageResource(R.drawable.four);
                } else if (randomNumber == 5) {
                    ivPlaceholder.setImageResource(R.drawable.five);
                } else {
                    ivPlaceholder.setImageResource(R.drawable.six);
                }
            }
        });
    }
}