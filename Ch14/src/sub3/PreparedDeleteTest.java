package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 조영흥
 * 내용 : PreparedStatment 실습하기
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {

		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "everybody24";
		String pass = "abc1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
						
			// 3단계 - SQL 실행 객체 생성 및 맵핑 (동적쿼리)
			String sql ="DELETE FROM `User1` WHERE `uid`=?";		//Query Parameter
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "B101");									//Mapping(사상), Binding
			
			
						
			// 4단계 - SQL 실행
			// INSERT, UPDATE, DELETE - executeUpdate, SELECT - executeQuery
			psmt.executeUpdate();
			
			// 5단계 - 결과 처리(SELECT 경우)
			
			// 6단계 - 접속 종료
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
			
		System.out.println("DELETE 완료...");
	}
}
