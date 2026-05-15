package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dbutil.DBUtil;
import dto.BookDTO;
import dto.CustomerDTO;

public class CustomerDAO {
	private String url = "jdbc:mysql://localhost:3306/rental_db";
	private String user = "root";
	private String password = "12341234";
	
	// 고객 정보를 담을 리스트
	List<CustomerDTO> customerList = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	

	
	// 조회(select) - 아직 구현x
	public void findAllCustomers() {
		
		customerList.clear(); // 조회 전에 리스트를 삭제하여 초기화
		
		// sql문
		String sql = "SELECT * FROM customer";
		
		// connection을 위한 DBUtil source, pstmt 불러오기(try-with-resources)
		
		try (
				Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			
				)
		{
			// resource가 다 사용되고 진입 -> 연결 성공
			System.out.println("연결 성공");
			
			// rs는 iterator처럼 꺼내 쓸 수 있음
			while(rs.next()) {
				int customer_id = rs.getInt("customer_id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");

				
				// 뽑은 정보 list에 추가
				customerList.add(new CustomerDTO(customer_id, name, phone));
				
			}
			
			// 정상적으로 작동되었는지 확인
			System.out.println("불러오기 완료");
			
			customerList.forEach(x -> 
			{
				System.out.println("회원고유번호 : " + x.getCustomer_id());
				System.out.println("제목 : " + x.getName());
				System.out.println("저자 : " + x.getPhone());
				
				System.out.println("-----------------------");
			});
			
		} catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
	}
	
	// 추가(insert)
	public void insertCustomer() {
		
		// sql문
		String sql = "INSERT INTO customer(name, phone) "
				+ "values(?, ?)";
		
		// try-catch(with connection resources / preparedStatement resources)
		try (
				Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)
		{
			// resource 연결 성공
			System.out.println("연결 성공");			
			
			System.out.println("데이터 추가 시작");
			
			System.out.println("이름 : ");
			pstmt.setString(1, sc.next());
			
			sc.nextLine();
			
			System.out.println("전화번호(xxx-xxxx-xxxx) : ");
			pstmt.setString(2, sc.nextLine());
			
			int result = pstmt.executeUpdate();
			
			// 진행 다되면 추가완료 메시지
			if (result > 0) {
				System.out.println("고객 추가 완료");
			}

			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
	}
	
	// 수정(update)
	
	// 삭제(delete)
}
