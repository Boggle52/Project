

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empServlet
 */
@WebServlet("/emp")
public class empServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public empServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		empDAO dao = new empDAO();
		ArrayList<empDTO> list = dao.listMember();
		
		out.print("<html><head><title>Result from t_member</title></head><body>");
		out.print("<table border=1><tr><th>사번</th><th>이름</th><th>매니저명</th><th>부서명</th></tr>");
		
		for(int i = 0; i < list.size(); i++) {
			empDTO dto = list.get(i);
			int employee_id = dto.getEmployee_id();
			String emp_name = dto.getEmp_name();
			String m_name = dto.getManager_name();
			String d_name = dto.getDepartment_name();
			out.print("<tr><td>"+employee_id+"</td><td>"+emp_name+"</td><td>"
				+m_name+"</td><td>"+d_name+"</td>");
		}
		out.print("</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
