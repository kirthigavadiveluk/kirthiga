<%@page import="java.sql.ResultSet" %>
<%@page import="com.example.demo.DBConnection"%>
<%@page import="java.io.OutputStream"%>

<html>
<style>
body{
background-image:url("https://th.bing.com/th/id/OIP.1FTxMutkZQBWp1ZEhYHEXwAAAA?pid=ImgDet&w=450&h=387&rs=1");
background-size:cover;
}
</style>
<center><h1>FruitShop</h1></center>
<hr>
<%! ResultSet rs ;
DBConnection im ;
    public void jspInit() {
        im = new DBConnection();
    }
%>
<form action="/form/shop" method="post">
<input type="hidden" name="shop" value="vegetableshop">
<% rs=im.checkTable("fruit");
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/form/shopimg?shopname=fruit&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input type="submit" value="Next">
</form>
</body>
</html>