package com.inndata_ejercicios;

public class ProductoRevista extends ProductoAbstracto{

    private int numero;
    private String mesPublicacion;

    public ProductoRevista(String nombre, double precio, String codigo, String descripcion, int numero,
            String mesPublicacion) {
        super(nombre, precio, codigo, descripcion);
        this.numero = numero;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumero() {return numero;}

    public String getMesPublicacion() {return mesPublicacion;}

    @Override
    public void mostrarProducto() {
    super.mostrarProducto();
    System.out.println("Número : " + numero);
    System.out.println("Mes de Publicación : " + mesPublicacion);
    }

}
