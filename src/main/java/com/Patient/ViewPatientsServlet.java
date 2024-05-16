package com.Patient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewPatientsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        List<Patient> patients = PatientDButil.viewPatients();

       
        request.setAttribute("patients", patients);

        // Forward the request to viewPatients.jsp 
        RequestDispatcher dispatcher = request.getRequestDispatcher("viewPatients.jsp");
        dispatcher.forward(request, response);
    }
}
