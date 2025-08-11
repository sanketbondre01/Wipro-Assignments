import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class welcome extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

            out.println("<h2>Welcome!</h2>");
            out.println("Name: " + session.getAttribute("name") + "<br>");
            out.println("Age: " + session.getAttribute("age") + "<br>");
            out.println("Password: " + session.getAttribute("password") + "<br>");
            out.println("Gender: " + session.getAttribute("gender") + "<br>");
            out.println("Address: " + session.getAttribute("address") + "<br>");
    }
}