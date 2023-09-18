package com.example.fundamentalsdsm4a;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() { //ESCUCHADOR
            @Override
            public void onClick(View view) { //METODO ABSTRACTO
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("admin") && password.equals("1234"))
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Datos Erroneaos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}