package com.example.learningandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    private EditText edtPhone, edtName, edtEmail, edtAddress;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        edtPhone = findViewById(R.id.edit_Phone);
        edtName = findViewById(R.id.edit_name);
        edtEmail = findViewById(R.id.edit_email);
        edtAddress = findViewById(R.id.edit_address);
        btnSend = findViewById(R.id.btn_return);

        String name = getIntent().getStringExtra("nameKey");
        String email = getIntent().getStringExtra("emailKey");
        String phone = getIntent().getStringExtra("phoneKey");
        String address = getIntent().getStringExtra("addressKey");

        edtPhone.setText(phone);
        edtAddress.setText(address);
        edtName.setText(name);
        edtEmail.setText(email);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, ListViewActivity.class));
            }
        });
    }
}