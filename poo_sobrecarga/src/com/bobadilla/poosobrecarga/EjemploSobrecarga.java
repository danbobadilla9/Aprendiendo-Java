package com.bobadilla.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        System.out.println("sumar int: "+cal.sumar(10,5));
        System.out.println("sumar float: "+cal.sumar(10.0f,5f));
        System.out.println("sumar float-int: "+cal.sumar(10f,5));
        System.out.println("sumar int-float: "+cal.sumar(10,5.0f));
        System.out.println("Sumar double: "+cal.sumar(10d,5d));
        System.out.println("sumar string: "+cal.sumar("10","5"));
        System.out.println("sumar tres int: "+cal.sumar(10,5,3));
        System.out.println("sumar 5 int: "+cal.sumar(10,5,3,3,4));
        System.out.println("sumar float +  n-int: "+cal.sumar(10.5f,10,5,3,3,4));

        System.out.println("sumando long: "+cal.sumar(10l,5l));
        System.out.println("sumando int : "+cal.sumar(10,'@'));
    }
}












































