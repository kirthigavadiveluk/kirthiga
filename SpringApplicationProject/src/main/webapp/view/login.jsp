<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.ad53efa599b521b4486777363eb3d866?rik=HQjf4sI9rLYncg&riu=http%3a%2f%2fimg.clipartlook.com%2fclip-art-supermarkets-supermarket-clipart-1300_774.jpg&ehk=YsP3lrBRJbKWjpcCJu5iebOM%2b0V%2bqGahY9%2fFDboRJ1c%3d&risl=&pid=ImgRaw&r=0");
background-size:cover;
}
</style>
<form:form action="/form/forms1" method="POST">
<center>
    User Name:
    <input type="text" name="uname" required="required"><br>
    Password:<input type="password" name="upass" required="required"><br>
    <input type="submit" value="click...">
    </center>
</form:form>


