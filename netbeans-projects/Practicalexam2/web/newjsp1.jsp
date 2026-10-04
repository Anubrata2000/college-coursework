<%-- 
    Document   : newjsp1
    Created on : 06-Feb-2022, 8:54:28 pm
    Author     : anubr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auto Refresh</title>
    </head>
    <body>
        <%@page import="java.util.Calendar"%>
        <%@page import="java.util.GregorianCalendar"%>
        <h1>Page will refresh every 5 seconds</h1>
        <%
            response.setIntHeader("Refresh",5);
            Calendar calender = new GregorianCalendar();
            String am_pm;
            
            int hour = calender.get(Calendar.HOUR);
            int minute = calender.get(Calendar.MINUTE);
            int second = calender.get(Calendar.SECOND);
            
            if(calender.get(Calendar.AM_PM) == 0)
               am_pm = "AM";
             else
               am_pm = "PM";
            String CT = hour+":"+ minute +":"+ second +" "+am_pm;
            out.println("Current time: " + CT );
        %>
    </body>
</html>
