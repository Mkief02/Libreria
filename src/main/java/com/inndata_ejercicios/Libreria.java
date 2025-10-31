package com.inndata_ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private String nombre;
    private List<Categoria> categorias;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.categorias = new ArrayList<>();
    }

    public void agregarCategoria(Categoria c) {
        categorias.add(c);
    }
    
    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void mostrarInventario() {
        System.out.println("🏪 Librería: " + nombre);
        for (Categoria c : categorias) {
            c.mostrarProductos();
        }
    }

}
