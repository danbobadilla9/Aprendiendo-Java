package com.danbobadilla9.java_jdbc;

import com.danbobadilla9.java_jdbc.models.Producto;
import com.danbobadilla9.java_jdbc.repositorio.ProductoRepositorioImpl;
import com.danbobadilla9.java_jdbc.repositorio.Repositorio;
import com.danbobadilla9.java_jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {
        try(Connection conn = ConexionBaseDatos.getInstance()){
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("=================== Listar ===================");
            repositorio.listar().forEach( System.out::println);
            System.out.println("=================== Obtener por Id ===================");
            System.out.println(repositorio.porId(2L));

            System.out.println("=================== Eliminar producto ===================");

            Producto producto = new Producto();
            producto.setId(3L);
            repositorio.eliminar(producto.getId());
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach( System.out::println);
        }catch (SQLException e){
            e.printStackTrace();
        }
















































    }
}
