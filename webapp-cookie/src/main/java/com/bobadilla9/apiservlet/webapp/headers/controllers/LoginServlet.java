package com.bobadilla9.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

@WebServlet({"/login","/login.html"})
public class LoginServlet extends HttpServlet {
    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies() != null ? req.getCookies(): new Cookie[0];
        Optional<String> cookieOptional = Arrays.stream(cookies)
                .filter( c -> "username".equals(c.getName()))
                .map( Cookie::getValue)
                .findFirst();
        if(cookieOptional.isPresent()){
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Hola "+cookieOptional.get()+"</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Hola "+cookieOptional.get()+" y has iniciado sesión anteriormente!</h1>");
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

            Cookie usernameCookie = new Cookie("username", username);
            resp.addCookie(usernameCookie);

            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("   <head>");
                out.print("         <meta charset=\"UTF-8\">");
                out.print("         <title>Login Correcto</title>");
                out.print("   </head>");
                out.print("   <body>");
                out.print("         <h1>Login Correcto</h1>");
                out.print("         <h3>Hola "+username+" has iniciado sesion con éxito</h3>");
                out.print("   </body>");
                out.print("</html>");
            }
        }else{
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Lo sentimos no esta autorizado para ingresar a esta pagina!");
        }


    }



























}
