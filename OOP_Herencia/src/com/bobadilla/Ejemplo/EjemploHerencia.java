package com.bobadilla.Ejemplo;

import com.bobadilla.OOP_Herencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Persona alumno2 = new Alumno();//Al crearlo de esta manera no podemos acceder a los atributos ni metodos de Alumno

        System.out.println("========= Creando la isntancia de la clase Alumno=============");
        Alumno alumno = new Alumno();//Al crearlo de esta manera no podemos acceder a los atributos ni metodos de Alumno
        ((Alumno)alumno2).setInstitucion("Instituto Nacional");
        alumno.setNombre("Dan");
        alumno.setApellido("Bobadilla");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("======== Creando la isntancia del profesor =============");
        Profesor profesor = new Profesor();
        profesor.setNombre("Israel");
        profesor.setApellido("Segundo");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre()+" "+alumno.getApellido()+" "+((Alumno)alumno2).getInstitucion());//Si no hacemos el cast no funcionara
        System.out.println("Profesor "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+profesor.getApellido());

        //Alumno especializado
        System.out.println("============ Creando la isntancia de la clase alumno internacional=========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("IsraelS");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Argentina");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        System.out.println(alumnoInt.getNombre()+" "+alumnoInt.getApellido()+" "+alumnoInt.getInstitucion()+" "+alumnoInt.getPais());

        Class claseAlumnoInt = alumnoInt.getClass();
        while( claseAlumnoInt.getSuperclass() != null ){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(hija+" Es una clase hia de la clase padre "+padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }
    }





































}
