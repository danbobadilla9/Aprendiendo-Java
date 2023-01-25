package com.bobadilla.oopInterfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private Persona autor;
    private String revisor;

    public Informe(String contenido,Persona autor, String revisor){
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir(){
        return "informe escrito por: "+autor
                +" Revisado por: "+revisor
                +"\n"+this.contenido;
    }























}
