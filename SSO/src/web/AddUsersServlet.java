package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import DBAccess.Database;

/**
 * Servlet implementation class AddUsersServlet
 */
public class AddUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUsersServlet() {
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
		 
		 String name;
		 String userList[]=new String[100];
		 int i=0,flag=0;

			 Hashtable env = new Hashtable(11);

				env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
				env.put(Context.PROVIDER_URL, "ldap://10.80.10.17:389");
				env.put(Context.SECURITY_AUTHENTICATION, "simple");
				env.put(Context.SECURITY_PRINCIPAL,"CN=Smit Patel,OU=Contractors,OU=Accounts,OU=India,DC=asia,DC=manh,DC=com");
				env.put(Context.SECURITY_CREDENTIALS, "Manh12345");
				env.put(Context.REFERRAL, "follow");

				DirContext context;
				NamingEnumeration<SearchResult> enumResult = null;
			
			try {
				context = new InitialDirContext(env);
				
				SearchControls controls = new SearchControls();
				controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
				controls.setTimeLimit(30000);
				String[] attrIDs = { "cn"};
				controls.setReturningAttributes(attrIDs);
				enumResult = context.search("OU=Contractors,OU=Accounts,OU=India,DC=asia,DC=manh,DC=com","(objectClass=user)",controls);
				if (enumResult != null) {
					
					while (enumResult.hasMoreElements()) {
						SearchResult result = (SearchResult) enumResult.next();
						Attributes attrs = result.getAttributes();
						name=attrs.toString();
						int first_index=name.indexOf(':');
						int last_index=name.indexOf('}');
						name=name.substring(first_index+2,last_index);
						userList[i]=name;
						i++;
					}
					PreparedStatement ps=null;
					Context c=null;
					DataSource ds=null;
					Connection con=null;
					
					try {
						c = new InitialContext();
						ds =(DataSource)c.lookup("java:/Oracle11GDS");
						con = ds.getConnection();	
						con.setAutoCommit(false);
						for(int j=0;j<=i;j++){
							ps=con.prepareStatement("INSERT into user_ganesh(user_name) values (?)");
						    ps.setString(1, userList[j]);
						    flag=ps.executeUpdate();
							con.commit();
						}
					//	int i=ps.executeUpdate();
						
			 			
					} catch (NamingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally{
						try{
				 			if( ps!=null && con!=null && c!=null){
					
							ps.close();
							con.close();
							c.close();
						}
					}catch (NamingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					}catch(SQLException e){
							e.printStackTrace();
					}
					}
					enumResult.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
		}
			if(flag>0){
				response.getWriter().println("Users Added Successfully...");
				response.setContentType("text/html");
				request.getRequestDispatcher("SignedIn/include_usr.jsp").include(request, response);
			}else{
				request.getRequestDispatcher("ErrorFile.jsp").include(request, response);
			}
	}

}
