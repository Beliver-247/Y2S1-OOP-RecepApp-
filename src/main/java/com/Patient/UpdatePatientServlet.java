package com.Patient;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePatientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve updated patient details from the form
        int id = Integer.parseInt(request.getParameter("id"));
        String fullname = request.getParameter("fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String Mphone = request.getParameter("Mphone");
        String Hphone = request.getParameter("Hphone");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String bloodtype = request.getParameter("bloodtype");
        String insurance = request.getParameter("insurance");
        String medicalhistory = request.getParameter("medicalhistory");
        String pwd = request.getParameter("pwd");

        // Create a new Patient object with updated details
        Patient updatedPatient = new Patient(id, null, fullname, age, null, Mphone, Hphone, address, email, bloodtype, insurance, medicalhistory, pwd);

        try {
            // Use the PatientDButil to update the patient's record in the database
            boolean success = PatientDButil.updatePatient(updatedPatient);

            if (success) {
                response.sendRedirect("success.jsp"); // Redirect to success page
            } else {
                response.getWriter().println("Failed to update patient"); // Show error message
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}
