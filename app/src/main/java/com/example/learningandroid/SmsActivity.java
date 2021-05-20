package com.example.learningandroid;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    private EditText edtPhone, edtMessage;
    private Button btnSendSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        edtPhone = findViewById(R.id.edit_Phone);
        edtMessage = findViewById(R.id.edit_message);
        btnSendSms = findViewById(R.id.btn_send);

        btnSendSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int permission = ContextCompat.checkSelfPermission(SmsActivity.this, Manifest.permission.SEND_SMS);

                if(permission == PackageManager.PERMISSION_GRANTED) {
                    // Send SMS Function
                    SendSms();
                }
                else {
                    ActivityCompat.requestPermissions(SmsActivity.this, new String [] {Manifest.permission.SEND_SMS}, 111);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 111:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Send SMS Function
                    SendSms();
                }
                else {
                    Toast.makeText(this, "We Need SMS permission", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private void SendSms() {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(edtPhone.getText().toString().trim(), null, edtMessage.getText().toString().trim(), null, null);
        Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show();
    }
}