<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Some dynamic content created using various JSP mechanisms:
	<ul>
		<li><b>Expression.</b><br> Your hostname: <%= request.getRemoteHost() %>.
		
		<li><b>Scriptlet.</b><br> <% out.println("Attached GET data: " +
                     request.getQueryString()); %>
		<li><b>Declaration (plus expression).</b><br> <%! private int accessCount = 0; %>
			Accesses to page since server reboot: <%= ++accessCount %>
		<li><b>Directive (plus expression).</b><br> <%@ page
				import="java.util.*"%> Current date: <%= new Date() %>
	</ul>

</body>
</html>