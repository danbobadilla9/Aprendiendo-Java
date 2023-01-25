package com.bobadilla.app.jardin;

import com.bobadilla.app.hogar.*;

import static com.bobadilla.app.hogar.ColorPelo.*;
import static com.bobadilla.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
//        persona.nombre = "DAN";
        persona.setColorPelo(CAFE);
//        System.out.println("persona.nombre = " + persona.nombre);
        persona.setApellido("Bobadilla");
        System.out.println("persona.apellido = " + persona.getApellido());
//        Gato g = new Gato();
        Perro perro = new Perro();
        perro.raza="Bulldog";
        perro.nombre="tobby";
        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }






















}
