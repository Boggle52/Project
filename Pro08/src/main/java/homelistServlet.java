

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class homelistServlet
 */
@WebServlet("/homelist")
public class homelistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homelistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		homeDAO dao = new homeDAO();
		ArrayList<homeDTO> list = dao.listgoods();
		JSONArray ja = new JSONArray();
		for(int i=0; i<list.size();i++) {
			homeDTO hdto = new homeDTO();
			hdto = list.get(i);
			JSONObject jo = new JSONObject();
			jo.put("country", hdto.getCountry());
			jo.put("seqno", hdto.getSeqno());
			jo.put("goodname", hdto.getGoodname());
			ja.add(jo);
		}
		response.getWriter().print(ja.toJSONString());
		

//		String str = "";
//		ArrayList<homeDTO> list = dao.listgoods();
//		for(int i = 0; i < list.size(); i++) {
//			homeDTO data = new homeDTO();
//			data = list.get(i);
//			str += "<tr><td>"+data.getCountry()+"</td><td>"+data.getSeqno()+"</td><td>"
//					+data.getGoodname()
//					+"</td><td><input type=button id='btndelete' value='»èÁ¦'></td></tr>";
//		}
//		response.getWriter().print(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
