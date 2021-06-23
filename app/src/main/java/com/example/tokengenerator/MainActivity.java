package com.example.tokengenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BotonGenerarToken = findViewById(R.id.btn_main_generate_token);
        Button BotonAgregarNuevoNombreToken = findViewById(R.id.btn_main_add_new_token_name);

        BotonGenerarToken.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GenerateToken.class));
            }
        });

        BotonAgregarNuevoNombreToken.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AddNewTokenName.class));
            }
        });


    }
}