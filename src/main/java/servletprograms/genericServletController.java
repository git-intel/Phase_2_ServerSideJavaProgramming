package servletprograms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class genericServletController
 */
@WebServlet(description = "Sample generic servlet", urlPatterns = { "/genericServletController" })
public class genericServletController extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public genericServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see GenericServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>");
//
//		String name = request.getParameter("name");
//		String address = request.getParameter("address");
//
//		out.println("Name=" + name + "<br>Address=" + address);
//		out.println("</body></html>");
//	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String name = request.getParameter("name");
		String address = request.getParameter("address");

		out.println("Name=" + name + "<br>Address=" + address);
		out.println("</body></html>");
	}

}
