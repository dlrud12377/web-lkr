package ex1_list.ArrayList.product;

// 장바구니 프로그램 만들기

//Product클래스
public class Product {
	
//	필드
//	- 상품명(name) : String
//	- 가격(price) : int
//	- 수량(quantity) : int
	
	private String name;
	private int price;
	private int quantity;
	
//	객체를 만들 때 생성자를 통해서 필드를 초기화 한다.
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 생성자로 set하니 getter만
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
//	getTotalPrice()메서드
//	- 가격 x 수량을 반환
	
	public int getTotalPrice() {
		return price * quantity;
		}
		
//	toString() 오버라이딩하여 다음과 같이 출력되도록 하기
//	노트북(1000000원) x 1개	
	public String toString() {
		return name + "(" + this.getPrice() + "원) X " + this.getQuantity() + "개";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
