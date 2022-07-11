<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
   double freeMem = Runtime.getRuntime().freeMemory();
   double totlMem = Runtime.getRuntime().totalMemory();
   double percent = freeMem/totlMem;
   if (percent < 0.5) { 
%>

<jsp:forward page="Example2.jsp"/>

<% } else { %>

<jsp:forward page="Example3.jsp"/>

<% } %>
    
