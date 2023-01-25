package com.bobadilla.ejemplo.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {

    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "pejerrey", "Robalo", "Atun", "Lenguado"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("unicos tam: "+unicos.size()+" elementos no duplicados: "+unicos);
        System.out.println("duplicados tam: "+duplicados.size()+" elementos duplicados: "+duplicados);
    }

}
