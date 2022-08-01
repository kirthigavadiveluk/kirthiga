<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form1/register" method="POST" modelAttribute="userObj">
	UserName:<form:input path="uname"/><br>
	<form:errors path="uname"></form:errors><br>
	PassWord:<form:input path="upass"/><br>
	Email:<form:input path="email"/><br>
	Phone:<form:input path="phone"/><br>	
	<input type="submit" value="click...">
</form:form>