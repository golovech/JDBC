package days03;

import java.sql.SQLException;

public class Ex07_03 {

	public static void main(String[] args) {
		// up_insertdept
		// 새로운 부서 추가하는 쿼리. 수정해보기.
		System.out.println("> 부서번호 부서명 지역명 입력 ?");

		int deptno = scanner.nextInt();
		String dname = scanner.next();
		String loc = scanner.next();
		String sql = " INSERT INTO dept ( deptno, dname, loc ) VALUES ( ?,?,? ) ";

		try {
			pstmt = conn.prepareStatement(sql); // SQL이 위에 있어야함.
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc); // ?에 해당하는 매개값을 줘야한다.
			int rowCount = pstmt.executeUpdate(); // 괄호안에 SQL 없어야함
			if (rowCount == 1) {
				System.out.println("부서 추가 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
