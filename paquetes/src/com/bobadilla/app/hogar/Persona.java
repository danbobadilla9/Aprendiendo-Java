package com.bobadilla.app.hogar;

public class Persona {
     private String nombre;
     private String apellido;
     private ColorPelo colorPelo;

     public ColorPelo getColorPelo() {
          return colorPelo;
     }

     public void setColorPelo(ColorPelo colorPelo) {
          this.colorPelo = colorPelo;
     }

     public String getNombre() {
          return nombre;
     }

     public static final String GENERO_MASCULINO = "Masculino";
     public static final String GENERO_FEMENINO = "Femenino";


     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getApellido() {
          return apellido;
     }

     public String lanzarPelota(){
          return "Lanza la pelota al perro!";
     }
     public void setApellido(String apellido) {
          this.apellido = apellido;
     }

     public static String saludar(){
          return "Hola que tal";
     }























}
