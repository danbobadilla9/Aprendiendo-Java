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
import java.util.List;

@WebServlet({"/productos.xls","/productos.html","/productos"})
public class ProductoXlsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ProductoService service = new ProductoServiceImpl();
        List<Producto> productos = service.listar();
        resp.setContentType("text/html;charset=UTF-8");

        String servletPath = req.getServletPath();
        boolean esXls = servletPath.endsWith(".xls");
        if(esXls){
            resp.setContentType("application/vnd.ms-excel");
            resp.setHeader("Content-Disposition", "attachment;filename=productos.xls");
        }
        try (PrintWriter out = resp.getWriter()) {
            if(!esXls) {
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Listado de Productos</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Listado de Prouctos</h1>");
                out.print("         <p><a href=\"" + req.getContextPath() + "/productos.xls" + "\">Exportar a xls</a></p>");
                out.print("         <p><a href=\"" + req.getContextPath() + "/productos.json" + "\">Mostrar JSON</a></p>");
            }
            out.print("         <table>");
            out.print("             <tr>");
            out.print("                 <th>id</th>");
            out.print("                 <th>Nombre</th>");
            out.print("                 <th>Tipo</th>");
            out.print("                 <th>Precio</th>");
            out.print("             </tr>");
            productos.forEach( p -> {
                out.print("             <tr>");
                out.print("             <td>"+p.getId()+"</td>");
                out.print("             <td>"+p.getNombre()+"</td>");
                out.print("             <td>"+p.getTipo()+"</td>");
                out.print("             <td>"+p.getPrecio()+"</td>");
                out.print("             </tr>");
            });
            out.print("         </table>");
            if(!esXls) {
                out.print("   </body>");
                out.print("</html>");
            }
        }
    }




























}
