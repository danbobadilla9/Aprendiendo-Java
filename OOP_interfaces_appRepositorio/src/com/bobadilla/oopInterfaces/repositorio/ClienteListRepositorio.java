package com.bobadilla.oopInterfaces.repositorio;

import com.bobadilla.oopInterfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginaleCrudRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {

        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for(Cliente cli: dataSource){
            if(cli.getId() != null &&cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

//    @Override
//    public List<Cliente> listar(String campo, Direccion dir) {
//        dataSource.sort( new Comparator<Cliente>(){
//            @Override
//            public int compare(Cliente a, Cliente b){
//                int resultado = 0;
//                if(dir == Direccion.ASC){
//                    switch (campo){
//                        case "id" -> resultado = a.getId().compareTo(b.getId());
//                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
//                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
//                    }
//                }else if(dir == Direccion.DESC){
//                    switch (campo){
//                        case "id" -> resultado = b.getId().compareTo(a.getId());
//                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
//                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
//                    }
//                }
//                return resultado;
//            }
//        });
//        return dataSource;
//    }
    //el metodo anterior no podemos modificar usando exp lam

//    @Override
//    public List<Cliente> listar(String campo, Direccion dir) {
//        dataSource.sort( (a,  b) -> {//se sigue usando Comparator, solo se pudo hacer porque la interface functional solo tenia un solo método abstracto
//                int resultado = 0;
//                if(dir == Direccion.ASC){
//                    switch (campo){
//                        case "id" -> resultado = a.getId().compareTo(b.getId());
//                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
//                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
//                    }
//                }else if(dir == Direccion.DESC){
//                    switch (campo){
//                        case "id" -> resultado = b.getId().compareTo(a.getId());
//                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
//                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
//                    }
//                }
//                return resultado;
//            }
//        );
//        return dataSource;
//    }

    //optimizando el codigo
//    @Override
//    public List<Cliente> listar(String campo, Direccion dir) {
//        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
//        listaOrdenada.sort(new Comparator<Cliente>() {//clase anonima
//                               @Override
//                               public int compare(Cliente a, Cliente b) {//una exp lamba no permite crear metodos
//                                   int resultado = 0;
//                                   if(dir == Direccion.ASC){
//                                       resultado = this.ordenar(a, b);
//                                   }else if(dir == Direccion.DESC){
//                                       resultado =  this.ordenar(b, a);
//                                   }
//                                    return resultado;
//                               }
//
//                               private int ordenar(Cliente a, Cliente b){
//                                   int resultado = 0;
//                                   switch (campo){
//                                       case "id" -> resultado = a.getId().compareTo(b.getId());
//                                       case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
//                                       case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
//                                   }
//                                   return resultado;
//                               }
//
//                           }
//        );
//        return listaOrdenada;
//    }
    //Otra manera para conservar la exp lam

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo,a, b);
            } else if (dir == Direccion.DESC) {
                resultado =  ordenar(campo,b, a);
            }
            return resultado;
        }
        );
        return listaOrdenada;
    }
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
