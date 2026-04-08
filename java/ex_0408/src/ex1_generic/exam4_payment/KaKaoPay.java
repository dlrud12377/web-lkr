package ex1_generic.exam4_payment;

public class KaKaoPay implements Payment {
	
	@Override
	public void pay() {
		System.out.println("카카오페이로 결제를 진행합니다.");
	}
} 
