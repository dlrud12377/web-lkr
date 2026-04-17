package Q2;

public class Main {
	public static void main(String[] args) {
		// Main 클래스에서 상품 1개를 생성한 뒤, 다음 명령을 수행
		Product cola = new Product("코카콜라", 8);
		
		// 재고 출력
		cola.printInfo();
		
		// 3개 판매
		cola.sell(3); // sell 뒤에 재고가 자동 표시되므로 printInfo 생략
		
		// 10개 판매 시도
		cola.sell(10); // 위와 동일. printInfo 생략
		
		
	}
}
