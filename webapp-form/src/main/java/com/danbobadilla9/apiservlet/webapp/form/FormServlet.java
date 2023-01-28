package com.danbobadilla9.apiservlet.webapp.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/registro")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String pais = req.getParameter("pais");
        String[] lenguajes = req.getParameterValues("lenguajes");
        String[] roles = req.getParameterValues("roles");

        String idioma = req.getParameter("idioma");
        String habilitar = req.getParameter("habilitar");
        String secreto = req.getParameter("secreto");

        Map<String,String> errores = new HashMap<>();

        if (username == null || username.isBlank()) {
            errores.put("username","El username es requerido!");
        }

        if (password == null || password.isBlank()) {
            errores.put("password","El passwrod no puede ser vacio!");
        }

        if (email == null || email.contains("@")) {
            errores.put("email","El email es requerido y debe tener un formato de correo");
        }

        if (pais == null || pais.isBlank()) {
            errores.put("pais","El pais es requerido!");
        }

        if (lenguajes == null || lenguajes.length == 0) {
            errores.put("lenguajes","Debe seleccionar al menos un tema");
        }

        if (roles == null || roles.length == 0) {
            errores.put("roles","Debe seleccionar al menos un role!");
        }

        if (idioma == null) {
            errores.put("idioma","Debe seleccionar un idioma!");
        }

        if (errores.isEmpty()) {
            try (PrintWriter out = resp.getWriter()) {

                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Resultado form</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Resultado form!</h1>");
                out.print("         <ul>");


                out.print("             <li> Username: " + username + "</li>");
                out.print("             <li> Password: " + password + "</li>");
                out.print("             <li> Email: " + email + "</li>");
                out.print("             <li> País: " + pais + "</li>");
                out.print("             <li>Lenguajes: <ul>");

                Arrays.asList(lenguajes).forEach(lenguaje -> {
                    out.print("             <li>" + lenguaje + "</li>");
                });
                out.print("             </ul></li>");

                out.print("             <li>Roles: <ul>");
                Arrays.asList(roles).forEach(rol -> {
                    out.print("             <li>" + rol + "</li>");
                });
                out.print("             </ul></li>");

                out.print("             <li>Idioma: " + idioma + "</li>");
                out.print("             <li>Habilitado: " + habilitar + "</li>");
                out.print("             <li>Secreto: " + secreto + "</li>");
                out.print("         </ul>");
                out.print("   </body>");
                out.print("</html>");
            }
        } else {
                /*errores.forEach( error -> {
                    out.print("<li>"+error+"</li>");
                });
                out.print("<p><a href=\"/webapp-form\">volver</a></p>");*/
            req.setAttribute("errores", errores);//Permite pasar datos a un jsp o otro servlet
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);//indicamos donde se encuentra el jsp
        }
    }
}

