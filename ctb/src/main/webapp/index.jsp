<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Taxi Service</h1>
	<center>
		<h1>Taxi Service</h1>
		<form action="form.do" method="post">
			<input name="action" value="login" type="hidden"> <input
				name="customerid" type="text" placeholder="Please Enter Your Id...."
				required="required"><br>
			<br> <label for="PickUpPoint">Select Your Pick Up Point
				:</label><br>
			<br> <input name="PickUpPoint" type="radio" value="A"
				checked="checked">A <input name="PickUpPoint" type="radio"
				value="B">B <input name="PickUpPoint" type="radio" value="C">C
			<input name="PickUpPoint" type="radio" value="D">D <input
				name="PickUpPoint" type="radio" value="E">E <input
				name="PickUpPoint" type="radio" value="F">F<br>
			<br> <label for="DropPoint">Select Your Drop Point :</label><br>
			<br> <input name="DropPoint" type="radio" value="A">A <input
				name="DropPoint" type="radio" value="B" checked="checked">B
			<input name="DropPoint" type="radio" value="C">C <input
				name="DropPoint" type="radio" value="D">D <input
				name="DropPoint" type="radio" value="E">E <input
				name="DropPoint" type="radio" value="F">F<br>
			<br> <label for="time">Select your Pick Up Time :</label><br>
			<br> <input type="time" name="time" required="required"><br>
			<br> <input type="submit" value="Allocate Taxi">
		</form>
	</center>

</body>
</html>