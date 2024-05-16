<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/login.css">
    <script src="scripts/popUpMessage.js"></script>
    
    <title>Login</title>
</head>
<body>
    <h2>Receptionist Login</h2>
    
    <form action="RecepLoginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="uid" name="uid" required><br><br>

        <label for="password">Password:</label>
        <input type="password" name="pass" required><br><br>

        <input type="submit" name="submit" value="Login">
    </form>
	<br>
    <div class="error-message" id="errorMessage">
        Invalid credentials. Please try again.
    </div>
    
    <script>
        // Check if the error message should be displayed 
        var errorParam = '<%= request.getParameter("error") %>';
        if (errorParam != null && errorParam === "1") {
            displayErrorMessage(); // Call the function to display the error message
        }
    </script>
   
</body>
</html>
