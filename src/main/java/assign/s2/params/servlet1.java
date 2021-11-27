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
 * Servlet implementation class servlet1
 */
@WebServlet(description = "httpservlet1", urlPatterns = { "/servlet1" })
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<h5>servlet1 Config params:</h5>");
		out.print("</br>d = " + config.getInitParameter("d"));
		ServletContext application = getServletContext();
		out.print("</br><h5>servlet Context params: </h5>");
		out.print("</br>a = " + application.getInitParameter("a"));
		out.print("</br>b = " + application.getInitParameter("b"));
		out.print("</br>c = " + application.getInitParameter("c"));

		int sum = Integer.parseInt(application.getInitParameter("a")) 
				+ Integer.parseInt(application.getInitParameter("b")) 
				+ Integer.parseInt(application.getInitParameter("c")) 
				+ Integer.parseInt(config.getInitParameter("d"));
		out.print("</br>a+b+c+d = " + sum);

	}
}
