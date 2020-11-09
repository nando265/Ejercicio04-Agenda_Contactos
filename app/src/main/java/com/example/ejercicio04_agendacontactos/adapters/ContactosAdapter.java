package com.example.ejercicio04_agendacontactos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ejercicio04_agendacontactos.R;
import com.example.ejercicio04_agendacontactos.modelos.Contacto;

import java.util.List;

public class ContactosAdapter extends ArrayAdapter<Contacto> {

    private  Context context;
    private List<Contacto> objects;
    private int resource;

    public ContactosAdapter(@NonNull Context context, int resource, @NonNull List<Contacto> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View fila = LayoutInflater.from(context).inflate(resource, null);

        Contacto contacto = objects.get(position);
        TextView txtNombre = fila.findViewById(R.id.txtNombreFilaContacto);
        TextView txtApellidos = fila.findViewById(R.id.txtApellidosFilaContacto);
        txtNombre.setText(contacto.getNombre());
        txtApellidos.setText(contacto.getApellidos());

        return fila;
    }
}
