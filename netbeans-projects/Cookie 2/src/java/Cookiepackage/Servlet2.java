package Cookiepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Cookie[] coo = req.getCookies();
        boolean f = false;
        String nm = "";
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        if (coo == null) {
            out.println("You are a new user ...please come through home page");
        } else {
            for (Cookie c : coo) {
                if (c.getName().equals("user_name")) {
                    f = true;
                    nm = c.getValue();
                }
            }
        }
        if (f) {
            out.println("Hello " + nm + " welcome back again");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
