package com.example.gridview_compisclase;

import java.io.Serializable;

public class Alumno implements Serializable {

    private String Nombre;
    private int avatar;

    public Alumno(String nombre, int avatar) {
        Nombre = nombre;
        this.avatar = avatar;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
