package ex5_polymorphism.exam02;

public class KakaoPayment extends Payment {
	
	// 싱글톤 디자인을 할거면 상속관계는..? -> private 생성자를 super로 받아올 수 있는가? no..
	
	// KakaoPayment pay overriding : 카카오페이로 xx원을 결제합니다.
	
	@Override
	public void pay(int amount) {
		if (balance < amount) {
			System.out.println("잔액 부족입니다.");
		}
		else {
			balance -= amount;
			System.out.println("카카오페이로 " + amount + "원을 결제했습니다.");
		}
	}
}
