<%-- 
    Document   : newjsp
    Created on : 06-Feb-2022, 8:36:41 pm
    Author     : anubr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Count Number of visitors</title>
    </head>
    <body>
        <%
            Integer hitsCount = (Integer)application.getAttribute("noOfVisitor");
            if(hitsCount == null || hitsCount == 0)
            {
            out.println("<h1>Greetings User, Wlecome to my website</h1>");
            hitsCount = 1;
            }
            else
            {
            out.println("<h1>Welcome back to my website</h1>");
            hitsCount = hitsCount + 1; 
            }
            application.setAttribute("noOfVisitor", hitsCount);
        %>
        <h2>Total number of visits: <%= hitsCount%></h2>            
    </body>
</html>
