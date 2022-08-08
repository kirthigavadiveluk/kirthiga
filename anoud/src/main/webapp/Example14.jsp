<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <jsp:useBean id="cb" class="anoudpack.CircleBean" />
     <jsp:setProperty name="cb" property="radius" value="2.0" />  
         Reduced Form: <jsp:getProperty name="cb" property="area" />  
	 
</body>
</html>