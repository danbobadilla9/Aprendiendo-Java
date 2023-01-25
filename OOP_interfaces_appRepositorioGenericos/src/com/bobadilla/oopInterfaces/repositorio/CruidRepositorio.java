package com.bobadilla.oopInterfaces.repositorio;

import com.bobadilla.oopInterfaces.modelo.Cliente;

import java.util.List;

public interface CruidRepositorio<T> {

    List<T> listar();
    T porId(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);





















}
