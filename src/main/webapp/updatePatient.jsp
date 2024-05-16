<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="scripts/validateUpdateForm.js"></script>
    <link rel="stylesheet" href="styles/login.css">    
    <title>Update Patient</title>
</head>
<body>
    <h1>Update Patient Details</h1>
    <form action="UpdatePatient" method="post" onsubmit="return validateUpdateForm()">
    
    	<input type = "text" name = "id" value="${id}" readonly>
    	
        <input type="text" name="upNIC" value="${NIC}">
        
        <label for="fullname">Full Name:</label><br>
        <input type="text" id="fullname" name="fullname" value="${fullname}"><br><br>
        
        <label for="age">Age:</label><br>
        <input type="number" id="age" name="age" value="${age}"><br><br>
        
        <label for="gender">Gender(view only):</label><br>
        <input type="text" id="gender" name="gender" value="${gender}" readonly><br><br>
        
        <label for="Mphone">Mobile Phone:</label><br>
        <input type="text" id="Mphone" name="Mphone" value="${Mphone}"><br><br>
        
        <label for="Hphone">Home Phone:</label><br>
        <input type="text" id="Hphone" name="Hphone" value="${Hphone}"><br><br>
        
        <label for="address">Address:</label><br>
        <textarea id="address" name="address" rows="4" cols="50">${address}</textarea><br><br>
        
        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" value="${email}"><br><br>
        
        <label for="bloodtype">Blood Type:</label><br>
        <input type="text" id="bloodtype" name="bloodtype" value="${bloodtype}"><br><br>
        
        <label for="insurance">Insurance Provider:</label><br>
        <input type="text" id="insurance" name="insurance" value="${insurance}"><br><br>
        
        <label for="medicalhistory">Medical History:</label><br>
        <textarea id="medicalhistory" name="medicalhistory" rows="4" cols="50">${medicalhistory}</textarea><br><br>
        
        <label for="pwd">Password:</label><br>
        <input type="text" id="pwd" name="pwd" value="${pwd}"><br><br>
        
        <input type="submit" value="Save Changes">
    </form>
</body>
</html>
