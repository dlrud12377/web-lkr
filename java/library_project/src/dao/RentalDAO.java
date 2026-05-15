package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dbutil.DBUtil;

public class RentalDAO {
	
	// 고객이 도서를 대여하면 다음의 작업을 처리한다.
	// 도서 재고를 조회
	// rental 테이블에 대여 정보를 추가
	// book 테이블의 재고를 1 감소
	// rentalBook(int customer_id, int book_id)
	// 원하는 결과가 안나오면 롤백을 해야함
	// conn.setAutoCommit(false);
	// conn.rollback(); -> 원하는 상황이 아닐때
	// conn.commit();
	
	// 연결을 위한 기본 field
	private String url = "jdbc:mysql://localhost:3306/rental_db";
	private String user = "root";
	private String password = "12341234";
	
	public void rentalBook(int customer_id, int book_id) {
		String selectSQL = "SELECT * FROM BOOK"
				+ " WHERE book_id = ?;";
		String insertSQL = "INSERT INTO rental(customer_id, book_id)"
				+ " values(?, ?)";
		String updateSQL = "UPDATE book set stock = stock - 1"
				+ " WHERE book_id = ?;";
		
		try (Connection conn = DBUtil.getConnection()){
			
			// autocommit 끄기
			conn.setAutoCommit(false);
			
			
			// select
			try(PreparedStatement selectPstmt = conn.prepareStatement(selectSQL);
					) {
				
				selectPstmt.setInt(1, book_id);
				ResultSet rs = selectPstmt.executeQuery();
				
				System.out.println("정보 불러오기 완료");
				
				// 재고가 부족하거나 책이 존재하지 않으면 throw exception 후 catch에서 롤백
				if(!rs.next()) {
					throw new Exception("책이 존재하지 않습니다.");
				}
				
				int stock = rs.getInt("stock");
				
				if (stock <= 0) {
					throw new Exception("책 재고가 부족합니다.");
				}
				
				System.out.println("책 / 재고 확인 완료");
				
				
				
			} catch (Exception e) { // select 예외
				e.printStackTrace();
				conn.rollback();
				return;
			}
			
			// insert
			try(PreparedStatement insertPstmt = conn.prepareStatement(insertSQL)) {
				
				insertPstmt.setInt(1, customer_id);
				insertPstmt.setInt(2, book_id);
				
				int result = insertPstmt.executeUpdate();
				
				if (result > 0) {
					System.out.println("rental 정보 추가 완료");
				}
				else {
					throw new Exception("rental 오류 발생");
				}
				
			} catch (Exception e) {
				conn.rollback();
				e.printStackTrace();
				return;
			}
			
			// update
			try(PreparedStatement updatePstmt = conn.prepareStatement(updateSQL)) {
				
				updatePstmt.setInt(1, book_id);
				
				int result = updatePstmt.executeUpdate();
				
				if (result > 0) {
					System.out.println("재고 update 완료");
				}
				else {
					throw new Exception("update 오류 발생");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				conn.rollback();
				return;
			}
			
			System.out.println("모든 과정 정상 진행 완료");
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findRentalList() {
	      String sql = """ 
	              select
	                 r.rental_id,
	                 c.name,
	                 b.title,
	                 r.rental_date
	              from rental r
	              INNER JOIN customer c
	              ON r.customer_id = c.customer_id
	              INNER JOIN book b
	              ON r.book_id = b.book_id
	              ORDER BY r.rental_id
	              """;
	      
	      try (
	    		  Connection conn = DBUtil.getConnection();
	    		  PreparedStatement pstmt = conn.prepareStatement(sql);
	    		  ResultSet rs = pstmt.executeQuery();
	    		  ) {
			
	          while(rs.next()) {
	              System.out.println("대여번호 : " + rs.getInt("rental_id"));
	              System.out.println("고객명 : " +  rs.getString("name"));
	              System.out.println("도서명 : " + rs.getString("title"));
	              System.out.println("대여일 : " + rs.getString("rental_date"));
	              System.out.println("-----------------");
	           }
	    	  
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void findRentalListByCustomer(int customer_id) {
	      String sql = """ 
	              select
	                 r.rental_id,
	                 c.name,
	                 b.title,
	                 r.rental_date
	              from rental r
	              INNER JOIN customer c
	              ON r.customer_id = c.customer_id
	              INNER JOIN book b
	              ON r.book_id = b.book_id
	              WHERE c.customer_id = ?
	              ORDER BY r.rental_id;
	              """;
	      
	      try (
	    		  Connection conn = DBUtil.getConnection();
	    		  PreparedStatement pstmt = conn.prepareStatement(sql);
	    		  ) {
	    	  
	    	  // query문 내의 ? 처리를 위해 resource 하나 밖으로 빼기
	    	  pstmt.setInt(1, customer_id);
	    	  ResultSet rs = pstmt.executeQuery();
	    	  
//	    	  if (!rs.next()) {
//	    		  System.out.println("대여 내력이 없습니다.");
//	    		  return;
//	    	  } - 문제점 : count가 하나 빠짐 -> booleanflag 하나 만들가ㅣ
	    	  
	    	  boolean found = false;
	    	  
	          while(rs.next()) {
	        	  found = true;
	              System.out.println("대여번호 : " + rs.getInt("rental_id"));
	              System.out.println("고객명 : " +  rs.getString("name"));
	              System.out.println("도서명 : " + rs.getString("title"));
	              System.out.println("대여일 : " + rs.getString("rental_date"));
	              System.out.println("-----------------");
	           }
	          
	          if(!found) {
	        	  System.out.println("대여 내력이 없습니다.");
	          }
	    	  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
