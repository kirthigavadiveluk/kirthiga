<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function checkForm(){
	if(document.Customer.name.value.length==0){
		alert("Please Enter Name");
		return false;
	}
	if(isNaN(document.Customer.age.value)){
		alert("Please Enter Age As Numeric..")
		return false;
	}
	document.Customer.ID.value="Insert";
	document.Customer.submit();
	return true;
}
function checkForm1(){
	document.Customer.ID.value="Display";
	document.Customer.submit();
	return true;
}

</script>
<body>
	<%@include file="Header.jsp"%>
	<h3>Employee Details</h3>
	<form name="Customer" method="get" action="dbConn.jsp">

		<input type="hidden" name="ID" value="Display">
		<table>
			<tr>
				<td>Enter Name</td>
				<td><input type="text" name="name" size="20"></td>
				<td>Enter Age</td>
				<td><input type="text" name="age" size="3"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" name="hAdd"
					value="Insert" onClick="checkForm()"></td>
				<td colspan="2" align="center"><input type="button"
					name="hDisp" value="Display" onClick="checkForm1()"></td>
			</tr>
		</table>
	</form>
	<%@ include file="Footer.jsp"%>
	
</body>
</html>