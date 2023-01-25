package com.danbobadilla9.java_jdbc;

import com.danbobadilla9.java_jdbc.models.Categoria;
import com.danbobadilla9.java_jdbc.models.Producto;
import com.danbobadilla9.java_jdbc.repositorio.ProductoRepositorioImpl;
import com.danbobadilla9.java_jdbc.repositorio.Repositorio;
import com.danbobadilla9.java_jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=================== Listar ===================");
            repositorio.listar().forEach( System.out::println);
            System.out.println("=================== Obtener por Id ===================");
            System.out.println(repositorio.porId(2L));

            System.out.println("=================== Insertar nuevo producto ===================");

            Producto producto = new Producto();
            producto.setNombre("Teclado Razer mecánico");
            producto.setPrecio(550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach( System.out::println);

















































    }
}
