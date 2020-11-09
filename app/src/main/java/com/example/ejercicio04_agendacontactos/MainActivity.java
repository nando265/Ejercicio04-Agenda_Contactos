package com.example.ejercicio04_agendacontactos;

import android.os.Bundle;

import com.example.ejercicio04_agendacontactos.adapters.ContactosAdapter;
import com.example.ejercicio04_agendacontactos.modelos.Contacto;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1. Contenedor de elementos
    // 1.1 ListView
    private ListView contenedorContactos;
    private ContactosAdapter adapter;
    // 1.2 Conjunto de Datos
    private ArrayList<Contacto> listaContactos;
    // 1.3 La fila de datos
    private int filaContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        contenedorContactos = findViewById(R.id.contenedorContactosMain);
        filaContacto = R.layout.fila_contacto;
        listaContactos = new ArrayList<>();
        adapter = new ContactosAdapter(this, filaContacto, listaContactos);
        contenedorContactos.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}