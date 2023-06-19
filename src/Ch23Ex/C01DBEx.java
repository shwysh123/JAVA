package Ch23Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBEx {

	public static void ConnectionDB() throws Exception {
		//����� ���
	}
	public static void disConnectDB() throws Exception {
		//���������� ���
	}
	
	public static boolean InsertDB(String product_id, String product_name, int amount) {

		// DB����
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/tmpdb";
		// JDBC��������
		Connection conn = null; // DB����� ��������
		PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
		ResultSet rs = null; // SQL���� ���(SELECT���)// �ϼ����Ѿ� �Ǵ� �ڵ�
		// tbl_products
		// prod_id varchar(45), prod_name varchar(45), amount int

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("����̹� �ε���..");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("����̹� ���ɵ�..");
			pstmt = conn.prepareStatement("insert into tbl_products values(?,?,?)");
			pstmt.setString(1, product_id);
			pstmt.setString(2, product_name);
			pstmt.setInt(3, amount);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("���强��");
			} else {
				System.out.println("�������");
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

		InsertDB("1", "��ǻ��", 5);
		InsertDB("2", "��Ʈ��", 7);

	}
}
