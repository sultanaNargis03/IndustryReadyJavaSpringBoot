

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/reg")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Register() 
    {
       System.out.println("Register obj is created");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("uname");
		String city=request.getParameter("ucity");
		String number=request.getParameter("number");
		
		PrintWriter writer=response.getWriter();
		writer.println("<html><head><title>Registration App</title></head>");
		writer.println("<body bgcolor='green'><h2><marquee>Welcome to servlet world!</marquee></h2></body>");
		writer.println("<table>");
		writer.println("<tr><th>NAME</th><th>CITY</th><th>NUMBER</th></tr>");
		writer.println("<tr><td>"+name+"</td><td>"+city+"</td><td>"+number+"</td></tr>");
		writer.println("</table>");
		writer.println("</html/>");
	}

}
