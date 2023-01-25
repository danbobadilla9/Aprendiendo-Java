package com.bobadilla.oopInterfaces.repositorio;

import com.bobadilla.oopInterfaces.modelo.Cliente;

import java.util.List;

public interface CruidRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);





















}
