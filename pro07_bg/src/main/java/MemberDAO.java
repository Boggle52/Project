import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	private Statement stmt;
	private Connection conn;
	
	public void addnewMember(MemberVO mvo) {
		System.out.println("addnewMember begin");
		try {
			System.out.println("mvo id="+mvo.getId()+"password="+mvo.getPwd());
			connDB();
			String query="insert into t_member values(?,?,?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, mvo.getId());
			psmt.setString(2, mvo.getPwd());
			psmt.setString(3, mvo.getName());
			psmt.setString(4, mvo.getMobile());
			psmt.setString(5, mvo.getJoinDate());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberVO> listMember(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			connDB();
			String query = "select * from t_member";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String mobile = rs.getString("mobile");
				String joindate = rs.getString("joinDate");
				MemberVO mvo = new MemberVO();
				mvo.setId(id);
				mvo.setPwd(pwd);
				mvo.setName(name);
				mvo.setMobile(mobile);
				mvo.setJoinDate(joindate);
				list.add(mvo);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private void connDB() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="ora_user";
		String passcode = "human123";
		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, userid, passcode);
			stmt = conn.createStatement();
//			if(conn==null) {
//				System.out.println("데이터베이스 접속 실패");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
