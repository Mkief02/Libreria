package com.inndata_ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nombre;
    
    public String getNombre() {return nombre;}

    private List<Producto> listaProductos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public void mostrarProductos() {
        System.out.println("📚 Categoría: " + nombre);
        for (Producto p : listaProductos) {
            p.mostrarProducto();
        }
    }

    public List<Producto> getListaProductos() {
    return listaProductos;
    }


}
