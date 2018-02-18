

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class choice
 */
@WebServlet("/choice")
public class choice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public choice() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String res= response.toString();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatriceWebServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatriceWebServlet at " + res + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		  out.println(request.getAttribute("selected"));
		  if (request.getParameter("choix")==null) { request.setAttribute("choix", "00"); }
		  else { request.setAttribute("choix",request.getParameter("choix")); }
          //request.setAttribute("Resultat", res);
          
		  //request.setAttribute("numSujet","/WEB-INF/sujet/"+request.getParameter("choix")+".html");
		  
          RequestDispatcher aDispatcher = request.getRequestDispatcher("index.jsp");
            
          aDispatcher.forward(request, response);
	}

}
