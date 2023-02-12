package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.models.Carro;
import com.bobadilla9.apiservlet.webapp.headers.models.ItemCarro;
import com.bobadilla9.apiservlet.webapp.headers.models.Producto;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoService;
import com.bobadilla9.apiservlet.webapp.headers.services.ProductoServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/agregar-carro")
public class AgregarCarroServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Long id = Long.parseLong(req.getParameter("id"));
        ProductoService service = new ProductoServiceImpl();
        Optional<Producto> producto = service.porId(id);
        if( producto.isPresent() ){
            ItemCarro item = new ItemCarro(1, producto.get());
            HttpSession session = req.getSession();
            Carro carro = carro = (Carro) session.getAttribute("carro");

            carro.addItemCarro(item);
        }
        resp.sendRedirect(req.getContextPath()+"/ver-carro");
        return;
    }

































}
