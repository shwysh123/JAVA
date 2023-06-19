package Ch23Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBEx {

	public static void ConnectionDB() throws Exception {
		//연결시 사용
	}
	public static void disConnectDB() throws Exception {
		//연결해제시 사용
	}
	
	public static boolean InsertDB(String product_id, String product_name, int amount) {

		// DB정보
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/tmpdb";
		// JDBC참조변수
		Connection conn = null; // DB연결용 참조변수
		PreparedStatement pstmt = null; // SQL쿼리 전송용 참조변수
		ResultSet rs = null; // SQL쿼리 결과(SELECT결과)// 완성시켜야 되는 코드
		// tbl_products
		// prod_id varchar(45), prod_name varchar(45), amount int

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩중..");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("드라이버 연걸됨..");
			pstmt = conn.prepareStatement("insert into tbl_products values(?,?,?)");
			pstmt.setString(1, product_id);
			pstmt.setString(2, product_name);
			pstmt.setInt(3, amount);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("저장성공");
			} else {
				System.out.println("저장실패");
			}

		} catch (Exception e) {

		} finally {
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

		return false;
	}

	public static void main(String[] args) {

		InsertDB("1", "컴퓨터", 5);
		InsertDB("2", "노트북", 7);

	}
}
