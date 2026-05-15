package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dbutil.DBUtil;
import dto.BookDTO;

public class BookDAO {
	
	private String url = "jdbc:mysql://localhost:3306/rental_db";
	private String user = "root";
	private String password = "12341234";
	
	// 책 정보를 담을 리스트
	List<BookDTO> bookList = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);

	
	// 조회(select)
	public void findAllBooks() {
		
		bookList.clear(); // 조회 전에 리스트를 삭제하여 초기화
		
		// sql문
		String sql = "SELECT * FROM book";
		
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
				int book_id = rs.getInt("book_id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				int stock = rs.getInt("stock");
				
				// 뽑은 정보 list에 추가
				bookList.add(new BookDTO(book_id, title, author, stock));
			}
			
			// 정상적으로 작동되었는지 확인
			System.out.println("불러오기 완료");
			
			bookList.forEach(x -> 
			{
				System.out.println("번호 : " + x.getBook_id());
				System.out.println("제목 : " + x.getTitle());
				System.out.println("저자 : " + x.getAuthor());
				System.out.println("재고 : " + x.getStock());
				System.out.println("-----------------------");
			});
			
		} catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
	}
	
	
	// 추가(insert)
	public void insertBook() {
		
		// sql문
		String sql = "INSERT INTO book(title, author, stock) "
				+ "values(?, ?, ?)";
		
		// try-catch(with connection resources / preparedStatement resources)
		try (
				Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				)
		{
			// resource 연결 성공
			System.out.println("연결 성공");			
			
			System.out.println("데이터 추가 시작");
			
			System.out.println("책 제목 : ");
			pstmt.setString(1, sc.nextLine());
			
			
			System.out.println("저자 : ");
			pstmt.setString(2, sc.nextLine());
			
			System.out.println("재고 : ");
			pstmt.setInt(3, sc.nextInt());
			
			int result = pstmt.executeUpdate();
			
			// 진행 다되면 추가완료 메시지
			if (result > 0) {
				System.out.println("책 추가 완료");
			}

			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
	}
	
	
	// 수정(update)
	
	// 삭제(delete)
	
	
	
	// 재고부족 도서 조회(2권 이하)
	public void findLowStockBooks() {
		
		bookList.clear(); // 조회 전에 리스트를 삭제하여 초기화
		
		// sql문
		String sql = "SELECT * FROM book where stock <= 2";
		
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
				int book_id = rs.getInt("book_id");
				String title = rs.getString("title");
				String author = rs.getString("author");
				int stock = rs.getInt("stock");
				
				// 뽑은 정보 list에 추가
				bookList.add(new BookDTO(book_id, title, author, stock));
			}
			
			// 정상적으로 작동되었는지 확인
			System.out.println("불러오기 완료");
			
			if (bookList.isEmpty()) {
				System.out.println("재고가 2권 이하인 도서가 없습니다.");
			}
			else {
				bookList.forEach(x -> 
				{
					System.out.println("도서번호 : " + x.getBook_id());
					System.out.println("제목 : " + x.getTitle());
					System.out.println("저자 : " + x.getAuthor());
					System.out.println("재고 : " + x.getStock());
					System.out.println("-----------------------");
				});
			}
			
		} catch (Exception e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		}
	}
}
