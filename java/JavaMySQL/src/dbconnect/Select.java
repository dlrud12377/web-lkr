package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
	public static void main(String[] args) {
		
		// db접속 경로
		// 형식
		// jdbc:mysql://서버주소:포트번호/데이터베이스명
		String url = "jdbc:mysql://localhost:3306/java_db";
		String user = "root";
		String password = "12341234";
		
		// sql문을 전달할 string
		// select, insert, update, delete
		// 실행할 sql을 작성
		// ?는 값이 들어갈 자리(placeholder)
		String sql = "SELECT * FROM member";
		
		// finally 단순화를 위해 try-with-resources 진행
		
		try (
				// MySQL 서버와 실제 연결을 생성한다.
				Connection conn = DriverManager.getConnection(url, user, password);
				
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				) 
		{	

			// 연결 성공시
			System.out.println("MySQL 연결 성공");
			
			// ? 부분에 들어갈 데이터 채우기
			
			// SQL 실행
			// executeUpdate() : insert, update, delete시에 사용 / 영향을 받은 행 수만큼 반환
			// executeQuery() : select시 사용			
			ResultSet rs = pstmt.executeQuery(); // sql 실행 결과를 안에 담음
			
			// rs.next() : 다음 행으로 이동하는 메서드
			while(rs.next()) { // iterator 기반, 한줄씩 읽는다고 생각하면 됨(writer/reader 생각)
				int id = rs.getInt("member_id");
				String name = rs.getString("name");
				String email = rs.getString("name");
				int age = rs.getInt("age");
				
				System.out.printf(" id : %d name : %s email : %s age : %d", id, name, email, age);
				System.out.println();
			}
			
			System.out.println("Result process success");
			
		}catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
		
	}
}
