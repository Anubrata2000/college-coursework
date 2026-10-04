<%-- 
    Document   : newjsp1
    Created on : 12-Jan-2022, 5:23:58 pm
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
        <%!
            int a=10;
            int b=20;
            String s="Hello";
            public int sum()
            {
                return(a+b);
            }
            public String rev()
           {
                StringBuffer br= new StringBuffer(s);
                return br.reverse().toString();
           }
        %>
        <%
             out.println("Sum is");
             out.println(sum());
             out.println("<br>");
             out.println(" The reverse string is ");
             out.println(rev());
        %>
    </body>
</html>
