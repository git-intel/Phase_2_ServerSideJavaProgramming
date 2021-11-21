package httpsessiontracking;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class MyServlet1
 */
@WebServlet(description = "Http Session Servlet 1", urlPatterns = { "/MyServlet1" })
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet1() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();

			String name = request.getParameter("userName");
			String password = request.getParameter("userPassword");

			pwriter.print("Hello " + name);
			pwriter.print("Your Password is: " + password);

			HttpSession session = request.getSession();

			session.setAttribute("uname", name);
			session.setAttribute("upass", password);
			session.setMaxInactiveInterval(2000);

			pwriter.print("<a href='welcome'>view details</a>");
			pwriter.close();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}

}
