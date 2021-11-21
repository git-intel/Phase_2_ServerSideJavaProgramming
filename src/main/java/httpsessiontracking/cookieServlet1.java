package httpsessiontracking;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.http.Cookie;
/**
 * Servlet implementation class cookieServlet1
 */
@WebServlet(description = "cookie example", urlPatterns = { "/cookieServlet1" })
public class cookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cookieServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		try {
			response.setContentType("text/html");
			java.io.PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.print("Welcome " + n);

			Cookie ck = new Cookie("uname", n); // creating cookie object
			response.addCookie(ck); // adding cookie in the response

			// creating submit button
			out.print("<form action='serv2'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
