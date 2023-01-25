package com.bobadilla.oopInterfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{
    private Persona persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String contenido,Persona persona,String carrera){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        experiencia = new ArrayList<>();
    }

    public Curriculo addExperiencia(String exp){
        experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona)
                .append("\n").append("Resumen: ")
                .append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencia: \n");
        for(String exp: experiencia){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }















}
