package com.bobadilla9.apiservlet.webapp.headers.filters;

import com.bobadilla9.apiservlet.webapp.headers.services.LoginService;
import com.bobadilla9.apiservlet.webapp.headers.services.LoginServiceSessionImpl;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;
//Podemos utilizar * para omitir multiples rutas de la sig manera .- /carro/*
@WebFilter({"/ver-carro","/agregar-carro","/actualizar-carro"})
public class LoginFiltro implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        LoginService service = new LoginServiceSessionImpl();
        Optional<String> username = service.getUsername((HttpServletRequest) req);
        if(username.isPresent()){
            chain.doFilter(req,res);//Aqui llamamos al servlet o a otros filtros
        }else{
            ((HttpServletResponse)res).sendError(HttpServletResponse.SC_UNAUTHORIZED,"Lo sentimos no estas autorizado para ingresar a esta pagina");

        }
    }

}
