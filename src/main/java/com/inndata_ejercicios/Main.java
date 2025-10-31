package com.inndata_ejercicios;

public class Main {
    public static void main(String[] args) {
        Producto libro1 = new ProductoLibro("El Principito", 150.0, "L001", "Clásico infantil", "Antoine de Saint-Exupéry", 112);
        Producto libro2 = new ProductoLibro("1984", 200.0, "L002", "Novela distópica", "George Orwell", 349);
        Producto revista1 = new ProductoRevista("National Geographic", 120.0, "R001", "Ciencia y naturaleza", 120, "Septiembre");


        // Crear categorías
        Categoria categoriaLibros = new Categoria("Novelas");
        Categoria categoriaRevistas = new Categoria("Revistas de Ciencia");


        categoriaLibros.agregarProducto(libro1);
        categoriaLibros.agregarProducto(libro2);
        categoriaRevistas.agregarProducto(revista1);


        // Crear librería y agregar categorías
        Libreria libreria = new Libreria("Librería");
        libreria.agregarCategoria(categoriaLibros);
        libreria.agregarCategoria(categoriaRevistas);


        // Crear inventario genérico de productos
        Inventario<Producto> inventario = new Inventario<>();
        inventario.addElement(libro1);
        inventario.addElement(libro2);
        inventario.addElement(revista1);


        
        // Mostrar resultados (IMPORTANTE: ahora se pasa la lista de categorías)
        libreria.mostrarInventario();
        inventario.mostrarInventario(libreria.getCategorias());
    }
}