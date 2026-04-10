package ex1_list.ArrayList.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Cart 클래스


6. 특정 상품 삭제
public void removeProduct(String name)
"키보드" 상품을 장바구니에서 제거하시오.
키보드 삭제 후 장바구니:
노트북(1000000원) x 1개
마우스(20000원) x 3개 */


public class Cart {
	
	public static Scanner sc = new Scanner(System.in);
	
//	장바구니 기능
//	1. 장바구니 생성
//	Product타입의 리스트
	
	private List<Product> products = new ArrayList<>();
	
//	2. 상품 추가
//	(같은 상품이면 수량 증가)
//	public void addProduct(String name, int price, int quantity)
//	다음의 상품을 장바구니에 추가하기
//	노트북, 1000000원, 1개
//	마우스, 20000원, 2개
//	키보드, 50000원, 1개
	
	public void addProduct(String name, int price, int quantity) {

		for (Product product : products) {
			if (product.getName().equals(name)) {
				
				System.out.println("중복된 이름이 존재합니다. 상품 추가를 원하시면 수량 조정을 진행해주세요");
				
//				product.setQuantity(product.getQuantity()+quantity); -> 상품 수량 조정으로 이관
				// product.quantity += quantity; -> no setter
				return;
			}

		}

		this.products.add(new Product(name, price, quantity));
		System.out.println("정상적으로 추가되었습니다!");
		
	}
	
	
//	3. 장바구니 전체 출력
//	public void printCart()
//	장바구니 목록 출력하기
//	노트북(1000000원) x 1개
//	마우스(20000원) x 2개
//	키보드(50000원) x 1개
	
	public void printCart() {
		
		if (products.isEmpty()) {
			System.out.println(" 장바구니가 비어있습니다. ");
			System.out.println("===============");
			
		}
		else {
			int i = 1;
			for (Product product : products) {
				System.out.print(i + " : ");
				System.out.println(product);
				i++;
			}
			System.out.println("===============");
		}

	}
	
//	4. 총 결제 금액 계산
//	public void printTotalPrice()
//	모든 상품의 총 가격을 계산하여 출력하시오.
//	총 결제 금액: 1090000원
	
	public void printTotalPrice() {
		int sum = 0;
		for (Product product : products) {
			sum += product.getTotalPrice();
		}
		
		System.out.println("총 결제 금액 : " + sum + "원");
	}
	
	
	public List<Product> getProducts() {
		return products;
	}
	
//	5. 특정 상품 수량 증가

	public void correctProducts() {
		if (products.isEmpty()) {
			System.out.println("장바구니가 비어있는 관계로 메인 메뉴로 돌아갑니다.");
			return;
		}
		
		else {
        	System.out.println("< 현재 장바구니 > 목록");
        	printCart();
        	System.out.print("개수를 수정할 제품의 번호를 선택해주세요 : ");
        	int choice = sc.nextInt();
        	System.out.println("몇 개로 수정할지 수량을 입력해주세요 : ");
        	int newQuantity = sc.nextInt();
        	
        	products.get(choice-1).setQuantity(newQuantity);
        	
        	System.out.println("개수가 수정되었습니다!");
		}
	}
	
// 6. 상품 삭제
	
	
	
	
	
}
