package com.bobadilla9.apiservlet.webapp.headers.services;

import com.bobadilla9.apiservlet.webapp.headers.models.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductoServiceImpl implements ProductoService{
    @Override
    public List<Producto> listar(){
        return Arrays.asList(new Producto(1L,"Notebook","computacion",175000),
                new Producto(2L,"Mesa Escritorio","Oficina",100000),
                new Producto(3L,"Teclado Mecanico","Computacion",40000));
    }

    @Override
    public Optional<Producto> porId(Long id){
        return listar().stream().filter( p -> p.getId().equals(id)).findAny();
    }




















}
