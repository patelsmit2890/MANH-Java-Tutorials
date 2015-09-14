package ma.browserheader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Session
 */

public class BrowserHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int ctr=1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrowserHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setHeader("Refresh", "1");
		response.getWriter().println(++ctr);
		
		
		//--printing header details --------------------------------
		Enumeration<String> headernames=request.getHeaderNames();
		String hname;
		PrintWriter out=response.getWriter();
		while(headernames.hasMoreElements()){
			hname=headernames.nextElement();
			String hvalue=request.getHeader(hname);
			out.println(hname+" : "+hvalue);			
		}	
		
		//-----------single header name like user-agent
		/*String browser=request.getHeader("User-agent");
		response.getWriter().println(browser);*/
		
		
		//response.getWriter().println(request.getRemoteAddr()+" : "+request.getRemoteUser());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
