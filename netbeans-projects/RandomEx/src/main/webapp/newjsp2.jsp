<%-- 
    Document   : newjsp2
    Created on : 12-Jan-2022, 5:38:23 pm
    Author     : anubr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="java.util.Random"%>
        <%
        Random r= new Random();
        int n=r.nextInt(10);
        out.println(n);
        %>
    </body>
</html>
