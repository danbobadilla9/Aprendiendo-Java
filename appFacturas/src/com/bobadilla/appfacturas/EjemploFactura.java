package com.bobadilla.appfacturas;

import com.bobadilla.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("Dan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura ");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc,cliente);

        Producto producto;


        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n "+ producto.getCodigo()+" : ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());
            System.out.print("Ingrese la cantidad: ");
            factura.addItemFacutra(new ItemFactura(scanner.nextInt(),producto));
            System.out.println();
            scanner.nextLine();

        }
//        System.out.println(factura.generarDetalle());
        System.out.println(factura);







    }




}
