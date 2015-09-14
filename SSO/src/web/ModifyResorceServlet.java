package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBAccess.Database;

/**
 * Servlet implementation class ModifyResorceServlet
 */
public class ModifyResorceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyResorceServlet() {
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
		int roleID=Integer.parseInt(request.getParameter("Role"));
		int flag=0;
		String checkedRsrcs[]=request.getParameterValues("checkResources");
		
		if(checkedRsrcs!=null && roleID>0){
					flag=1;
					db.modifyPermission(roleID,checkedRsrcs);
					response.getWriter().println("Resources modified Successfully");
					response.setContentType("text/html");
					request.getRequestDispatcher("SignedIn/Assign_Resrc.jsp").include(request, response);
	} else {
			response.getWriter().println("Please Select Role and Select the Resources for Role");
			response.setContentType("text/html");
			request.getRequestDispatcher("SignedIn/Assign_Resrc.jsp").include(request, response);
		}
	}

}
