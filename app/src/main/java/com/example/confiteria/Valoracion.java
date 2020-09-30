package com.example.confiteria;

public class Valoracion {
    String Nombre;
    String Cantidad;
    String Comprar;
    String Sabor;
    String Recomendable;

    public Valoracion(String nombre, String cantidad, String comprar, String sabor, String recomendable) {
        Nombre = nombre;
        Cantidad = cantidad;
        Comprar = comprar;
        Sabor = sabor;
        Recomendable = recomendable;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getComprar() {
        return Comprar;
    }

    public String getSabor() {
        return Sabor;
    }

    public String getRecomendable() {
        return Recomendable;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public void setComprar(String comprar) {
        Comprar = comprar;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public void setRecomendable(String recomendable) {
        Recomendable = recomendable;
    }
}
