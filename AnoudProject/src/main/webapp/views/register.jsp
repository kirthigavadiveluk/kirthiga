<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Welcome to Register...</h1>
<form:form action="/form/forms" method="POST" modelAttribute="user">
    UserName:<form:input type="text" path="name" required="required"/><br>
    <form:errors path="name"></form:errors><br>
    PassWord:<input type="password" name="pass" required="required"/><br>
    Re-Enter PassWord:<input type="password" name="pass1" required="required"/><br>

    Phone:<form:input path="phonenumber" required="required"/><br>
    Address:<form:input type="text" path="address" required="required"/><br>
    City:<form:input type="text" path="city" required="required"/><br>
    image:<form:input type="file" path="image" required="required"/><br>
    <input type="submit" value="click...">
</form:form>