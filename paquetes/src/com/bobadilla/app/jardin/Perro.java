package com.bobadilla.app.jardin;

import com.bobadilla.app.hogar.Persona;

public class Perro {
    String raza;
    protected String nombre; //protected permite heredar

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }











}
