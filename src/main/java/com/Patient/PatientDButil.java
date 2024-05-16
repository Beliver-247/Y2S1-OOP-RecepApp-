package com.Patient;

import com.shared.DBconnect;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDButil {

    // Method to add a new patient to the database
    public static boolean addPatient(Patient patient) {
        boolean isSuccess = false;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBconnect.getConnection();
            String sql = "INSERT INTO patient (NIC, pName, pAge, Gender, Mphone, Hphone, pAddress, pEmail, bloodType, Insurance, MedicalHistory, pwd) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, patient.getNIC());
            pstmt.setString(2, patient.getpName());
            pstmt.setInt(3, patient.getpAge());
            pstmt.setString(4, patient.getGender());
            pstmt.setString(5, patient.getMphone());
            pstmt.setString(6, patient.getHphone());
            pstmt.setString(7, patient.getpAddress());
            pstmt.setString(8, patient.getpEmail());
            pstmt.setString(9, patient.getBloodType());
            pstmt.setString(10, patient.getInsuarance());
            pstmt.setString(11, patient.getMedicalHistory());
            pstmt.setString(12, patient.getpwd());

            int rowsAffected = pstmt.executeUpdate();
            isSuccess = (rowsAffected > 0);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	DBconnect.closeConnection(con);
        	DBconnect.closePreparedStatement(pstmt);
        }
        return isSuccess;
    }

    //method to delete a patient 
    public static boolean deletePatient(String NIC) {
        boolean isSuccess = false;
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBconnect.getConnection();
            String sql = "DELETE FROM patient WHERE NIC=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, NIC);

            int rowsAffected = pstmt.executeUpdate();

            isSuccess = (rowsAffected > 0);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isSuccess;
    }
    
    //method to return all patients in a list
    public static List<Patient> viewPatients() {
        List<Patient> patients = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DBconnect.getConnection();
            String query = "SELECT * FROM patient";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nIC = rs.getString("NIC");
                String pName = rs.getString("pName");
                int pAge = rs.getInt("pAge");
                String gender = rs.getString("gender");
                String mphone = rs.getString("Mphone");
                String hphone = rs.getString("Hphone");
                String pAddress = rs.getString("pAddress");
                String pEmail = rs.getString("pEmail");
                String bloodType = rs.getString("bloodType");
                String insurance = rs.getString("Insurance");
                String medicalHistory = rs.getString("MedicalHistory");

                Patient patient = new Patient(id, nIC, pName, pAge, gender, mphone, hphone, pAddress, pEmail,
                        bloodType, insurance, medicalHistory, "");
                patients.add(patient);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
                DBconnect.closeConnection(con);
                DBconnect.closePreparedStatement(ps);
                DBconnect.closeResultSet(rs);
        }

        return patients;
    }
    
   
    public static Patient getPatientByNIC(String NIC) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Patient patient = null;

        try {
            con = DBconnect.getConnection();

            String sql = "SELECT * FROM patient WHERE NIC = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, NIC);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                // Retrieve patient details from the result set
                patient = new Patient(
                    rs.getInt("id"),
                    rs.getString("NIC"),
                    rs.getString("pName"),
                    rs.getInt("pAge"),
                    rs.getString("Gender"),
                    rs.getString("Mphone"),
                    rs.getString("Hphone"),
                    rs.getString("pAddress"),
                    rs.getString("pEmail"),
                    rs.getString("bloodType"),
                    rs.getString("Insurance"),
                    rs.getString("MedicalHistory"),
                    rs.getString("pwd")
                );
            }
        } finally {
            DBconnect.closeConnection(con);
            DBconnect.closePreparedStatement(pstmt);
            DBconnect.closeResultSet(rs);
        }

        return patient;
    }
    
    //method to update a patient
    public static boolean updatePatient(Patient patient) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean success = false;
        
        try {
            conn = DBconnect.getConnection(); // Assuming ConnectionManager provides the database connection
            String sql = "UPDATE patient SET pName = ?, pAge = ?, Mphone = ?, Hphone = ?, pAddress = ?, pEmail = ?, " +
                         "bloodType = ?, Insurance = ?, MedicalHistory = ?, pwd = ? WHERE id = ?";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, patient.getpName());
            stmt.setInt(2, patient.getpAge());
            stmt.setString(3, patient.getMphone());
            stmt.setString(4, patient.getHphone());
            stmt.setString(5, patient.getpAddress());
            stmt.setString(6, patient.getpEmail());
            stmt.setString(7, patient.getBloodType());
            stmt.setString(8, patient.getInsuarance()); // Note: Insuarance should be corrected to Insurance
            stmt.setString(9, patient.getMedicalHistory());
            stmt.setString(10, patient.getpwd());
            stmt.setInt(11, patient.getId());
            
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Re-throw the exception to be handled by the caller
        } finally {
            // Close resources in finally block
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
        return success;
    }    
    

}




