
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter out=res.getWriter();
       out.println("<H1>hello! this is the text from Generic Servlet</H1>");
       out.println(new Date().toString());
    }
    
    
}
