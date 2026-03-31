package ex5_polymorphism.exam02;

public class CardPayment extends Payment {
	// CardPayment pay overriding : 카드로 xx원을 결제합니다.
	
	@Override
	public void pay(int amount) {
		if (balance < amount) {
			System.out.println("잔액 부족입니다.");
		}
		else {
			balance -= amount;
			System.out.println("카드로 " + amount + "원을 결제했습니다.");
		}
	}
}
