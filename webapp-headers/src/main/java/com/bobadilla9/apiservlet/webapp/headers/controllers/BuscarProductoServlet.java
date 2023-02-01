package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.models.Producto;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoService;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/buscar-producto")
public class BuscarProductoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService service = new ProductoServiceImpl();
        String nombre = req.getParameter("producto");
        Optional<Producto> encontrado =service.listar().stream().filter(p -> {
            if(nombre.isBlank() || nombre == null){
                return false;
            }
            return p.getNombre().contains(nombre);
        }).findFirst();
        if(encontrado.isPresent()){
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Producto encontrado!</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Producto encontrado!</h1>");
                out.print("         <h3>Producto encontrado "+encontrado.get().getNombre()+"  el Precio $"+encontrado.get().getPrecio()+"</h3>");
                out.print("   </body>");
                out.print("</html>");
            }
        }else{
            resp.sendError(HttpServletResponse.SC_NOT_FOUND,"Lo sentimos no se encontro el  producto"+nombre);
        }
    }






















}

