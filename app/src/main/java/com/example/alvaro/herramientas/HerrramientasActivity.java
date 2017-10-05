package com.example.alvaro.herramientas;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HerrramientasActivity extends AppCompatActivity implements MenuAction {
    Fragment[] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herrramientas);

        misFragmentos = new Fragment[3];
        misFragmentos[0]=new Fragment1Fragment();

        Bundle extras = getIntent().getExtras();

        menu(extras.getInt("botonPulsado"));
    }

    @Override
    public void menu(int boton) {
        FragmentManager miManejador = getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();

        miTransaccion.replace(R.id.herramientas,  misFragmentos[boton]);
    }
}
