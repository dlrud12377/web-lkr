package ex5_polymorphism.exam02;

public class Payment {
	
	// 잔고
	public static int balance;
	
	// 메서드
	// pay(int amount) : xx원을 결제합니다	
	public void pay(int amount) {
		if (balance < amount) {
			System.out.println("잔액 부족입니다.");
		}
		else {
			balance -= amount;
			System.out.println(amount + "원을 결제했습니다.");
		}
	}
}
