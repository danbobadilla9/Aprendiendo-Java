package com.bobadilla.oopInterfaces.repositorio;

import com.bobadilla.oopInterfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde, int hasta);




























}
