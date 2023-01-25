package com.bobadilla9.java8.lambda;

import com.bobadilla9.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r = " + r);


        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_USER"));

        //Podemos utilizar la referencia de metodo
//        BiPredicate<String, String> t3 = (a, b) -> a.equals(b); //Forma larga
        BiPredicate<String, String> t3 = String::equals; //Forma corta
        System.out.println(t3.test("dan","israel"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean r2 = t4.test(5, 10);
        System.out.println(r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("cata");
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a,b));
































    }
}
