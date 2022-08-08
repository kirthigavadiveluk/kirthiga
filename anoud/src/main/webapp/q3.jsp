<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" %>

                       <%! String food="";
                        %>

                       <%
                       food = request.getParameter("food");
                       String name = (String) session.getValue("thename");
                       %>
                       Your name is <b><%= name %></b>
                       <P>
                       Your favorite food is <b><%= food %></b>

</body>
</html>