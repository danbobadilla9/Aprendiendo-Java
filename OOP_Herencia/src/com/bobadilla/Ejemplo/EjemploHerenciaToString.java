package com.bobadilla.Ejemplo;

import com.bobadilla.OOP_Herencia.Alumno;
import com.bobadilla.OOP_Herencia.AlumnoInternacional;
import com.bobadilla.OOP_Herencia.Persona;
import com.bobadilla.OOP_Herencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Dan", "Israel",22,"Instituto Nacional");//Al crearlo de esta manera no podemos acceder a los atributos ni metodos de Alumno
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("danbobadilla9@hotmail.com");

        Profesor profesor = new Profesor("Israel","Segundo","Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor@.hotmail.com");

        //Alumno especializado
        AlumnoInternacional alumnoInt = new AlumnoInternacional("IsraelS","Gosling","Argentina");
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setEdad(15);
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("alumno@hotmail.com");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
        System.out.println();
    }



































}
