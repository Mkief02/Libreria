package com.inndata_ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Inventario <P>{

    private List<P> genericContainer = new ArrayList<>();

    public void addElement(P producto) {
    genericContainer.add(producto);
    }

    public List<P> getElements(){
        return genericContainer;
    }

    public void mostrarInventario(List<Categoria> categorias) {
        System.out.println("\n==============================");
        System.out.println("📦 INVENTARIO GENERAL");
        System.out.println("==============================");

        for (P elemento : genericContainer) {
            if (elemento instanceof Producto) {
                Producto prod = (Producto) elemento;

                // Buscar categoría a la que pertenece
                String categoriaEncontrada = "Sin categoría";
                for (Categoria cat : categorias) {
                    if (cat.getListaProductos().contains(prod)) {
                        categoriaEncontrada = cat.getNombre();
                        break;
                    }
                }

                System.out.println("\n----------------------------------");
                System.out.println("📂 Categoría: " + categoriaEncontrada);
                System.out.println("----------------------------------");
                prod.mostrarProducto();
                System.out.println("----------------------------------\n");
            } else {
                System.out.println(elemento.toString());
            }
        }

        System.out.println("======= FIN DEL INVENTARIO =======");
    }

}
