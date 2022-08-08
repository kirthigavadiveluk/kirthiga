<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
body{
background-image:url("https://th.bing.com/th/id/OIP.2aQ5goImlA8uRnJ-WYCf0QHaEK?pid=ImgDet&w=602&h=338&rs=1");
background-size:cover;

}

</style>

<form:form action="/form/register" method="POST" modelAttribute="user">
<center>
    UserName:<form:input type="text" path="uname" required="required"/><br>
    <form:errors path="uname"></form:errors><br>
    PassWord:<input type="password" name="upass" required="required"/><br>
    Re-Enter PassWord:<input type="password" name="pass1" required="required"/><br>
    Phone:<form:input path="phno" required="required"/><br>
    City:<form:input type="text" path="city" required="required"/><br>
    <input type="submit" value="click...">
    </center>
</form:form>
