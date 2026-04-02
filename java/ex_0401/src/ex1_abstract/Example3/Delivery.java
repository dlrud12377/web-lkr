package ex1_abstract.Example3;

// Delivery 추상클래스
public abstract class Delivery {
	
	// - printInvoice() : "송장을 출력합니다."
	public void printInVoice() {
		System.out.println("송장을 출력합니다.");
	}
	
	// - 추상메서드 void ship();
	public abstract void ship();
	
	// - complete() : "배송 처리가 완료되었습니다."
	public void complete() {
		System.out.println("배송 처리가 완료되었습니다.");
	}
	
}
