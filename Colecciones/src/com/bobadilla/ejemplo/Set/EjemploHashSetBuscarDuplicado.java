package com.bobadilla.ejemplo.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {

    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "pejerrey", "Robalo", "Atun", "Lenguado"};
        Set<String> unicos = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("elemento duplicado: "+pez);
            }
        }
        System.out.println("unicos: "+unicos.size()+" elementos no duplicados; "+unicos);
    }

}
