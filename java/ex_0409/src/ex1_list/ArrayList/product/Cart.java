package ex1_list.ArrayList.product;

import java.util.ArrayList;
import java.util.List;

/* Cart 클래스


6. 특정 상품 삭제
public void removeProduct(String name)
"키보드" 상품을 장바구니에서 제거하시오.
키보드 삭제 후 장바구니:
노트북(1000000원) x 1개
마우스(20000원) x 3개 */


public class Cart {
	
	
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
				
				product.setQuantity(product.getQuantity()+quantity);
				// product.quantity += quantity; -> no setter
				return;
			
			}

		}

		this.products.add(new Product(name, price, quantity));
	}
	
	
//	3. 장바구니 전체 출력
//	public void printCart()
//	장바구니 목록 출력하기
//	노트북(1000000원) x 1개
//	마우스(20000원) x 2개
//	키보드(50000원) x 1개
	
	public void printCart() {
		
		int i = 1;
		for (Product product : products) {
			System.out.print(i + " : ");
			System.out.println(product);
			i++;
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
//	"마우스" 상품의 수량을 +1 증가시키시오.
//
//	마우스 수량 증가 후: 마우스(20000원) x 3개
	
	
	
	
	
}
