package com.bobadilla9.apiservlet.webapp.headers.listeners;

import com.bobadilla9.apiservlet.webapp.headers.models.Carro;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
@WebListener
public class AplicacionListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {

    private ServletContext servletContext;


    @Override
    public void contextInitialized(ServletContextEvent sce){
        sce.getServletContext().log("Inicializando la aplicación!");
        servletContext = sce.getServletContext();
        servletContext.setAttribute("mensaje","algun valor global de la app");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        servletContext.log("Destruyendo la aplicación!");
    }


    @Override
    public void requestInitialized(ServletRequestEvent sre){
        //Aqui podriamos inicializar la con a la BD
        servletContext.log("inicializando el request!");
        sre.getServletRequest().setAttribute("mensaje","guarando algun valor para el request");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre){
        servletContext.log("destruyendo el request!");

    }

    @Override
    public void sessionCreated(HttpSessionEvent se){
        //guardar el cardo de compras de manera más global
        servletContext.log("inicializando la sesion http");
        Carro carro = new Carro();
        HttpSession session = se.getSession();
        session.setAttribute("carro", carro);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se){
        servletContext.log("destruyendo la sesion http");
    }






































}
