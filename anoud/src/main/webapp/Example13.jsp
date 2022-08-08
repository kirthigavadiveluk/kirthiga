<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="b2" class="anoudpack.TimeBean" />

     Hour   = <jsp:getProperty name="b2" property="hour" />  <BR>
     Minute = <jsp:getProperty name="b2" property="minute" /><BR>
     Second = <jsp:getProperty name="b2" property="second" /><BR>
     Message= <jsp:getProperty name="b2" property="message"/>
</body>
</html>
