package com.inndata_ejercicios;

public abstract class ProductoAbstracto implements Producto {

    protected String nombre;
    protected double precio;
    protected String codigo;
    protected String descripcion;


    public ProductoAbstracto(String nombre, double precio, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre(){return nombre;}

    @Override
    public double getPrecio() { return precio; }

    @Override
    public String getCodigo() { return codigo; }

    @Override
    public String getDescripcion() { return descripcion; }


    // Implementación por defecto de mostrarProducto
    @Override
    public void mostrarProducto() {
        System.out.println("Nombre del producto : " + nombre);
        System.out.println("Código de barras: " + codigo);
        System.out.println("Precio : $" + precio);
        System.out.println("Descripción: " + descripcion);
    }


}
