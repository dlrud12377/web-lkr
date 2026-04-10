package ex1_list.ArrayList.product;

import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		String name;
		int price;
		int quantity;
		int choice;

		
		
		outer : while (true) {
            System.out.println("\n===== 장바구니 메뉴 =====");
            System.out.println("1. 상품 추가");
            System.out.println("2. 장바구니 보기");
            System.out.println("3. 총 금액 보기");
            System.out.println("4. 상품 삭제");
            System.out.println("5. 기존 상품 수량 수정");
            System.out.println("0. 종료");
            System.out.print("선택 >> ");

            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 제거
            
            switch(choice) {
	            case 1 :{ // 
	            	// 상품추가 누르면 일단 내용물 보여주기
	            	// 없으면 비어있습니다 출력 -> printcart에 다 구현되어있긴함
	            	
	            	// 장바구니가 비어있으면 비어있습니다 출력 후 자동으로 새상품추가 진행(기존 프로세스)
	            	
	            	// 아니면? -> 선택지 부여
	            	// 1 : 기존 상품 추가 -> 상품번호 입력하고 거기에 추가 구현하기
	            	// 2 : 새 상품 추가 -> 기존 프로세스 진행 - 진행 시 중복이면 중복이라고 알려주기(예외 발생 - 나중에)
	            	// 를 그냥 나눠서 구현하자.. 기존상품추가로
	            	
	            	System.out.println("< 현재 장바구니 > 목록");
	            	cart.printCart();
	            	System.out.println("겹치는 상품이 있다면 기존 상품 추가를 이용해주세요!");
	            	
            		System.out.print("상품명 : ");
            		name = sc.nextLine();
            		
            		System.out.print("가격 : ");
            		price = sc.nextInt();
            		
            		System.out.print("개수 : ");
            		quantity = sc.nextInt();
            		
            		cart.addProduct(name, price, quantity);
            		
            		break;
	            	}
	            
	            
	            case 2 : {
	            	cart.printCart();
	            	break;
	            	}
	            
	            case 3 : {
	            	cart.printTotalPrice();
	            	break;
	            	}
	            
	            case 4 : { // 현재 구현 : 제품 목록 자체를 삭제해버림
	            	// 원하는 구현 : 제품을 지우고 싶은 개수만큼 지움. 수량이 0이 되면 리스트에서 remove
	            	// -가 되면 리스트에서 remove + 메시치 출력( 기존 수량을 초과해서 삭제했습니다. 해당 품목을 완전히 삭제합니다.)
	            	// 이거도 case 5로 이관
	            	
	            	System.out.println("< 현재 장바구니 > 목록");
	            	cart.printCart();
	            	if (cart.getProducts().isEmpty()) {
	            		System.out.println("장바구니에 보유한 상품이 없어 처음으로 돌아갑니다.");
	            		break;
	            	}
	            	else {
		            	System.out.print("없애고 싶은 상품의 번호를 입력하세요 : ");
		            	int deleteProduct = sc.nextInt();
		            	cart.getProducts().remove(deleteProduct-1);
		            	System.out.println("상품이 정상적으로 삭제되었습니다!");
		            	break;
	            		}
	            	}
	            
	            case 5 : {
	            	cart.correctProducts();
	            	break;
	            }
	            
	            case 0 : {
	            	System.out.println("프로그램을 종료합니다.");
	            	break outer;
	            	}
	            
	            default : {
	            	System.out.println("올바르지 못한 수를 입력하셨습니다.");
	            	continue outer;
	            }
            
            }
		}	
	}
}
