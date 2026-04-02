package ex1_innerclass.anonymousclass.Q2;

public class Button {
	
	public static interface ClickListener {
		void onClick(); // 추상메서드
	}
	
	// 필드
	private ClickListener clickListener;
	
	// setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// void click();
	public void click() {
		clickListener.onClick();
	}

	// 전달받은 객체가 가지는 onClick() 메서드 호출하기
	
}
