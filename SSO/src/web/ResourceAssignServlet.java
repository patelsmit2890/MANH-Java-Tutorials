package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBAccess.Database;

/**
 * Servlet implementation class ResourceAssignServlet
 */
public class ResourceAssignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResourceAssignServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doAssign(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doAssign(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
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
		String rname = request.getParameter("role_name");
		int rid=0,flag=0;
		String checkedResources[]=request.getParameterValues("checkedResources");
		
		if(rname!=null && checkedResources!=null && rname.length()!=0){
			flag=1;
			if(db.setRole(rname)){
				rid=db.getRoleId(rname);
				if(rid!=-1){
					db.updatePermission(rid,checkedResources);
					response.getWriter().println("Resources assigned to the Role Successfully");
					response.setContentType("text/html");
					request.getRequestDispatcher("SignedIn/create_role.jsp").include(request, response);
				} else {
				response.getWriter().println("Role to whom Resource is being Assigned Does not Exists");
				response.setContentType("text/html");
				request.getRequestDispatcher("SignedIn/create_role.jsp").include(request, response);
			}
			} else {
				response.getWriter().println("Role already Exists... Please Enter New Role");
				response.setContentType("text/html");
				request.getRequestDispatcher("SignedIn/create_role.jsp").include(request, response);
			}
		}
		if(flag==0){
			response.getWriter().println("Please Enter User Role and Select the Resources for Role");
			response.setContentType("text/html");
			request.getRequestDispatcher("SignedIn/create_role.jsp").include(request, response);
		}
	}
}
