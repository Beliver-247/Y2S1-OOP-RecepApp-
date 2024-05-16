package com.Patient;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddPatient extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String NIC = request.getParameter("NIC");
        String fullName = request.getParameter("fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String mobilePhone = request.getParameter("Mphone");
        String homePhone = request.getParameter("Hphone");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String bloodType = request.getParameter("bloodtype");
        String insurance = request.getParameter("insurance");
        String medicalHistory = request.getParameter("medicalhistory");
        String password = request.getParameter("pwd");

        Patient patient = new Patient();
        patient.setNIC(NIC);
        patient.setpName(fullName);
        patient.setpAge(age);
        patient.setGender(gender);
        patient.setMphone(mobilePhone);
        patient.setHphone(homePhone);
        patient.setpAddress(address);
        patient.setpEmail(email);
        patient.setBloodType(bloodType);
        patient.setInsuarance(insurance);
        patient.setMedicalHistory(medicalHistory);
        patient.setPwd(password);

        boolean isSuccess = PatientDButil.addPatient(patient);

        if (isSuccess) {
            response.sendRedirect("success.jsp"); // Redirect to success page
        } else {
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}
