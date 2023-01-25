package com.bobadilla.ejemplo.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();//Es preferible utilizar la interf
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);//Nunca tendra un orden
        boolean b = hs.add("tres"); //Retornara false
        System.out.println("permite elementos dulicados = "+b );
        System.out.println(hs);
    }


































}
