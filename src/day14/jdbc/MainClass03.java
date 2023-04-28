package day14.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement ������� ���� PreparedStatement �������!!!!!!!!!
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		try {
			// 1. ����̹� Ŭ���� ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			StringBuffer sql = new StringBuffer();
			
			// 3. ���� �ۼ�
			sql.append("SELECT id, name, salary ");
			sql.append("FROM sales_reps ");
			sql.append("WHERE id = ? ");
			sql.append("AND salary >= ?");
			
			// 4. PrepareStatement ��ü ����
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "100");
			
			// 5. ���� ����
			rs = pstmt.executeQuery();
			
			// 6. ������ ����ϱ�
			while(rs.next()) { 
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				
				System.out.println("id: " + id);
				System.out.println("name: " + name);
				System.out.println("salary: " + salary);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		
	}

}