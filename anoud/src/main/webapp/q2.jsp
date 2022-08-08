<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>
<body>
	<%@ page language="java"%>
	<%! String name=""; %>
	<% 
                       name = request.getParameter("thename");
                       session.putValue("thename", name); 
                       %>

	The name is
	<%= name %>
	<p>
	<form method="post" action="q3.jsp">

		What is your favorite food? <INPUT TYPE=TEXT NAME="food">
		<p>
			<input type="submit" VALUE="submit">
	</form>

</body>
</html>