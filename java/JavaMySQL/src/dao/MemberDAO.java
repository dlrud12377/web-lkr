package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;
import dto.MemberDTO;

// DAO(Data Access Object)
// 실제로 DB에 접근하는 클래스
public class MemberDAO {
	
	private String url = "jdbc:mysql://localhost:3306/java_db";
	private String user = "root";
	private String password = "12341234";
	
	List<MemberDTO> list = new ArrayList<>();
	
	// 조회
	public void findAll() {
		// member테이블에서 데이터를 조회한 후 memberDTO 객체에 담은 후
		// 콘솔에 출력하는 코드 작성하기
		
		// sql문 string으로 만들기
		String sql = "SELECT * FROM member";
		
		// try-with-resources
		
		// finally 단순화를 위해 try-with-resources 진행
		
				try (
						// MySQL 서버와 실제 연결을 생성한다.
						Connection conn = DBUtil.getConnection();
						
						// SQL을 안전하고 효율적으로 실행하기 위한 객체
						PreparedStatement pstmt = conn.prepareStatement(sql);
						
						ResultSet rs = pstmt.executeQuery(); // sql 실행 결과를 안에 담음
												
						) 
				{	

					// 연결 성공시
					System.out.println("MySQL 연결 성공");	

					
					// rs.next() : 다음 행으로 이동하는 메서드
					while(rs.next()) { // iterator 기반, 한줄씩 읽는다고 생각하면 됨(writer/reader 생각)
						int id = rs.getInt("member_id");
						String name = rs.getString("name");
						String email = rs.getString("email");
						int age = rs.getInt("age");
						
						System.out.printf(" id : %d name : %s email : %s age : %d", id, name, email, age);
						System.out.println();
						
						list.add(new MemberDTO(id, name, email, age));
						
						System.out.println("데이터 입력 성공");
						
					}
					
					list.forEach(x -> {
						System.out.println(x.getMember_id());
						System.out.println(x.getName());
						System.out.println(x.getEmail());
						System.out.println(x.getAge());
						System.out.println("--------------------");
					});
					
					System.out.println("Result : All process success");
					 
				}catch (Exception e) {
					System.out.println("연결 실패");
					e.printStackTrace();
				}
	}
	
	// 추가
	public void insertMember(MemberDTO dto) {
		// 매개변수를 통해 넘겨받은 dto를 member테이블에 추가하기
		
		String sql = "INSERT INTO member(name, email, age)"
				+ " values(?,?,?)";
		
		try (
				// MySQL 서버와 실제 연결을 생성한다.
				Connection conn = DBUtil.getConnection();
				
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				){
			
			System.out.println("데이터 추가 시작");
			
			// ? 위치 맞춰서 진행
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setInt(3, dto.getAge());
			
			
			int result = pstmt.executeUpdate(); // sql 실행 결과를 안에 담음
			
			System.out.println(result + "행 추가 완료");
			
		} catch (Exception e) {
			System.out.println("프로세스 실패");
			e.printStackTrace();
		}
	}
	
	// 수정
	// 특정 사람의 나이를 수정하는 메서드 작성하기
	public void updateMemberAge(int member_id, int newAge) {
		String sql = "UPDATE member"
				+ " SET AGE = ?"
				+ " WHERE member_id = ?";
		
		try (
				
				// MySQL 서버와 실제 연결을 생성한다.
				Connection conn = DBUtil.getConnection();
				
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				)
		{
			System.out.println("변경 시작");
			pstmt.setInt(1, newAge);
			pstmt.setInt(2, member_id);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "행 수정 완료");
			
			
		} catch (Exception e) {
			System.out.println("프로세스 실패");
			e.printStackTrace();
		}
	}
	
	// 삭제
	// 특정 사람을 삭제하는 메서드 작성하기
	public void deleteMember(int member_id) {
		String sql = "DELETE FROM member "
				+ "WHERE member_id = ?";
		
		try (
				
				// MySQL 서버와 실제 연결을 생성한다.
				Connection conn = DBUtil.getConnection();
				
				// SQL을 안전하고 효율적으로 실행하기 위한 객체
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				)
		{
			System.out.println("삭제 시작");
			pstmt.setInt(1, member_id);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "행 삭제 완료");
			
			
		} catch (Exception e) {
			System.out.println("프로세스 실패");
			e.printStackTrace();
		}
	}
	
}
