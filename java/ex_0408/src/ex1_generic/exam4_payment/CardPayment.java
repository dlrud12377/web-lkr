package ex1_generic.exam4_payment;

public class CardPayment implements Payment {
	
	@Override
	public void pay() {
		System.out.println("카드 결제를 진행합니다.");
	}
}
