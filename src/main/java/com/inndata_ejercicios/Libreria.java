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

    public void mostrarInventarioCompleto(Inventario<Producto> inventario) {
        System.out.println("\n🏪 Librería: " + nombre);
        System.out.println("========== INVENTARIO ==========");
        for (Categoria c : categorias) {
            System.out.println("\n📚 Categoría: " + c.getNombre());
            System.out.println("------------------------------");
            for (Producto p : c.getListaProductos()) {
                p.mostrarProducto();
                System.out.println();
            }
        }
        System.out.println("------- Inventario general (todos) -------");
        for (Producto p : inventario.getElements()) {
            p.mostrarProducto();
            System.out.println();
        }
        System.out.println("========== FIN INVENTARIO ==========");
    }

}
