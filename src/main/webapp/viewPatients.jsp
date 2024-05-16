<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles/viewPatients.css">
    <title>View Patients</title>
</head>
<body>
    <h2>Patient Records</h2>
    <table border="1">
        <thead>
            <tr>
            	<th>Patient ID</th>
                <th>NIC</th>
                <th>Full Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Mobile Phone</th>
                <th>Landline</th>
                <th>Address</th>
                <th>Email</th>
                <th>Blood Type</th>
                <th>Insurance Provider</th>
                <th>Medical History</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="patient" items="${patients}">
                <tr>
                	<td>${patient.id}</td>
                    <td>${patient.NIC}</td>
                    <td>${patient.pName}</td>
                    <td>${patient.pAge}</td>
                    <td>${patient.gender}</td>
                    <td>${patient.mphone}</td>
                    <td>${patient.hphone}</td>
                    <td>${patient.pAddress}</td>
                    <td>${patient.pEmail}</td>
                    <td>${patient.bloodType}</td>
                    <td>${patient.insuarance}</td>
                    <td>${patient.medicalHistory}</td>
                    <td>
            			<form method="post" action="UpdateFormServlet">
                			<input type="hidden" name="upNIC" id="upNIC" value = "${patient.NIC}">
                			<input type="submit" value="Update">
            			</form>
                </tr>
            </c:forEach>
            <c:if test="${empty patients}">
                <tr>
                    <td colspan="12">No patients found.</td>
                </tr>
            </c:if>
        </tbody>
    </table>
</body>
</html>
