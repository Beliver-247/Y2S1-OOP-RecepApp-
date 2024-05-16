package com.Patient;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateFormServlet")
public class UpdateFormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String NIC = request.getParameter("upNIC"); // Get NIC from form submission
        
        try {
            Patient patient = PatientDButil.getPatientByNIC(NIC);

            if (patient != null) {
                // Set attributes with correct names expected by updatePatient.jsp
            	request.setAttribute("id", patient.getId());
            	request.setAttribute("NIC", patient.getNIC());
                request.setAttribute("fullname", patient.getpName());
                request.setAttribute("age", patient.getpAge());
                request.setAttribute("gender", patient.getGender());
                request.setAttribute("Mphone", patient.getMphone());
                request.setAttribute("Hphone", patient.getHphone());
                request.setAttribute("address", patient.getpAddress());
                request.setAttribute("email", patient.getpEmail());
                request.setAttribute("bloodtype", patient.getBloodType());
                request.setAttribute("insurance", patient.getInsuarance());
                request.setAttribute("medicalhistory", patient.getMedicalHistory());
                request.setAttribute("pwd", patient.getpwd());

                request.getRequestDispatcher("/updatePatient.jsp").forward(request, response);
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
        
    }
    
  }
