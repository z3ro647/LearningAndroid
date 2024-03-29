package com.example.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyBioLinearLayout extends AppCompatActivity {

    private EditText edtPhone, edtName, edtEmail, edtAddress;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bio_linear_layout);

        edtPhone = findViewById(R.id.edit_Phone);
        edtName = findViewById(R.id.edit_name);
        edtEmail = findViewById(R.id.edit_email);
        edtAddress = findViewById(R.id.edit_address);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBioLinearLayout.this, ProfileActivity.class);
                intent.putExtra("nameKey", edtName.getText().toString());
                intent.putExtra("phoneKey", edtPhone.getText().toString());
                intent.putExtra("emailKey", edtEmail.getText().toString());
                intent.putExtra("addressKey", edtAddress.getText().toString());
                startActivity(intent);
            }
        });
    }
}