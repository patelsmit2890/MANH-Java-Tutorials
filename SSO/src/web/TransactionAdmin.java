package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TransactionAdmin
 */
public class TransactionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setHeader("Cache-Control", "no-cache");
		String res = request.getParameter("pg");
		

		if (res != null) {
			HttpSession session = request.getSession(false);
			if (session != null) {
				if (res.equalsIgnoreCase("incl_usr")) {
					request.getRequestDispatcher("SignedIn/include_usr.jsp").forward(
							request, response);
				} else if (res.equalsIgnoreCase("create_roles")) {
					request.getRequestDispatcher("SignedIn/create_role.jsp").forward(
							request, response);
				} else if (res.equalsIgnoreCase("assign_resrc")) {
					request.getRequestDispatcher("SignedIn/Assign_Resrc.jsp").forward(
							request, response);
				} else if (res.equalsIgnoreCase("assign_roles")) {
					request.getRequestDispatcher("SignedIn/Assign_Roles.jsp").forward(
							request, response);
				}else if (res.equalsIgnoreCase("logt")) {
					session.invalidate();
					request.getRequestDispatcher("Login.jsp").forward(request,
							response);
					
				}
			} else {
				request.getRequestDispatcher("session_expr.jsp").forward(request,
						response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
