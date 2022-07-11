<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! 
         private int  fact(int n) { return n >0 ? n* fact(n-1): 1 ;   }  
      %>
	Testing function
	<table border=3>
		<tr>
			<th>Value</th>
			<th>Factorial</th>
		</tr>
		<% 
          for (int i=0; i<10; i++) { %>
		<tr>
			<td><%= i %></td>
			<td><%= fact(i)%></td>
		</tr>
		<%}%>
	</table>

</body>
</html>