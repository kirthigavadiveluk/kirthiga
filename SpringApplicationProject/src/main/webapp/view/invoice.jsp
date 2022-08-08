<jsp:include page="logout.jsp" />
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("https://cdn.dribbble.com/users/992274/screenshots/12021931/media/d0a8c1449b59baa923797cfafc409f20.jpg");
background-size:cover;
}
</style>
<center><h1>Invoice</h1></center>
<hr>
<body>
	<%
Enumeration<String> em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop"))
	{
		
	}else{
	out.println("<h1>"+a+":"+b+"<h1>");
	}
}
%>

</body>
</html>