

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addItem
 */
@WebServlet("/addItem")
public class addItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int i=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()){
			
			ItemOperation io=new ItemOperation();
			
			itemDetail item=null;
			String itemCode;
			String action=request.getParameter("action");
			if(action==null || action.equals("")) {
				request.setAttribute("ITEM", new itemDetail("", "", "", "", ""));
				request.setAttribute("ACTION", "SaveOrUpdate");
				request.getRequestDispatcher("DisplayAll").forward(request, response);
				return;
			}
			switch(action) {
			case "SaveOrUpdate":
				itemCode=request.getParameter("itemCode");
				String iName=request.getParameter("iName");
				String noItem=request.getParameter("iNo");
				String price=request.getParameter("price");
				String Catagories=request.getParameter("Categories");
				
				item =new itemDetail(iName,noItem,itemCode,price,Catagories);
				io.save(item);
				request.getRequestDispatcher("manageitemserv").forward(request, response);
				System.out.println("size"+io.getAll().size());
				break;
			case "List":
				request.getRequestDispatcher("DisplayAll").forward(request, response);
				break;
			case "AddOrEdit":
				itemCode=request.getParameter("itemCode");
				item=io.findItem(itemCode);
				
				if(item==null) {
					request.setAttribute("ITEM", new itemDetail("", "", "", "", ""));
				}
				request.setAttribute("ACTION", "SaveOrUpdate");
				request.getRequestDispatcher("manageitemserv").forward(request, response);
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

}
