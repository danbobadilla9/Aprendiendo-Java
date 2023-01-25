package com.bobadilla.oopgenerics;

import com.bobadilla.oopInterfaces.modelo.Cliente;
import com.bobadilla.oopInterfaces.modelo.ClientePremium;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List clientes = new ArrayList();
        clientes.add(new Cliente("dan", "israel"));//como no definimos el generico es de Object

        Cliente dan = (Cliente)clientes.get(0);//java no sabe con que tipo de dato se trabaja, hay que castear
//        String dan = (String)clientes.get(0);//Error de casteo
//        Cliente dan = (Cliente)clientes.iterator().next(); //otra manera de hacer el get
        List<Cliente> clienteProbador = new ArrayList<>();
        clienteProbador.add(new Cliente("dan", "israel"));
        Cliente dan2 = clienteProbador.iterator().next();//No es necesario hacer el casteo

        Cliente[] clientesArreglo = {new Cliente("jose", "israel"),new Cliente("israel", "bobadilla")};
        Integer[] enterosArreglo = {1,2,3};
        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);
        List<Integer> enteros2 = fromArrayToList(enterosArreglo);

        clientes2.forEach(System.out::println);
        enteros2.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"dan","israel","segundo","bobadilla","pepe"},enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("dan", "israel")});

        imprimirClientes(clientes2);
        imprimirClientes(clienteProbador);
        imprimirClientes(clientesPremiumList); //Genera error proque es un hijo de cliente, pero con ? extends Cliente, funcionará

        System.out.println("Maximo de 1, 9 y 4 es: "+maximo(1,9,4));
        System.out.println("maximo de 3.9 , 11.6 y 7.78: "+maximo(3.9,11.6,7.78));
        System.out.println("maximo de zanahoria,arandanos,manzana es: "+maximo("zanahoria","arandano","manzana"));
    }

//    public static List<Cliente> fromArrayToList(Cliente[] c){//Esto es un estricto ya que solo funciona con Cliente, los genericos funcionan para que puedan aplicarse a cualquier tipo
//        return Arrays.asList(c);
//    }

    public static <T> List<T> fromArrayToList(T[] c){//Esto es un generico, acepta diferentes tipos de datos
        return Arrays.asList(c);
    }
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }
    //Uso de wildcars generics
//    public static List<Cliente> fromArrayToList(Cliente[] c){
//        return Arrays.asList(c);
//    }
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c){//Aceptara cualquier tipo de cliente y clases hijas
        return Arrays.asList(c);
    }
    public static <T,G> List<T> fromArrayToList(T[] c,G[] x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){//una lista de clientespremium no hereda de una lista de clientes
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if( b.compareTo(max) > 0){
            max = b;
        }
        if( c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

















}
