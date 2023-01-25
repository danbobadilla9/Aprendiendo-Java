package com.bobadilla.Ejemplo;

import com.bobadilla.OOP_Herencia.Alumno;
import com.bobadilla.OOP_Herencia.AlumnoInternacional;
import com.bobadilla.OOP_Herencia.Persona;
import com.bobadilla.OOP_Herencia.Profesor;

import java.sql.SQLOutput;

public class EjemploHerenciaConstructores {
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
        System.out.println("nombre: "+persona.getNombre()+" apellido: "+persona.getApellido()+" edad: "+persona.getEdad()+" email: "+persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institucacion: "+((Alumno)persona).getInstitucion());
            System.out.println("Nota matemáticas: "+((Alumno)persona).getNotaMatematica());
            System.out.println("Nota Historia: "+((Alumno)persona).getNotaHistoria());
            System.out.println("Nota Castellano: "+((Alumno)persona).getNotaCastellano());
            if( persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Nota idiomas "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: "+ ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("======== SOBREESCRITURA PROMEDIO");
            System.out.println("Promedio: "+((Alumno) persona).calcularPromedio());
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Asignatura: "+ ((Profesor) persona).getAsignatura());
        }
        System.out.println("=========== SOBREESCRITURA=========");
        System.out.println(persona.saludar());
        System.out.println();
    }



































}
