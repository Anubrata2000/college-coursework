<%-- 
    Document   : newjsp3
    Created on : 12-Jan-2022, 6:00:44 pm
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
        <%@page import="java.util.Date"%>
        <DIV style = "background:#0099ff;color:white;padding:20px;">
            This is a header created fo you 
            <P>Current Date is:<%=new Date()%></P>
        </DIV>    
    </body>
</html>
