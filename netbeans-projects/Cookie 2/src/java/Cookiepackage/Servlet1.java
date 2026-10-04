package Cookiepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String nm = req.getParameter("name");
        Cookie c = new Cookie("user_name", nm);
        PrintWriter out = resp.getWriter();
        resp.addCookie(c);
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello " + nm + ". Welcome to my website</h1>");
        out.println("<h1><a href=\"servlet2\">Click here to go to Servlet 2</a></h1>");
        out.println("</body>");
        out.println("</html>");
    }
}