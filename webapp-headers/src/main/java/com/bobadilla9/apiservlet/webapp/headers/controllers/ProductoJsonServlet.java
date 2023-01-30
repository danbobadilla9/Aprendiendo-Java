package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.models.Producto;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoService;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet({"/productos.json","/productosJSON"})
public class ProductoJsonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ProductoService service = new ProductoServiceImpl();
        List<Producto> productos = service.listar();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(productos);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletInputStream jsonStream = req.getInputStream();
        ObjectMapper mapper = new ObjectMapper();
        Producto producto = mapper.readValue(jsonStream, Producto.class);
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("   <head>");
            out.print("         <meta charset=\"UTF-8\">");
            out.print("         <title>Detalle de producto desde json</title>");
            out.print("   </head>");
            out.print("   <body>");
            out.print("         <h1>Detalle de producto desde json</h1>");
            out.print("         <ul>");
            out.print("         <li>Id: "+producto.getId()+"</li>");
            out.print("         <li>Nombre: "+producto.getNombre()+"</li>");
            out.print("         <li>Tipo: "+producto.getTipo()+"</li>");
            out.print("         <li>Precio: "+producto.getPrecio()+"</li>");
            out.print("         </ul>");
            out.print("   </body>");
            out.print("</html>");
        }

    }

}






























