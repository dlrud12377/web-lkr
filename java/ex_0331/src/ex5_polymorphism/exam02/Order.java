package ex5_polymorphism.exam02;

public class Order {
	
	// 필드에 payment 타입 클래스 넣기
	Payment payment;
	
	public void totalPay(int amount) {
		payment.pay(amount);
	}
	
	
}
