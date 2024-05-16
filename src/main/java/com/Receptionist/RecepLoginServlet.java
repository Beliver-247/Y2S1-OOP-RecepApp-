package com.Receptionist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

public class RecepLoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("uid");
        String password = request.getParameter("pass");

        Receptionist receptionist = ReceptionistDButil.getReceptionistByCredentials(username, password);

        if (receptionist != null) {
            // Successful login, create a session
            HttpSession session = request.getSession(true); // Create a new session if one doesn't exist
            session.setAttribute("uid", username); 

            response.sendRedirect("recepDash.jsp"); // Redirect to dashboard
        } else {
            // Login failed
            response.sendRedirect("ReceptionistLogin.jsp?error=1"); // Redirect with error flag
        }
    }
}
