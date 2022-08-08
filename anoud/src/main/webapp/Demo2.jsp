<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8" 
    buffer="14kb"
    autoFlush="false"
    errorPage="errorPage.jsp"%>
    <hr>
    <%@include file="Header.jsp" %>
    <hr>
    <jsp:include page="Header.jsp">
    <jsp:param name="cname" value="Anoud Technologies.."/>
    </jsp:include>
    <hr> 
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
காலை வணக்கம்
<%
for(int i=0;i<1000;i++){
	out.println("Hai");
	
	
}
%>
</body>
</html>
<hr>
<%@include file="Footer.jsp" %><hr>

</body>
</html>