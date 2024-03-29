package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Access query parameters */
        String name = request.getParameter("name");

        /* Make it available to JSP */
        request.setAttribute("name", name);

        request.getRequestDispatcher("/WEB-INF/views/login.jsp")     /* starts from WEB-INF */
                .forward(request, response);
    }
}
