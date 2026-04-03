package ex2_object.Q1_Q2;

public class Product {
	
	// 필드 : name, price, stock
	private String name;
	private int price;
	private int stock;
	
	// 생성자 통해 필드 초기화
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// 상품정보를 한 줄로 보기 좋게 출력할 수 있도록 구현하기 - toString 오버라이드로 구현
	
	@Override
	public String toString() {
		return "상품명 : " + name + ", 가격 : " + price + ", 재고 : " + stock;
	}

}
