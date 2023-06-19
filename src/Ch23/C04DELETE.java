package Ch23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C04DELETE {
	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/tmpdb";
	
		//JDBC��������
		Connection conn = null; 	//DB����� ��������
		PreparedStatement pstmt = null; // SQL���� ���ۿ� ��������
		ResultSet rs = null;		// SQL���� ���(SELECT���) ���ſ� ��������
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");		//����̺� ����
			System.out.println("Driver Loading Success..");
			conn=DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected..");
			pstmt = conn.prepareStatement("delete from tbl_students where name=?");
			pstmt.setString(1, "����");
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("INSERT����!");
			}
			else {
					System.out.println("INSERT����!");
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			pstmt.close();} catch(Exception e){}
			try {
				
			conn.close();}catch(Exception e) {}
		}
	}
}
