package com.danbobadilla9.apiservlet.webapp.headers.services;

import com.danbobadilla9.apiservlet.webapp.headers.models.Producto;
import com.danbobadilla9.apiservlet.webapp.headers.repositories.ProductoRepositoryJDBCImple;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductoServiceJdbcImpl implements ProductoService {
    private ProductoRepositoryJDBCImple repositoryJdbc;

    public void ProductoServiceJdbcImpl(Connection connection){
        this.repositoryJdbc = new ProductoRepositoryJDBCImple(connection);
    }

    @Override
    public List<Producto> listar() {
        try{
            return repositoryJdbc.listar();
        }catch (SQLException throwables){
            throw new ServiceJdbcException(throwables.getMessage(),throwables.getCause());
        }
    }

    @Override
    public Optional<Producto> porId(Long id) {
        try {
            return Optional.ofNullable(repositoryJdbc.porId(id));
        } catch (SQLException throwables) {
            throw new ServiceJdbcException(throwables.getMessage(),throwables.getCause());
        }
    }
}
