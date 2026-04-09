package ex1_list.ArrayList.product;

import java.util.Scanner;

public class Main {
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
            System.out.println("0. 종료");
            System.out.print("선택 >> ");

            choice = sc.nextInt();
            sc.nextLine(); // 버퍼 제거
            
            switch(choice) {
	            case 1 :{
	            	
            		System.out.print("상품명 : ");
            		name = sc.nextLine();
            		
            		System.out.print("가격 : ");
            		price = sc.nextInt();
            		
            		System.out.print("개수 : ");
            		quantity = sc.nextInt();
            		
            		cart.addProduct(name, price, quantity);
            		
            		System.out.println("정상적으로 추가되었습니다!");
            		
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
	            
	            case 4 : {
	            	cart.printCart();
	            	System.out.print("없애고 싶은 상품의 번호를 입력하세요 : ");
	            	int deleteProduct = sc.nextInt();
	            	cart.getProducts().remove(deleteProduct-1);
	            	System.out.println("상품이 정상적으로 삭제되었습니다!");
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
