import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(loadOnStartup = 1,urlPatterns = "/order")
public class MenuServlet extends HttpServlet {


    public MenuServlet() {
        System.out.println("Menu Servlet Created");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String itemName= req.getParameter("itemName");
      String quantity=req.getParameter("quantity");
      String price=req.getParameter("price");
      boolean valid=true;
      resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>");

      if (quantity !=null){
           int convertedQuantity=Integer.valueOf(quantity);
           if(convertedQuantity>0){
               System.out.println("Quantity is valid ");
           }else {
               valid=false;
               writer.println("<span style=\"color:red\">");
               System.out.println("Quantity is invalid");
               writer.println("Quantity is invalid");
               writer.println("</span>");
           }

      if(price!=null)  {
          double convertedPrice=Double.valueOf(price);
          if(convertedPrice>29){
              System.out.println("price is valid");
          }else {
              valid=false;
              writer.println("<span style=\"color:red\">");
              System.out.println("Price is invalid");
              writer.println("Price is invalid");
              writer.println("</span>");
          }
      }if (valid) {
              writer.println("<h1>Order is Success:"+itemName+"</h1>" );
          }
          System.out.println("Order is Success "+itemName);
          writer.println("</body>");
          writer.println("</html>");

      }

    }
}
