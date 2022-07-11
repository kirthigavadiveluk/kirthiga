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

<form method="post" action="addCookies.jsp">

<table>
    <tr>
        <td>Enter a value for MyCookie:</td>
        <td><input type = text name = "data" size="25"></td>
        
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type = submit>
        </td>
    </tr>
</table>
</form>
<%@ include file = "Footer.jsp" %>

</body>
</html>