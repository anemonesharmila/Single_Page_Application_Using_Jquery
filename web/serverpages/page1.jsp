<%-- 
    Document   : page1
    Created on : May 8, 2016, 3:27:06 PM
    Author     : sharmila
--%>

<%@page import="java.util.Calendar"%>
<%
   
        out.println("<center>Welcome!! This is student info page </center>");
    
    
    Calendar calendar=Calendar.getInstance();
    out.println(calendar.getTime());
%>
