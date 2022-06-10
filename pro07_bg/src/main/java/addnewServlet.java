

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addnewServlet
 */
@WebServlet("/addnew")
public class addnewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addnewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String joindate = request.getParameter("joindate");
		System.out.println("servlet id="+id+",pw="+pw+",name="+name+",mobile"+mobile+",joindate="+joindate);
		MemberVO mvo = new MemberVO();
		mvo.setId(id);
		mvo.setPwd(pw);
		mvo.setName(name);
		mvo.setMobile(mobile);
		mvo.setJoinDate(joindate);
		MemberDAO dao = new MemberDAO();
		System.out.println(dao);
		dao.addnewMember(mvo);
		System.out.println("addnew");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
