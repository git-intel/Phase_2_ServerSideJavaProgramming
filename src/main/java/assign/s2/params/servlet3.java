package assign.s2.params;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet3
 */
@WebServlet(description = "httpservlet3", urlPatterns = { "/servlet3" })
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<p>servlet3 Config params: </p>");
		out.print("d = " + config.getInitParameter("d"));
		ServletContext application = getServletContext();
		out.print("</br><p>servlet Context params: </p>");
		out.print("</br>a = " + application.getInitParameter("a"));
		out.print("</br>b = " + application.getInitParameter("b"));
		out.print("</br>c = " + application.getInitParameter("c"));
	}

}
