package com.Receptionist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RecepLogoutServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processLogout(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processLogout(request, response);
    }

    private void processLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Invalidate the session
        HttpSession session = request.getSession(false); // Retrieve existing session if it exists
        if (session != null) {
            session.removeAttribute("uid"); // Remove session attribute 'uid'
            session.invalidate(); // Invalidate the session
        }

        // Redirect to login page after logout
        response.sendRedirect("ReceptionistLogin.jsp");
    }
}
