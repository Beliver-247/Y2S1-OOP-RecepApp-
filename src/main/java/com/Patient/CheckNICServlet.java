package com.Patient;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckNICServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nic = request.getParameter("chNIC");
        
        try {
            //checking if patient exists
            Patient patient = PatientDButil.getPatientByNIC(nic);

            if (patient != null) {
                // Patient with this NIC exists, show error message
                request.setAttribute("errorMessage", "Patient with this NIC already exists.");
                request.getRequestDispatcher("/CheckNIC.jsp").forward(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/AddPatient.jsp?nic=" + nic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
