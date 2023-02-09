package com.bobadilla9.apiservlet.webapp.headers.services;

import com.bobadilla9.apiservlet.webapp.headers.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> listar();

    Optional<Producto> porId(Long id);

}
