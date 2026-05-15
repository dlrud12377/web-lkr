package main;

import java.util.Scanner;

import dao.BookDAO;
import dao.CustomerDAO;
import dao.RentalDAO;

public class Main {
	public static void main(String[] args) {
		
		// customer insert
//		CustomerDAO cusDao = new CustomerDAO();
//		cusDao.insertCustomer();
		
		// book find
//		BookDAO bookDao = new BookDAO();
//		bookDao.findAllBooks();
		
		// rental book
//		RentalDAO rentalDao = new RentalDAO();
//		rentalDao.rentalBook(1, 2);
		
		
		// menu를 만들어 프로그램이 자동 실행될 수 있도록 진행
		
	      Scanner sc = new Scanner(System.in);
	      
	      CustomerDAO customerDAO = new CustomerDAO();
	      BookDAO bookDAO = new BookDAO();
	      RentalDAO rentalDAO = new RentalDAO();
	      int customerInput;
	      
	      outer : while(true) {
	         System.out.println("도서 대여 관리 프로그램");
	         System.out.println("1. 고객 등록");
	         System.out.println("2. 도서 등록");
	         System.out.println("3. 도서 전체 조회");
	         System.out.println("4. 도서 대여");
	         System.out.println("5. 전체 대여 목록 조회");
	         System.out.println("6. 고객별 대여 목록 조회");
	         System.out.println("7. 재고 부족 도서 조회");
	         System.out.println("0. 종료");
	         
	         System.out.print("메뉴 선택 : ");
	         int menu = sc.nextInt();
	         
	         switch(menu) {
	         
	         case 1:
	        	customerDAO.insertCustomer();
	        	break;
	        	
	         case 2:
	            bookDAO.insertBook();
	            break;
	            
	         case 3:
	            bookDAO.findAllBooks();
	            break;
	            
	         case 4:
	        	bookDAO.findAllBooks(); // 등록된 책 확인용
	        	System.out.print("대여자의 개인식별번호를 입력해주세요 : ");
	        	customerInput = sc.nextInt();
	        	
	        	System.out.println("원하는 도서의 번호를 입력해주세요");
	        	int BookId = sc.nextInt();
	        	
	            rentalDAO.rentalBook(customerInput, BookId);
	            break;
	            
	         case 5:
	            rentalDAO.findRentalList();
	            break;
	            
	         case 6: // 고객별 대여 목록 조회 -> 고객 id를 입력받아서 고객명, 제목, 빌린날짜 순으로 출력하기
		        System.out.print("대여자의 개인식별번호를 입력해주세요 : ");
		        customerInput = sc.nextInt();
		        
		        rentalDAO.findRentalListByCustomer(customerInput);
		        
		        break;
	         case 7:
	        	 // 재고부족 도서 조회
	        	 // 재고가 2권 이하인 도서를 조회
	        	 bookDAO.findLowStockBooks();
	         case 0:
	        	System.out.println("프로그램을 종료합니다.");
	            return;
	         default :
	        	 System.out.println("잘못된 메뉴 입력입니다.");
	        	 continue outer;
	         }
	      }
	      
	      //박민수 010-3333-3333 회원 추가하기
	      
	      //customerDAO.insertCustomer(new CustomerDTO("박민수","010-3333-3333"));
	      //bookDAO.insertBook(new BookDTO("이것이 자바다","신용권",6));
	      //bookDAO.findAllBooks();
	      //rentalDAO.rentalBook(1, 1);
//	      rentalDAO.findRentalList();
	}
}
