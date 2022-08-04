<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Welcome to Register...</h1>
<form:form action="/form/forms" method="POST" modelAttribute="user">
    UserName:<form:input type="text" path="uname" required="required"/><br>
    <form:errors path="uname"></form:errors><br>
    PassWord:<input type="password" name="upass" required="required"/><br>
    Re-Enter PassWord:<input type="password" name="pass1" required="required"/><br>

    Phone:<form:input path="phno" required="required"/><br>
  
    City:<form:input type="text" path="city" required="required"/><br>
  
    <input type="submit" value="click...">
</form:form>