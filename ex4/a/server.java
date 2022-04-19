import java.io.*;
import java.util.*;
import javax.servlet.*;
public class server extends GenericServlet {
    public void service (ServletRequest req, ServletResponse res) throws ServletException.IOException {
        PrintWriter out res.getWrter();
        Enumeration en = req.getParameterNames();
        while(en.hasMoreElements()){
            String name_received = (String)en.nextElement();
            out.println(name_received + "=");
            String value_received = req.getParameter(name_received);
            out.println(value_received);
            out.println(" ");
        }
        out.close();
    }
}