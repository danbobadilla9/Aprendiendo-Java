package com.bobadilla9.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
//        Function<String, String> f1 = param -> {
//            return "Hola que tal" + param;
//        };
        //Lo anterior se puede simplificar con
        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("dan");
        System.out.println("resultado = " + resultado);

        //referencia de metodos
//        Function<String, String> f2 = param -> param.toUpperCase(); //version larga
        Function<String, String> f2 = String::toUpperCase;//Version simplificada
        System.out.println(f2.apply("dan israel"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("dan", "israel");
        System.out.println(r2);

        //Utilizando metodo por referencia
//        BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b); //version larga
        BiFunction<String, String, Integer> f4 = String::compareTo; //version corta
        System.out.println(f4.apply("dan","dan")); // resultado 0 porque son identicos

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("bobadilla","segundo"));




























    }
}
