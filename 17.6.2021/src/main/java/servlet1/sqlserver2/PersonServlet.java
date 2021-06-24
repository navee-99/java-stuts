package sqlserver2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import sqlserver2.Person;
//import sqlserver2.PersonDAO;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/person.do")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*request.setAttribute("peoplelist", PersonDAO.getPeople());
		RequestDispatcher rd=request.getRequestDispatcher("people.jsp");
		rd.forward(request, response);*/
		 HttpSession session=request.getSession();
		    ServletContext application=getServletContext();
		    
		    Integer scount=(Integer)session.getAttribute("count");
		    Integer acount=(Integer)application.getAttribute("count");
		    
		    if(scount==null)
		    	session.setAttribute("count", 1);
		    else
		    	session.setAttribute("count",scount+1);
		    
		    if(acount==null)
		    	application.setAttribute("count", 1);
		    else
		    	application.setAttribute("count",acount+1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	   int sno =	Integer.parseInt(request.getParameter("sno"));
	   String name = request.getParameter("name");
	   String city = request.getParameter("city");
	   
	   Person p=new Person(sno,name,city);
	   if(PersonDAO.insert(p))
		   response.sendRedirect("person.do");
	   else
		   response.getWriter().print("Something went wrong ");
	}

}