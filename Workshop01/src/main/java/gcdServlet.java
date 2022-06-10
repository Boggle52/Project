

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gcdServlet
 */
@WebServlet("/gcdServlet")
public class gcdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gcdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String strval1 = request.getParameter("val1");
		String strval2 = request.getParameter("val2");
		int val1 = Integer.parseInt(strval1);
		int val2 = Integer.parseInt(strval2);
		while( val2 != 0) {
			int r = val1 % val2;
			val1 = val2;
			val2 = r;
		}
		int gcd = val1;
		int lcm = Integer.parseInt(strval1) * Integer.parseInt(strval2) / gcd;
		response.getWriter().append(gcd + " " + lcm);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
