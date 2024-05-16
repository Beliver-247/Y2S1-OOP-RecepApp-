<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="styles/login.css">
    <script src="scripts/validateNIC.js"></script>
    <title>Check NIC</title>
    
    <script>
        //hide error message after 2 seconds
        function hideErrorMessage() {
            var errorMessageElement = document.getElementById('errorMessage');
            if (errorMessageElement) {
                setTimeout(function() {
                    errorMessageElement.style.display = 'none';
                }, 2000); //2 seconds
            }
        }
    </script>
</head>
<body>
    <form method="post" action="CheckNIC" onsubmit="return validNIC()">
        <input type="text" name="chNIC" id="chNIC" placeholder="NIC">
        <input type="submit" value="Check NIC">
    </form>
    
    <%-- Display error message if it exists --%>
    <% if (request.getAttribute("errorMessage") != null) { %>
        <p id="errorMessage" align="center" style="color: red;">
            <%= request.getAttribute("errorMessage") %>
        </p>
        <script>
            // function call to hide message
            hideErrorMessage();
        </script>
    <% } %>
</body>
</html>
