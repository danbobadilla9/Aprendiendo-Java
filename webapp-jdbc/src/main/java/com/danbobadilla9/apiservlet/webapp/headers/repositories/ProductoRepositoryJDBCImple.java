package com.danbobadilla9.apiservlet.webapp.headers.repositories;

import com.danbobadilla9.apiservlet.webapp.headers.models.Categoria;
import com.danbobadilla9.apiservlet.webapp.headers.models.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryJDBCImple implements Repository<Producto> {
    private Connection conn;

    public ProductoRepositoryJDBCImple(Connection conn){
        this.conn = conn;
    }

    @Override
    public List<Producto> listar() throws SQLException {
        List<Producto> productos = new ArrayList<>();
        try(Statement stnt = conn.createStatement();
            ResultSet rs = stnt.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p INNER JOIN categorias as c ON ( p.categoria_id = c.id)");
        ){
            while(rs.next()){
                Producto p = getProducto(rs);
                productos.add(p);
            }
        }
        return productos;
    }



    @Override
    public Producto porId(Long id) throws SQLException {
        Producto producto = null;
        try(
                PreparedStatement stnt = conn.prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p INNER JOIN categorias c ON (p.categoria_id = c.id) WHERE p.id = ?") ;
                ){
            stnt.setLong(1,id);
            try(ResultSet rs = stnt.executeQuery()){
                if(rs.next()){
                    producto = getProducto(rs);
                }
            }
        }
        return producto;
    }

    @Override
    public void gurardar(Producto producto) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }

    private static Producto getProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId(rs.getLong("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getInt("precio"));
        p.setSku(rs.getString("sku"));
        p.setFechaRegistro(rs.getDate("fecha_registro").toLocalDate());
        Categoria c = new Categoria();
        c.setId(rs.getLong("categoria_id"));
        c.setNombre(rs.getString("categoria"));
        p.setCategoria(c);
        return p;
    }



































}
