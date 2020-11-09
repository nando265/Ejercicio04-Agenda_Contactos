package com.example.ejercicio04_agendacontactos.modelos;

import android.os.Parcel;
import android.os.Parcelable;

public class Telefono implements Parcelable {
    private String nombre;
    private String numTelefono;

    public Telefono(String nombre, String numTelefono) {
        this.nombre = nombre;
        this.numTelefono = numTelefono;
    }

    public Telefono() {
    }

    protected Telefono(Parcel in) {
        nombre = in.readString();
        numTelefono = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(numTelefono);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Telefono> CREATOR = new Creator<Telefono>() {
        @Override
        public Telefono createFromParcel(Parcel in) {
            return new Telefono(in);
        }

        @Override
        public Telefono[] newArray(int size) {
            return new Telefono[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}
