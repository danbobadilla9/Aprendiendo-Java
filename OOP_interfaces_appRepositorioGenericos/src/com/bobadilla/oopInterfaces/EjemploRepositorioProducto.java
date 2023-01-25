package com.bobadilla.oopInterfaces;

import com.bobadilla.oopInterfaces.modelo.Cliente;
import com.bobadilla.oopInterfaces.modelo.Producto;
import com.bobadilla.oopInterfaces.repositorio.Direccion;
import com.bobadilla.oopInterfaces.repositorio.OrdenablePaginaleCrudRepositorio;
import com.bobadilla.oopInterfaces.repositorio.lista.ClienteListRepositorio;
import com.bobadilla.oopInterfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        OrdenablePaginaleCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("mesa",50.52));
        repo.crear(new Producto("silla",125.56));
        repo.crear(new Producto("lampara",57.51));
        repo.crear(new Producto("auto",58.65));
        repo.crear(new Producto("libreta",99.98));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);
        System.out.println("====== PAGINABLE ======");
        List<Producto> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);
        System.out.println("====== ORDENAR ASC======");
        List<Producto> productosOrdenAsc = repo.listar("precio", Direccion.ASC);
        productosOrdenAsc.forEach(System.out::println);
        System.out.println("====== EDITAR ======");
        Producto mesaActualizar = new Producto("mesa",998.58);
        mesaActualizar.setId(1);
        repo.editar(mesaActualizar);
        Producto mesa = repo.porId(1);
        System.out.println(mesa);
        System.out.println("====== ELIMINAR ======");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);
        System.out.println(" ===== TOTAL =====");
        System.out.println(repo.total());














    }
}
