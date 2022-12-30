

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class manageitemserv
 */
@WebServlet("/manageitemserv")
public class manageitemserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manageitemserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try(PrintWriter writer=response.getWriter()){

			writer.println("<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n");
			writer.println("<html><head><title>" + "Hello"+ "</title></head>");
			writer.println("<body style="+"margin:30px;"+">");
			writer.println("<h3>ADD ITEM</h3><hr>\r\n"
					+ "<br/><br/>");
			writer.println("<div>"
					+ "<form action="+"addItem" +">"
					+ "<input type="+"hidden"+" name="+"action"+" value="+"SaveOrUpdate"+">"
					+ "ItemCode<input type="+"text"+" name="+"itemCode"+"><br/><hr width="+"270px"+" align="+"left"+">"
					+ "Item name: <input type="+"text"+" name="+"iName"+"><br/><hr width="+"270px"+" align="+"left"+">"
					+ "	Number of Item: <input type=\"text\" name=\"iNo\"><br/><hr width=\"270px\" align=\"left\">\r\n"
					+ "	Price:<input type=\"text\" name=\"price\"><br/><hr width=\"270px\" align=\"left\">\r\n"
					+ "Categories:<br/>"
					+ "<select name=\"Categories\">"
					+ "<option value=\"Food\">Food</option><option value=\"Re_usable\">Re-usable</option><option value=\"Materials\">Materials</option>"
					+ "</select><br/><hr width=\"270px\" align=\"left\">"
					+ "<input type=\"submit\" value=\"ADD\" style=\"padding:10px; border:1px solid green; color:green;\">\r\n"
					+ "<a href="+"DisplayAll"+" style="+"text-decoration:none; padding:10px; border:1px solid blue; color:blue;"+">Display item</a> <a href="+"Logout"+" style="+"text-decoration:none; padding:10px; border:1px solid red; color:red;"+">log-out</a>"
					+ "</form>"
					+ "</div>");
			writer.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
