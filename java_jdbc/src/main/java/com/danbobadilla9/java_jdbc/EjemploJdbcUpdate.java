package com.danbobadilla9.java_jdbc;

import com.danbobadilla9.java_jdbc.models.Categoria;
import com.danbobadilla9.java_jdbc.models.Producto;
import com.danbobadilla9.java_jdbc.repositorio.ProductoRepositorioImpl;
import com.danbobadilla9.java_jdbc.repositorio.Repositorio;
import com.danbobadilla9.java_jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {
        try(Connection conn = ConexionBaseDatos.getInstance()){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=================== Listar ===================");
            repositorio.listar().forEach( System.out::println);
            System.out.println("=================== Obtener por Id ===================");
            System.out.println(repositorio.porId(2L));

            System.out.println("=================== Editar producto ===================");

            Producto producto = new Producto();
            producto.setId(4L);
            producto.setNombre("Teclado Corsair k95 mecánico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto editado con éxito");
            repositorio.listar().forEach( System.out::println);
        }catch (SQLException e){
            e.printStackTrace();
        }
















































    }
}
