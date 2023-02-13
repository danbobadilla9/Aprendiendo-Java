package com.danbobadilla9.apiservlet.webapp.headers.filters;

import com.danbobadilla9.apiservlet.webapp.headers.services.ServiceJdbcException;
import com.danbobadilla9.apiservlet.webapp.headers.util.ConexionJDBC;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebFilter("/*")//Indica que se ejecuta en cualquier ruta de la aplicacion
public class ConexionFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException{

        try(Connection conn = ConexionJDBC.getConnection()){

            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            try{
                req.setAttribute("conn",conn);
                chain.doFilter(req, resp);
                conn.commit();
            }catch (SQLException | ServiceJdbcException e){
                conn.rollback();
                ((HttpServletResponse)resp).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,e.getMessage());
                e.printStackTrace();
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }

    }




































}
