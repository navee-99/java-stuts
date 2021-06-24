package assesmentOne;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import assesmentOne.AuthorDAO;
import assesmentOne.Book;
/**
 * Servlet implementation class Bookservelt1
 */
@WebServlet({ "/Book.do" })
public class Bookservelt1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookservelt1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("booklist", AuthorDAO.getbooklist());
		request.setAttribute("authorlist", AuthorDAO.getAuthorlist());
		RequestDispatcher rd=request.getRequestDispatcher("personFile.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int sno=Integer.parseInt(request.getParameter(" sno"));
		String bookname=request.getParameter("bookname ");
		int Price=Integer.parseInt(request.getParameter("Price"));
		int Pages=Integer.parseInt(request.getParameter(" Pages"));
		int AuthorID= Integer.parseInt(request.getParameter(" AuthorID"));
		  Book p=new Book(sno,bookname,Price,Pages,AuthorID);
		  if(AuthorDAO.insert(p))
			  response.sendRedirect(" Book.do");
		  else
			  response.getWriter().println(" something went wrong");
	}

}
