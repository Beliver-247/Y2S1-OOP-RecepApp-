<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/recepDash.css">
    <title>Receptionist Dashboard</title>
</head>
<body>

<c:if test="${empty sessionScope.uid}">
    <%-- If session attribute 'uid' is not set, redirect to login page --%>
    <%
        response.sendRedirect("ReceptionistLogin.jsp");
    %>
</c:if>

<nav>
    <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="RecepLogoutServlet">Logout</a></li>
    </ul>
</nav>

<h1>Dashboard</h1>

<div class="wrapper">
    <div class="flex-container1">
        <div>
            <form action="CheckNIC.jsp">
                <input type="submit" value="Add a Patient">
            </form>
        </div>
        <div>
            <form method="post" action="ViewPatient">
                <input type="submit" value="View Patients">
            </form>
        </div>
    </div>

    <div class="flex-container2">
        <div>
            <form method="post" action="UpdateFormServlet">
                <input type="text" name="upNIC" id="upNIC" placeholder="NIC">
                <input type="submit" value="Update Patient">
            </form>
        </div>
        <div>
            <form method="post" action="DeletePatient">
                <input type="text" name="delNIC" id="delNIC" placeholder="NIC">
                <input type="submit" value="Delete Patient">
            </form>
        </div>
    </div>

</div>

<footer>
    <p>&copy; 2024 MediCarePro. All rights reserved.</p>
</footer>

</body>
</html>
