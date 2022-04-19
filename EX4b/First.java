import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class First extends HttpServlet{
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        out.println("<form action = 'Second'>");
        out.println("<input type = 'hidden' name='user'value ='"+user+"'>");
        out.println("<input type = 'submit' value = 'submit'>");
        out.println("</form>");
    }
}