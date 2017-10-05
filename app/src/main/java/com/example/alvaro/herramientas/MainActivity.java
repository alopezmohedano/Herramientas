package com.example.alvaro.herramientas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuAction{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menu(int boton) {
        Intent intent = new Intent (this, HerrramientasActivity.class);
        intent.putExtra("botonPulsado", boton);
        startActivity(intent);
    }
}