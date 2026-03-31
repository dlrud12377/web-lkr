package ex6_inheritance;

public class Pen {
//	Pen 클래스
//	- 모든 펜의 부모 클래스이다.
//	- 남은양을 저장하는 amount 필드를 가진다
	
	private int amount;

	// getter setter
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount > 0) {
			this.amount = amount;
		}
		else {
			System.out.println("잘못된 값을 입력하여 값이 0으로 초기화됩니다.");
			this.amount = 0;
		}
	}
		
}
