package ex1_innerclass.anonymousclass.Q2;

public class ButtonExample {
	public static void main(String[] args) {
		// 메서드에 매개변수로 전달하는 방식을 이용하여
		// 이벤트 처리하기
		
		Button btnOk = new Button();
		
		// setter 호출을 먼저하고, 거기에 익명 객체
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("확인 버튼을 누른다.");
				
			}
		});

		btnOk.click(); // 버튼을 누름
		
		Button btnCalcel = new Button();
		btnCalcel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("취소 버튼을 누른다.");
			}
			
		});
		btnCalcel.click(); // 버튼을 누름
	}
}
