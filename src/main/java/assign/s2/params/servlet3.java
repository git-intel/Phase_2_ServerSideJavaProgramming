package assign.s2.params;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		out.print("<p>servlet3 Config params: </p>");
		out.print("d = " + config.getInitParameter("d"));
		ServletContext application = getServletContext();

		out.print("</br><p>servlet Context params: </p>");
		out.print("</br>a = " + application.getInitParameter("a"));
		out.print("</br>b = " + application.getInitParameter("b"));
		out.print("</br>c = " + application.getInitParameter("c"));

		int a = Integer.parseInt(application.getInitParameter("a"));

		int b = Integer.parseInt(application.getInitParameter("b"));

		int c = Integer.parseInt(application.getInitParameter("c"));

		int d = Integer.parseInt(config.getInitParameter("d"));

		int abd = a + b + d;
		out.print("</br>a+b+d = " + abd);



		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, a);
		map.put(2, b);
		map.put(3, c);
		map.put(4, d);

		System.out.println("Hashmap: size=" + map.size());
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		int temp1;
		int temp2;
		for (int i = 1; i <= map.size(); i++) {
			for (int j = i + 1; j <= map.size(); j++) {		
				temp1 = map.get(i);
				temp2 = map.get(j);
				if (temp1 > temp2) {			
					map.replace(i, temp2);
					map.replace(j, temp1);
				}
			}
		}
		System.out.println("Hashmap after sorting: size=" + map.size());
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		out.print("</br>Largest value of all params:" + map.get(map.size()));
	}

}
