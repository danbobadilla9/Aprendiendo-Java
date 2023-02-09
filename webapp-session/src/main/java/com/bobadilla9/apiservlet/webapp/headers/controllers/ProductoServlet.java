package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.models.Producto;
import com.bobadilla9.apiservlet.webapp.headers.services.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet({"/productos.html", "/productos"})
public class ProductoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService service = new ProductoServiceImpl();
        List<Producto> productos = service.listar();

        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> usernameOptional  = auth.getUsername(req);

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("   <head>");
            out.print("         <meta charset=\"UTF-8\">");
            out.print("         <title>Listado de Productos</title>");
            out.print("   </head>");
            out.print("   <body>");
            out.print("         <h1>Listado de Prouctos</h1>");
            if(usernameOptional.isPresent()){
                out.print("         <div style='color:blue;'>Hola "+usernameOptional.get()+" Bienvenido</div>");
            }
            out.print("         <table>");
            out.print("             <tr>");
            out.print("                 <th>id</th>");
            out.print("                 <th>Nombre</th>");
            out.print("                 <th>Tipo</th>");
            if(usernameOptional.isPresent()){
                out.print("                 <th>Precio</th>");
                out.print("                 <th>Agregar</th>");
            }
            out.print("             </tr>");
            productos.forEach(p -> {
                out.print("             <tr>");
                out.print("             <td>" + p.getId() + "</td>");
                out.print("             <td>" + p.getNombre() + "</td>");
                out.print("             <td>" + p.getTipo() + "</td>");
                if(usernameOptional.isPresent()){
                    out.print("             <td>" + p.getPrecio() + "</td>");
                    out.print("             <td><a href=\""+req.getContextPath()+"/agregar-carro?id="+p.getId() + "\">Agregar al carro</a></td>");
                }
                out.print("             </tr>");
            });
            out.print("         </table>");
            out.print("   </body>");
            out.print("</html>");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
















}
