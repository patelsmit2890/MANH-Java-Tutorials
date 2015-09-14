package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBAccess.Database;

/**
 * Servlet implementation class AssignRolesServlet
 */
public class AssignRolesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignRolesServlet() {
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
		Database db=new Database();
		int userID=Integer.parseInt(request.getParameter("User"));
		int flag=0;
		String checkedRoles[]=request.getParameterValues("checkedRoles");
		
		if(checkedRoles!=null && userID>0){
					flag=1;
					db.updateUserRole(userID,checkedRoles);
					response.getWriter().println("Roles assigned to the User Successfully");
					response.setContentType("text/html");
					request.getRequestDispatcher("SignedIn/Assign_Roles.jsp").include(request, response);
	} else {
			response.getWriter().println("Please Select User and Select the Roles for User");
			response.setContentType("text/html");
			request.getRequestDispatcher("SignedIn/Assign_Roles.jsp").include(request, response);
		}
	}
}
