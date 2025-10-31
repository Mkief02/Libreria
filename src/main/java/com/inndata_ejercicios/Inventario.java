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
}
