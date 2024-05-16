package com.Receptionist;

import com.shared.DBconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ReceptionistDButil {

    public static Receptionist getReceptionistByCredentials(String username, String password) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Receptionist receptionist = null;

        try {
            con = DBconnect.getConnection();
            String query = "SELECT * FROM reception WHERE UserID = ? AND UPassword = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Rname");
                String address = rs.getString("Address");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                String userID = rs.getString("UserID");
                String uPassword = rs.getString("UPassword");

                receptionist = new Receptionist(id, name, address, email, mobile, userID, uPassword);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return receptionist;
    }
}
