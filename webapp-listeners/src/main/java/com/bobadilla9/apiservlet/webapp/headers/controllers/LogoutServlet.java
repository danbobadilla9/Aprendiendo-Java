package com.bobadilla9.apiservlet.webapp.headers.controllers;

import com.bobadilla9.apiservlet.webapp.headers.services.LoginService;
import com.bobadilla9.apiservlet.webapp.headers.services.LoginServiceCookieImpl;
import com.bobadilla9.apiservlet.webapp.headers.services.LoginServiceSessionImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> cookie = auth.getUsername(req);
        if(cookie.isPresent()){
            HttpSession session = req.getSession();
//            session.removeAttribute("username");
              session.invalidate();
        }
        resp.sendRedirect(req.getContextPath()+"/login.html");
    }
}
