<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/forms1" method="POST">
    User Name:
    <input type="text" name="uname" required="required"><br>
    Password:<input type="password" name="upass" required="required"><br>
    <input type="submit" value="click...">
</form:form>