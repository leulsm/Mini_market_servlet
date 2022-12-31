

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String adminame=request.getParameter("admin_name");
	String security_key=request.getParameter("security_key");
	String password=request.getParameter("password");
	
	
	String passwordcheck="1234";
	String securitykey="0000";
	String name="admin";
	
	
	if(name.equalsIgnoreCase(adminame) && passwordcheck.equalsIgnoreCase(password) && securitykey.equalsIgnoreCase(security_key)) {
		
		HttpSession session=request.getSession();
		session.setAttribute("AdminName", adminame);
		 RequestDispatcher rd=request.getRequestDispatcher("adminpageserv");  
         rd.include(request,response);  
		
	}else {
		response.getWriter().append("<p style='color: red; font-size: larger;'>You are not an authorised user! Please check with administrator!</p>");                
		
	}
	
	
	}

}
