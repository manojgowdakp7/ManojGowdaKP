import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {
    public FeedbackServlet()
    {
        System.out.println("creating FeedBack Servlet");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comments = request.getParameter("comments");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if (name != null && !name.isEmpty() && email != null && !email.isEmpty() && comments != null && !comments.isEmpty()) {
            out.println("<html><body>");
            out.println("<h2>Success in sending Data..</h2>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Error: Please fill all the fields correctly.</h2>");
            out.println("</body></html>");
        }
    }
}
