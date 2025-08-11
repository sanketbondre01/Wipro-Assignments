import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class user extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("age", age);
        session.setAttribute("password", password);
        session.setAttribute("gender", gender);
        session.setAttribute("address", address);

        response.sendRedirect("welcome");
    }
}