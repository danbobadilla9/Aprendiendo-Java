package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.services.LoginService;
import com.bobadilla9.apiservlet.webapp.headers.services.LoginServiceCookieImpl;
import com.bobadilla9.apiservlet.webapp.headers.services.LoginServiceSessionImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet({"/login","/login.html"})
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> usernameOptional  = auth.getUsername(req);
        if(usernameOptional.isPresent()){
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Hola "+usernameOptional.get()+"</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Hola "+usernameOptional.get()+"  has iniciado sesión con éxito</h1>");
                out.print("   <p><a href='"+req.getContextPath()+"/index.html'>Volver</a> </p>");
                out.print("   <p><a href='"+req.getContextPath()+"/logout'>Cerrar Sesión</a> </p>");
                out.print("   </body>");
                out.print("</html>");
            }
        }else{
            getServletContext().getRequestDispatcher("/login.jsp").forward(req,resp);//Unimos los dos jsp y servlet para no perder datos
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(USERNAME.equals(username) && PASSWORD.equals(password)){

            HttpSession session=req.getSession();
            session.setAttribute("username", username);

            resp.sendRedirect(req.getContextPath()+"/login.html");

        }else{
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Lo sentimos no esta autorizado para ingresar a esta pagina!");
        }


    }



























}
