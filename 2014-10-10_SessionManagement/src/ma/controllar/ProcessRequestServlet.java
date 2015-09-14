package ma.controllar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ProcessRequestServlet
 */
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessRequestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uname=request.getParameter("uname");
		String pword=request.getParameter("pword");



		if(uname!=null && pword!=null){			
			if(uname.equalsIgnoreCase("MA") && pword.equalsIgnoreCase("pass#123")){
				HttpSession session=request.getSession(true); 
				session.setMaxInactiveInterval(8);
				session.setAttribute("uname",uname); 
				request.getRequestDispatcher("welcome.jsp").forward(request, response);			
			}
		}

	}
}
