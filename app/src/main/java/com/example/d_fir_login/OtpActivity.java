package com.example.d_fir_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.d_fir_login.Model.User;

public class OtpActivity extends AppCompatActivity {
    private String EmployeeId, phoneNumber;
    private EditText txtOTP;
    private TextView DisplayContact;
    private Button btnVerify;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        users = database.getReference("Users");
        txtOTP = findViewById(R.id.txtOTP);
        DisplayContact = findViewById(R.id.textView3);

        Intent intent = getIntent();
        EmployeeId = intent.getStringExtra("EmployeeId");

    }

}