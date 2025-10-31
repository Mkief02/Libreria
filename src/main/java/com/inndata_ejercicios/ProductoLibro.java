package com.inndata_ejercicios;

public class ProductoLibro extends ProductoAbstracto {

    private String autor;
    private int paginas;

    public ProductoLibro(String nombre, double precio, String codigo, String descripcion, String autor, int paginas) {
        super(nombre, precio, codigo, descripcion);
        this.autor = autor;
        this.paginas = paginas;
    }

    
    public String getAutor() {return autor;}

    public int getPaginas() {return paginas;}


    // Podemos extender o sobrescribir mostrarProducto para incluir campos específicos
    @Override
    public void mostrarProducto() {
    super.mostrarProducto();
    System.out.println("Autor : " + autor);
    System.out.println("Páginas: " + paginas);
    }

    

    



}
