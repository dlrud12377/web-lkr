package ex1_generic.exam4_payment;

public class PaymentProcessor<T extends Payment> {
	
	// 필드 - T payment
	public T payment;
	
	public PaymentProcessor(T payment) {
		this.payment = payment;
	}
	
	//메서드
	//process() : 필드가 가지고 있는 pay()실행하기
	public void process() {
		payment.pay();
	}

}
