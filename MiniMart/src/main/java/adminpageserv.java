

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class adminpageserv
 */
@WebServlet("/adminpageserv")
public class adminpageserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminpageserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		if(request.getSession().getAttribute("AdminName")==null) {
			response.sendRedirect("adminlogin.html");
		}
		try(PrintWriter writer=response.getWriter()){

			writer.println("<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n");
			writer.println("<html><head><title>" + "Hello" +"</title>");
			writer.println("<body style="+"margin:30px;"+"><h2>Admin Page</h2>");
			writer.println("<div style="+""+"><a href="+"DisplayAll"+" style="+"text-decoration:none; padding:15px;"+">Items</a>|<a href="+"manageitemserv"+" style="+"text-decoration:none; padding:15px;"+">Manage</a></div>");
			writer.println("<form action="+"Logout"+"><input type="+"submit"+" value="+"Logout"+" style="+"margin:30px;"+"/></form>");
			writer.println("</tbody></table></body></html>");
		};
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
