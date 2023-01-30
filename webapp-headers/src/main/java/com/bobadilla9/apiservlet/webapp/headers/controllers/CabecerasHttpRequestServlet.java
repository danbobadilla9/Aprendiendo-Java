package com.bobadilla9.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/cabeceras-request")
public class CabecerasHttpRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String metodoHttp = req.getMethod();//Regresa el tipo que es
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        //construir la URL
        String ip = req.getLocalAddr();
        int port = req.getLocalPort();
        String scheme = req.getScheme();
        String host = req.getHeader("host");
        String url = scheme + "://"+host+contextPath+servletPath;
        String url2 = scheme + "://"+ip+":"+port+contextPath+servletPath;

        String ipCliente = req.getRemoteUser();//IP del usuario que entra a la pag

        try (PrintWriter out = resp.getWriter()) {

            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("   <head>");
            out.print("         <meta charset=\"UTF-8\">");
            out.print("         <title>Cabeceras HTTP Request</title>");
            out.print("   </head>");
            out.print("   <body>");
            out.print("         <h1>Cabeceras HTTP Request</h1>");
            out.print("         <ul>");
            out.print("             <li>Metodo http: "+metodoHttp+"</li>");
            out.print("             <li>Request URI: "+requestUri+"</li>");
            out.print("             <li>Request URL: "+requestUrl+"</li>");
            out.print("             <li>Context Path: "+contextPath+"</li>");
            out.print("             <li>Context Servlet: "+servletPath+"</li>");
            out.print("             <li>Ip Local: "+ip+"</li>");
            out.print("             <li>Ip Cliente: "+ipCliente+"</li>");
            out.print("             <li>Port Local: "+port+"</li>");
            out.print("             <li>Scheme Local: "+scheme+"</li>");
            out.print("             <li>Host Local: "+host+"</li>");
            out.print("             <li>Url Local: "+url+"</li>");
            out.print("             <li>Url Local IP: "+url2+"</li>");
            Enumeration<String> headerNames = req.getHeaderNames();
            while(headerNames.hasMoreElements()){
                String cabecera = headerNames.nextElement();
                out.print("     <li>"+cabecera+": "+req.getHeader(cabecera)+"</li>");
            }

            out.print("         </ul>");
            out.print("   </body>");
            out.print("</html>");
        }
    }




































}
