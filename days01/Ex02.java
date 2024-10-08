package days01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Ex02 {

	public static void main(String[] args) {
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // jdbc:oracle:thin : 4번 드라이브 연결
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(className);
			conn = DriverManager.getConnection(url, user, password);
			// 3. crud 작업
			String sql = "SELECT *"
					+ "FROM dept";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			int deptno;
			String dname, loc;
			
			while (rs.next()) {
				deptno = rs.getInt("deptno");
				dname = rs.getString("dname");
				loc = rs.getString("loc");
				System.out.printf("%d\t%s\t%s\n", deptno, dname, loc);
			}
			
			System.out.println(conn); // oracle.jdbc.driver.T4CConnection@3b2da18f : 테스트 성공

			if (conn != null) {
				conn.close();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
//		OracleDriver

	}

}
