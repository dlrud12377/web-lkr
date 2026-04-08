package ex1_generic.exam4_payment;

public class PaymentMain {
	public static void main(String[] args) {
		//Main에서 각 결제 방법에 대한 process() 실행하기
		
//		System.out.println);
//		System.out.println();
//		System.out.println();
//		System.out.print("결제 방식을 선택하세요 : ");
		
		
		PaymentProcessor<CardPayment> cp = new PaymentProcessor<CardPayment>(new CardPayment());
		cp.process();
		
		PaymentProcessor<KaKaoPay> kp = new PaymentProcessor<KaKaoPay>(new KaKaoPay());
		kp.process();

	}
}
