package com.bobadilla.oopInterfaces;

import com.bobadilla.oopInterfaces.modelo.Cliente;
import com.bobadilla.oopInterfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        //en cruidrepositori lo podemos cambiar por el ordenablepaginablecrud y ya no tendriamos que hacer el casteo
        CruidRepositorio repo = new ClienteListRepositorio();//implementacion como un dao
        repo.crear(new Cliente("dan","segundo"));
        repo.crear(new Cliente("andres","bobadilla"));
        repo.crear(new Cliente("juan","perez"));
        repo.crear(new Cliente("raul","campos"));
        repo.crear(new Cliente("claudio","campos"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("====== PAGINABLE ======");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(System.out::println);
        System.out.println("====== ORDENAR ASC======");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);
        System.out.println("====== EDITAR ======");
        Cliente danActualizar = new Cliente("dan","djfsalkaksfj");
        danActualizar.setId(1);
        repo.editar(danActualizar);
        Cliente dan = repo.porId(1);
        System.out.println(dan);
        System.out.println("====== ELIMINAR ======");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);
        System.out.println(" ===== TOTAL =====");
        System.out.println(((ContableRepositorio)repo).total());














    }
}
