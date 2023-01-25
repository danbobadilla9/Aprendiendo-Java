package com.bobadilla.ejemplo.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        //Tiene cierto costo de procesamiento debido a su ordenamiento
        Set<String> ts = new TreeSet<>( (a,b) -> b.compareTo(a));
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        System.out.println("ts = " + ts);//no mantiene el orden en que se registra pero si el del abecedario, no acepta elementos duplicados
        Set<Integer> numeros = new TreeSet<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a,Integer b){
                return b.compareTo(a);
            }
        });
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        System.out.println("numeros = " + numeros);
        //deben utilizar la interfaz comparable y utilizar su metodo

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
