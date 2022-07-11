<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "Header.jsp" %>

<%
     String data = request.getParameter("data");
     // Create  cookie
     Cookie ck = new Cookie("MyCookie",data);
     response.addCookie(ck);
     out.println("MyCookie has been set to : "+data);
 %>

<%@ include file = "Footer.jsp" %>

</body>
</html>