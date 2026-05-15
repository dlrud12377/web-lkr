package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	// db 접속정보 작성
	// 주소, 아이디, 비밀번호
	private static final String url = "jdbc:mysql://localhost:3306/rental_db";
	private static final String user = "root";
	private static final String password = "12341234";
	
//	public static Connection getConnection() {
//		
//		// try-catch문으로 작성(try-with-resources는 사용하지 않음. 바로 닫혀버리면 안되기 때문)
//		try { // Connection 객체 반환, 연결 실패 시 null 반환
//			Connection conn = DriverManager.getConnection(url, user, password);
//			
//			System.out.println("연결 성공");
//			return conn;
//			
//		} 
//		catch (Exception e) { // Connection 객체 반환, 연결 실패 시 null 반환
//			System.out.println("연결 실패");
//			e.printStackTrace();
//			return null;
//		}
//		
//		// 위의 try-catch 대신 throws 이용하여 예외를 다른곳으로 던져 한번에 처리할 수 있음
//		
//	}
	
	public static Connection getConnection() throws Exception { // 예외 던지기

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공");
			return conn;
		
	}
}
