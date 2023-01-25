package com.bobadilla.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{//tambien Iterable se le debera indicar de que tipo

    //si la clase usa genericos debemos indicarle a List que tambien debe de usarlos
    private List<T> objetos;//list implementa una interfaz iterable
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto){
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        }else{
            throw new RuntimeException("no hay más espacio");
        }
    }


    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }





















}
