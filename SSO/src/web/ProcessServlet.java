package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import DBAccess.Database;
import DBAccess.UserInfo;

/**
 * Servlet implementation class ProcessServlet
 */
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Boolean reback=false;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
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
		response.setContentType("text/html");
		String fname = request.getParameter("fname");
		String pword = request.getParameter("pword");
		
		UserInfo uiObj=new UserInfo();
		uiObj.setName(fname);
		request.setAttribute("bean", uiObj);
		
		HttpSession session=request.getSession(true);
		session.setMaxInactiveInterval(60*60);
		
		response.setContentType("text/html");
		
		
		Hashtable env = new Hashtable(11);

		boolean b = false;

		/*env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://10.80.10.17:389");
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, "CN=Smit Patel,OU=Contractors,OU=Accounts,OU=India,DC=asia,DC=manh,DC=com");
		env.put(Context.SECURITY_CREDENTIALS, pword);*/
		
			try {
			// Create initial context
			DirContext ctx = new InitialDirContext(env);
			if(fname.length()==0 || pword.length()==0){
				b=true;
			}else{
			// Close the context when we're done
			b = true;}
			ctx.close();

		} catch (NamingException e) {
			e.printStackTrace();
			b = false;
		}finally{
			if(b){
				request.getRequestDispatcher("SignedIn/welcomeAdmin.jsp").forward(request, response);
			} else if(db.getRole(fname)){
				request.getRequestDispatcher("SignedIn/welcomeUser.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Sorry!!! Your USER Id and Password does not match");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
				}	
		}	
	}

}
