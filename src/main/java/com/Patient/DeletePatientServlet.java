package com.Patient;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePatientServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the NIC parameter from the request
        String nic = request.getParameter("delNIC");

        // deleting the patient from the database
        boolean isSuccess = PatientDButil.deletePatient(nic);

        if (isSuccess) {
            // Redirect to success page 
            response.sendRedirect("success.jsp");
        } else {
            // Redirect to error page 
            response.sendRedirect("error.jsp");
        }
    }
}
