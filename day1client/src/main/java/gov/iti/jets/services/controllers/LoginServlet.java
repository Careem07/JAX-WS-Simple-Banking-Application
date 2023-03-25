package gov.iti.jets.services.controllers;

import gov.iti.jets.services.atm.*;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");

        AtmService service = new AtmService();

        Atm atmServices = service.getAtmPort();
        req.setAttribute("user",atmServices.login(username));
        req.getRequestDispatcher("atm.jsp").forward(req,resp);
    }
}
