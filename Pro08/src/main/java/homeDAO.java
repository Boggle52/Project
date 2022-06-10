import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class homeDAO {
	private Statement stmt;
	private Connection conn;
	
	public void addnewgoods(homeDTO hDto) {
		try {
			connDB();
			String query = "insert into exp_goods values(?,?,?)";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, hDto.getCountry());
			psmt.setString(2, hDto.getSeqno());
			psmt.setString(3, hDto.getGoodname());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletegoods(homeDTO hDto) {
		try {
			connDB();
			String query = "delete from exp_goods "
					+ "where country=? and seq=? and goods=?";
			PreparedStatement psmt = conn.prepareStatement(query);
			psmt.setString(1, hDto.getCountry());
			psmt.setString(2, hDto.getSeqno());
			psmt.setString(3, hDto.getGoodname());
			psmt.executeUpdate();
			psmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public ArrayList<homeDTO> listgoods(){
		ArrayList<homeDTO> list = new ArrayList<homeDTO>();
		try {
			connDB();
			String query = "Select * from exp_goods";
			this.stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String country = rs.getString("country");
				String seqno = rs.getString("seq");
				String goodname = rs.getString("goods");
				homeDTO hDto = new homeDTO();
				hDto.setCountry(country);
				hDto.setSeqno(seqno);
				hDto.setGoodname(goodname);
				list.add(hDto);
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
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="ora_user";
		String passcode="human123";
		try {
			Class.forName(driver);
			this.conn=DriverManager.getConnection(url,userid,passcode);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
