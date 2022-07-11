<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Cookie[] ck = request.getCookies();
   for(int i=0; i < ck.length; i++)
   {
      String name   = ck[i].getName();
      String value  = ck[i].getValue();
      out.println("name : "+ name +"  Value:"+value);
    }
%>

</body>
</html>