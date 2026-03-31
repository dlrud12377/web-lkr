package ex5_polymorphism.exam02;

public class Main {
	public static void main(String[] args) {
		// Main에서 결제 방식을 변경하면서 서로 다른 결과가 나오도록 작성하기
		Order order = new Order();
		
		// 페이 객체 생성
		order.payment.balance = 580000;

		// 카카오페이로 변경
		order.payment = new KakaoPayment();
		order.totalPay(900000);
		order.totalPay(240000);
		
		// 카드로 변경
		order.payment = new CardPayment();
		order.totalPay(900000);
		order.totalPay(240000);
	}
}
