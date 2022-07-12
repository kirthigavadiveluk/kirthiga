<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1>Vegetable Shop</h1>
<form action="purchase.do" method=post>
<input type="hidden" name="nextshop" value="shop3">

<input type="checkbox" name="c4" value="Brinjal">Brinjal
<input type="checkbox" name="c5" value="chillies">Chillies
<input type="checkbox" name="c6" value="Onion">Onion
<input type="submit" value="Next Shop....">

</form>
</body>
</html>