<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Patient Registration</title>
    <link rel="stylesheet" href="styles/login.css">
    <script src="scripts/validateForm.js"></script>
</head>
<body>

<h2 align="center">Patient Registration Form</h2>

<form action="add" method="post" onsubmit="return validateForm()">

    <label for="NIC">NIC:</label><br>
    <input type="text" id="NIC" name="NIC" value="${param.nic}" required>
    <span id="nicError" class="error" style="display: none;"></span><br><br>

    <label for="fullname">Full Name:</label><br>
    <input type="text" id="fullname" name="fullname" required>
    <span id="fullnameError" class="error" style="display: none;"></span><br><br>

    <label for="age">Age:</label><br>
    <input type="number" id="age" name="age" required>
    <span id="ageError" class="error" style="display: none;"></span><br><br>

    <label for="gender">Gender:</label><br>
    <select id="gender" name="gender" required>
        <option value="">Select Gender</option>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
    </select>
    <span id="genderError" class="error" style="display: none;"></span><br><br>

    <label for="Mphone">Phone Number(Mobile):</label><br>
    <input type="text" id="Mphone" name="Mphone" required>
    <span id="MphoneError" class="error" style="display: none;"></span><br><br>
    
    <label for="Hphone">Phone Number(Home):</label><br>
    <input type="text" id="Hphone" name="Hphone" required>
    <span id="HphoneError" class="error" style="display: none;"></span><br><br>

    <label for="address">Address:</label><br>
    <textarea id="address" name="address" rows="4" cols="50" required></textarea>
    <span id="addressError" class="error" style="display: none;"></span><br><br>

    <label for="email">Email:</label><br>
    <input type="email" id="email" name="email">

    <label for="bloodtype">Blood Type:</label><br>
    <input type="text" id="bloodtype" name="bloodtype">
    <span id="bloodtypeError" class="error" style="display: none;"></span><br><br>

    <label for="insurance">Insurance Provider:</label><br>
    <input type="text" id="insurance" name="insurance">
    <span id="insuranceError" class="error" style="display: none;"></span><br><br>

    <label for="medicalhistory">Medical History:</label><br>
    <textarea id="medicalhistory" name="medicalhistory" rows="4" cols="50"></textarea>

    
    <label for="pass">Password:</label><br>
    <input type="password" id="pass" name="pwd" required>
    <span id="passwordError" class="error" style="display: none;"></span><br><br>

    <input type="submit" value="Add patient">

</form>

</body>
</html>
