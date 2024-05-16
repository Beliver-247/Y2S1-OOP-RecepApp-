<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel = "styleSheet" href = "styles/SuccessError.css">
<title>error</title>
</head>
<body>

	<div>
		<h1>Operation failed!!</h1><br>
		<h3 align = 'center'>Redirecting...</h3>
	</div>
		  <script type="text/javascript">
        setTimeout(function() {
            window.location.href = "recepDash.jsp";
        }, 1500); // Redirect 
    </script>
</body>
</html>