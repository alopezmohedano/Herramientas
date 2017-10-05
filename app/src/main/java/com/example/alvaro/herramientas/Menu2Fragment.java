package com.example.alvaro.herramientas;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu2Fragment extends Fragment {
    private final int[] BOTONESMENU = {R.id.koala, R.id.pinguino, R.id.buscar};

    public Menu2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu2, container, false);

        ImageButton botonMenu;

        for (int boton : BOTONESMENU) {
            botonMenu = (ImageButton) mimenu.findViewById(boton);
        }

        for (int i=0;i<BOTONESMENU.length;i++) {
            botonMenu = (ImageButton) mimenu.findViewById(BOTONESMENU[i]);
            final int queBoton = i;
            botonMenu.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Activity estaActividad=getActivity();

                    ((MenuAction)estaActividad).menu(queBoton);
                }
            });
        }

        return mimenu;
    }
}