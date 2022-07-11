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
<center>
<H3>Parameter Demo</H3>
<form name="param" method="get" action="ParameterBean.jsp">
<table>
    <tr>
        <td>Enter Numerator</td>
        <td><input type = "text" name = "num" size="3"></td>
    </tr>    
    <tr>
        <td>Enter Denominator</td>
        <td><input type = "text" name = "den" size="3"></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type = "submit" >
        </td>
    </tr>
</table>
</form>
</center>
<%@ include file = "Footer.jsp" %>

</body>
</html>