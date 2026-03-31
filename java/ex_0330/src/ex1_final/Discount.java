package ex1_final;

public class Discount {
	
	final static double HIGH = 0.2;
	final static double MID = 0.1;
	final static double LOW = 0.05;
	// 금액에 따라서 할인률을 결정하는 discountRate 메서드 만들기
	// 금액이 10만원 이상 : 0.2
	// 금액이 5만원 이상 : 0.1
	// 5만원 아래 : 0.05
	
	public static double discountRate(int money) {
		if (money >= 100000) {
			return HIGH;
		}
		else if (money >= 50000) {
			return MID;
		}
		else if (money >= 0){
			return LOW;
		}
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return -1.0;
		}
	}
	
	// 최종 금액을 계산하는 calculatePrice 메서드 작성
	// - 할인률 적용된 금액 반환
	
	public static int calculatePrice(int money) {
		return (int)(money * (1 - discountRate(money)));
	}
}
