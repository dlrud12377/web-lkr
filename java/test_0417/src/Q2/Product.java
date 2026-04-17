package Q2;

public class Product {
	
	// field
	private String name;
	private int stock;
	
	// 생성자(초기화 이걸로)
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	// 재고를 감소시키는 sell(int amount) 메서드
	public void sell(int amount) {
		if (stock >= amount) {
			stock -= amount;
			System.out.println("판매 완료"); // 정상 판매 시 메시지
		}
		else {
			System.out.println("재고가 부족합니다."); // 재고보다 판매수량이 많으면 메시지
		}
		System.out.println("남은 재고 : " + stock); // sell 후 재고 확인용
	}
	
	// 현재 상품 정보를 출력하는 printInfo() 메서드를 작성
	public void printInfo() {
		System.out.println(String.format("상품명 : %s\n"
				+ "현재 재고 : %d개", name, stock)); // 상품명 : XX (줄바꿈) 현재 재고 : X개
	}
	
}
