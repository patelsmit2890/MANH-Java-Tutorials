package ma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class EmployeeDetails
 */
public class EmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeDetails() {
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


		try {
			Context c=new InitialContext();

			DataSource ds=(DataSource)c.lookup("java:/Oracle11gDS");
			con=ds.getConnection();

			String empno=request.getParameter("empno");
			String fname=request.getParameter("fname");

			//String str="Select * from employees where EMPNO="+empno+"and FIRST_NAME='"+fname+"'";
			String str="Select * from employees where EMPNO="+empno;
			ps=con.prepareStatement(str);
			rs=ps.executeQuery();
			if (!rs.next()) 
			{ 
				//System.out.println("No records found");
				ps= con.prepareStatement("insert into employees (EMPNO,FIRST_NAME,LAST_NAME,ADDRESS,GRADE,SALARY,SECTIONNO,DATE_JOINED) values (?,?,?,?,?,?,?,?)");
				ps.setInt(1, (Integer.parseInt(empno)));
				ps.setString(2,fname);
				ps.setString(3, "Shety");
				ps.setString(4, "RSS");
				ps.setInt(5, 4);
				ps.setInt(6, 40000);
				ps.setInt(7, 1);
				Date date= new Date(2014, 10, 8);
				ps.setDate(8,date);
				ps.executeUpdate();
				response.getWriter().println("Inserted Succefully");
			}
			else {
				do{
					int checkUser=rs.getInt(1);		    
					if(checkUser==Integer.parseInt(empno)){
						response.getWriter().println("Employee no already exist..!! Please enter another no.");
						//request.getRequestDispatcher("index.jsp").forward(request, response);	
						break;
					}
				}
				while (rs.next());
				
			}



		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null && ps!=null && con!=null){					
					ps.close();
					con.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
