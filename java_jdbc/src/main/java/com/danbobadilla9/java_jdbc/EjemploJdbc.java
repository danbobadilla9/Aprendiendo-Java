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
//        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
//        String username = "root";
//        String password = "root";
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet resultado = null;
//        try{
//            conn = DriverManager.getConnection(url,username,password);
//            stmt = conn.createStatement();
//            resultado = stmt.executeQuery("SELECT * FROM productos");
//
//            while(resultado.next()){
//                System.out.println(resultado.getString("nombre"));
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();//Aqui no se cierra la conexion ni nada por lo que usaremos un finally
//        }finally {//Es un contexto aparte
//            //Aqui tendremos que implementar otro try porque puede suceder errores al cerrar la conex
//            try{
//                resultado.close();
//                stmt.close();
//                conn.close();
//            }catch (SQLException p){
//                p.printStackTrace();
//            }
//        }
        //Podemos evitar escribir tanto try-catch utilizando un autoclose
//        try(Connection conn = ConexionBaseDatos.getInstance();
//            Statement stmt = conn.createStatement();
//            ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")){
//            while(resultado.next()){
//                System.out.print(resultado.getInt(1));
//                System.out.print(" | ");
//                System.out.print(resultado.getString("nombre"));
//                System.out.print(" | ");
//                System.out.print(resultado.getInt("precio"));
//                System.out.print(" | ");
//                System.out.println(resultado.getDate("fecha_registro"));
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        try(Connection conn = ConexionBaseDatos.getInstance()){
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
        }catch (SQLException e){
            e.printStackTrace();
        }
















































    }
}
