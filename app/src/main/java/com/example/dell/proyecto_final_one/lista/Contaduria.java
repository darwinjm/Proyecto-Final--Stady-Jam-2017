package com.example.dell.proyecto_final_one.lista;

import java.io.Serializable;


public class Contaduria implements Serializable {
    private String Nombre;
    private String Tipo;
    private String Concepto;

    public Contaduria() {

    }

    public Contaduria(String nombre) {
        Nombre = nombre;
    }

    public Contaduria(String nombre, String tipo) {
        Nombre = nombre;
        Tipo = tipo;
    }

    public Contaduria(String nombre, String tipo, String concepto) {
        Nombre = nombre;
        Tipo = tipo;
        Concepto=concepto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

}
