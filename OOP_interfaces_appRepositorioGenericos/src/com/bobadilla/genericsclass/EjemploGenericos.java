package com.bobadilla.genericsclass;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){//el casteo se realiza de manera automatica
            if(a instanceof Animal){
            System.out.println(((Animal)a).getNombre()+" tipo "+((Animal)a).getTipo());
            }
        }
    }
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add( new Animal("muñe","Caballo"));
        transporteCaballos.add( new Animal("franchesco","Caballo"));
        transporteCaballos.add( new Animal("robertito","Caballo"));
        transporteCaballos.add( new Animal("devils","Caballo"));
        transporteCaballos.add( new Animal("max","Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        for(Maquinaria m: transMaquinas){
            System.out.println(m.getTipo());
        }

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        for(Automovil a: transAuto){
            System.out.println(a.getMarca());
        }

    }















































}
