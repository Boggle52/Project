

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstServlet1
 */
@WebServlet("/firstServlet1")
public class firstServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		
//		String firstValue = request.getParameter("first");
//		String secondValue = request.getParameter("second");
//		int result = Integer.parseInt(firstValue)+Integer.parseInt(secondValue);
//		response.getWriter().append("result="+result);
//		
		String strdan = request.getParameter("dan");
		if(strdan==null) return;
		
		int dan = Integer.parseInt(strdan);
		for(int i = 1; i < 10; i++) {
			response.getWriter().append(dan+"x"+i+"="+dan*i+"\n");
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
