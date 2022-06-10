

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String firstValue = request.getParameter("first");
//		String secondValue = request.getParameter("second");
//		int result = Integer.parseInt(firstValue)+Integer.parseInt(secondValue);
//		response.getWriter().append("result="+result);
//		
//		String strdan = request.getParameter("dan");
//		if(strdan==null) return;
//		
//		int dan = Integer.parseInt(strdan);
//		for(int i = 1; i < 10; i++) {
//			response.getWriter().append(dan+"x"+i+"="+dan*i+"\n");
		
		String op = request.getParameter("op");
		String strval1 = request.getParameter("val1");
		String strval2 = request.getParameter("val2");
		
		if(op == null || strval1 == null || strval2 == null) {
			return;
		}
		
		int val1 = Integer.parseInt(strval1);
		int val2 = Integer.parseInt(strval2);
		
		switch(op) {
			case "plus" :
				response.getWriter().print(val1 + val2);
				break;
			case "minus" :
				response.getWriter().print(val1 - val2);
				break;
			case "multi" :
				response.getWriter().print(val1 * val2);
				break;
			case "div" :
				response.getWriter().print(val1 / val2);
				break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
