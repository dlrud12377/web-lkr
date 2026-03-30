package ex6_inheritance;

public class Pen {
//	Pen 클래스
//	- 모든 펜의 부모 클래스이다.
//	- 남은양을 저장하는 amount 필드를 가진다
	
	private int amount;
	
	public Pen(int amount) {
		this.amount = amount;
	}

	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
		
}
