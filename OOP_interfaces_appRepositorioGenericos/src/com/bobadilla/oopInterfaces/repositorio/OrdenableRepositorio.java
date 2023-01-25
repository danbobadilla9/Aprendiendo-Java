package com.bobadilla.oopInterfaces.repositorio;

import com.bobadilla.oopInterfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {

    List<T> listar(String campo, Direccion dir);





















}
