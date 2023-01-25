package com.danbobadilla9.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros/url-get")
public class ParametrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("   <head>");
        out.print("         <meta charset=\"UTF-8\">");
        out.print("         <title>Parámetros Get de la url</title>");
        out.print("   </head>");
        out.print("   <body>");
        out.print("         <h1>Parámetros Get de la url</h1>");
        if(saludo != null && nombre != null){
            out.print("         <h2>El saludo enviado es: "+saludo+" "+nombre+"</h2>");
        }else if(saludo != null){
            out.print("         <h2>El saludo enviado es: "+saludo+"</h2>");
        }else if(nombre != null){
            out.print("         <h2>El nombre enviado es: "+nombre+"</h2>");
        }
        else{
            out.print("         <h2>No se han pasado los parámetros saludos ni nombre</h2>");
        }
        try{
            int codigo = Integer.parseInt(req.getParameter("codigo"));
            out.print("<h3>El codigo enviado es: "+codigo+"</h3>");
        }catch (NumberFormatException e){
            out.print("<h3>El codigo no se ah enviado, en null</h3>");
        }
        out.print("   </body>");
        out.print("</html>");
        out.close();
    }













































}
