package com.bobadilla9.java8.lambda;

import com.bobadilla9.java8.lambda.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<String> consumidor = saludo -> System.out.println(saludo);
        Consumer<String> consumidor2 = System.out::println;
        consumidor.accept("buenas");
        consumidor2.accept("buenas por dos ");
        BiConsumer<String,String> consumidorBi = (nombre,edad) -> {
            System.out.println(nombre+ " tiene "+edad+" años");
        };
        BiConsumer<String,String> consumidorBi2 = (nombre,edad) -> {
            System.out.println(nombre+ " tiene "+edad+" años");
        };
        consumidorBi.accept("dan","22");
        List<String> nombres = Arrays.asList("dan", "israel", "bobadilla", "segundo");
        nombres.forEach(consumidor2);//se le pasa un lambda
        nombres.forEach(System.out::println);

        Supplier<Usuario> creaUsuario = () -> new Usuario();
        //Otra manera de simplificar creaUsuario es la siguiente
        Supplier<Usuario> creaUsuario2 =  Usuario::new;
        Usuario usuario = creaUsuario2.get();

        BiConsumer<Usuario,String> asignarNombre = (persona,nombre) -> {
            persona.setNombre(nombre);
        } ;
        //Otr manera de escribir lo anterior
        BiConsumer<Usuario,String> asignarNombre2 = Usuario::setNombre;


        asignarNombre.accept(usuario,"pablo");

        System.out.println("Nombre usuario:  "+usuario.getNombre());

        Supplier<String> proveedor = () -> {
            return "hola mundo";
        };
        //Si solo es una linea se puede utilizar
        Supplier<String> proveedor2 = () -> "hola mundo2";

        System.out.println(proveedor.get());








    }
}
