package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	// db접속 정보 필드로 작성
	// 주소, 아이디, 비밀번호 등
	private static final String url = "jdbc:mysql://localhost:3306/java_db";
	private static final String user = "root";
	private static final String password = "12341234";
	
	// 데이터베이스 연결 객체를 반환하는 메서드
	public static Connection getConnection() {
		
		try { // 닫을 필요 없게 try-with-resources 사용 - 는 안됨.. -> 닫지 않은 상태로 반환해야 뒤의 try-with-resources에서 사용이 가능함
			// 연결에 성공하면 connection 객체를 반환
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("연결 성공");
			return conn;
		} 
		catch (Exception e) {
			// 실패하면 null을 반환하기
			System.out.println("연결 실패");
			e.printStackTrace();
			return null;
		}
	}
}
