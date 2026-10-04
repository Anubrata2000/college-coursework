/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.form;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
public class RegisterServlet extends HttpServlet
{ 

    /**
     *
     * @param req
     * @param res
     * @throws javax.servlet.ServletException
     * @throws HttpservletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("user_name");
        String email=req.getParameter("user_email");
        String password=req.getParameter("user_password");
        String gender=req.getParameter("user_gender");
        String city=req.getParameter("user_city");
        String chbox=req.getParameter("condition");
        if(chbox != null)
        {
        out.println("<h2>Name :"+ name +"</h2>");
        out.println("<h2>Email :"+ email +"</h2>");
        out.println("<h2>Password :"+ password +"</h2>");
        out.println("<h2>Gender :"+ gender +"</h2>");
        out.println("<h2>City :"+ city +"</h2>");
        }
        else
        {
            out.println("<h1> You have not agreed to our terms and conditions</h1>");
        }
    }
}
