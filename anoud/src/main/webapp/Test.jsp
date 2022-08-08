<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%@ page import = "java.util.*" %>
<%
  Enumeration e = request.getParameterNames();
  String pn; int i;
  while (e.hasMoreElements()){
     pn = (String) e.nextElement();
     out.println("<h2>"+pn+":</h2><ul>");
     String[] values = request.getParameterValues(pn);
     if(values != null)
      for (i = 0; i < values.length; i++)
        out.println("<li>"+values[i]);
    out.println("</ul>");  }
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>