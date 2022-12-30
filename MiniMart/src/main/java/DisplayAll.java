

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayAll
 */
@WebServlet("/DisplayAll")
public class DisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAll() {
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
			writer.println("<html><head><title>" + "Hello"+ "</title>");
			writer.println("<style>table, th, td { border: 1px solid black;}</style></head>");
			writer.println("<body>" );
			writer.println("<h3 align = \"center\">" + "Store Items" +"</h3>");
			writer.println("<a href="+"addItem?action=AddOrEdit"+">Add Iem</a>");
			writer.println("<table><thead>");
			writer.println("<tr><th>Item Name</th><th>Item No</th><th>Price</th><th>Item code</th><th>Categories</th>");
			ItemOperation iop=new ItemOperation();
			List<itemDetail> ls=iop.getAll();
			for(int i=0;i<ls.size();i++) {
				itemDetail ide=ls.get(i);
				writer.println("<tr><td>"+ ide.getiName()+"</td><td>"+ ide.iNo+"</td><td>"+ ide.getItemCode()+"</td><td>"+ ide.getPrice()+"</td><td><a href="+"addItem?action=AddOrEdit&itemCode="+ide.getItemCode()+">"+"Edit"+"</a></td><td><a href="+"addItem?action=Delete&itemCode="+ide.getItemCode()+">"+"Delete"+"</a></td></tr>");
			}
			writer.println("</tbody></table></body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub



	}
}

