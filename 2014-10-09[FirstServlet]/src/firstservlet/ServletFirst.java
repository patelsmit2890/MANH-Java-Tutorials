package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFirst
 */
public class ServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletFirst() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");		
		PrintWriter out=response.getWriter();
		out.println("<html><body>");  
		out.println("<b>hello simple servlet</b>"); 
		out.println(request.getParameter("uname"));    
		out.println("</body></html>"); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String[] sport=request.getParameterValues("sports");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h1>Welcome to Sajjannagar</h1>");
		out.println("<b>Name: </b>"+request.getParameter("uname"));
		out.println("<br/><b>Email: </b>"+request.getParameter("email"));    
		out.println("<br/><b>City: </b>"+request.getParameter("city"));
		out.println("<ul>");		
		for(String s:sport)
		{
			out.println("<li><b>"+s+"</b></li>");
		}
		out.println("</ul>");
		out.println("<br/><b>Comment : </b>"+request.getParameter("comment"));
		out.println("<br/><b>Gender :</b> "+request.getParameter("sex"));
		out.println("</body></html>"); 
		
		
	}

}
