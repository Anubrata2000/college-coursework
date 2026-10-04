package Cookiepackage;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
public class Cookie1 extends HttpServlet
{ 
    static int i=1;
    /**
     *
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse res) throws ServletException,IOException
    {
         res.setContentType("text/html");
       PrintWriter out=res.getWriter();
       Cookie c = new Cookie("visit",String.valueOf(i));
       res.addCookie(c);
       int j=Integer.parseInt(c.getValue());
       if(j==1)
       {
           out.println("You are a new user");
       }
       else
       {
           out.println("You have visited this website "+j+"times");
       }
       i++;
    }
}