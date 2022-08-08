<%@page import="java.sql.ResultSet" %>
<%@page import="com.example.demo.DBConnection"%>
<%@page import="java.io.OutputStream"%>
<style>
body{
background-image:url("https://i.pinimg.com/originals/51/61/dc/5161dca9f5c5b68e3623054548cf57fa.jpg ");
background-size:cover;
}
</style>
<jsp:include page="logout.jsp" />
<center><h1>vegetableshop</h1></center>
<hr>
<%! ResultSet rs ;
DBConnection im ;
    public void jspInit() {
        im = new DBConnection();
    }
%>
<form action="/form/shop" method="post">
<input type="hidden" name="shop" value="invoice">
<% rs=im.checkTable("vegetable");
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/form/shopimg?shopname=vegetable&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input type="submit" value="Next">
</form>
</body>
</html>