package com.danbobadilla9.apiservlet.webapp.headers.repositories;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    List<T> listar() throws SQLException;

    T porId(Long id) throws SQLException;

    void gurardar(T t ) throws SQLException;

    void eliminar(Long id) throws SQLException;



























}
