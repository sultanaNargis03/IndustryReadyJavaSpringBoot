

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet
{
	static
	{
		System.out.println("Servlet loading.........");
	}
    public MyFirstServlet() 
    {
       System.out.println("Servelt is instantiated...");
    }

	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Servlet initialization...");
	}

	
	public void destroy() 
	{
		System.out.println("Servlet deinstantiation");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Method to handle the request and response");
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>First App</title></head>");
		pw.println("<body bgcolor='green'><h2><marquee>Welcome to servlet world!</marquee></h2></body>");
		pw.println("</html/>");
		pw.close();
		
	}

}
