package ex1_innerclass.interfaceexample;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		// 내부 인터페이스를 구현하는 클래스 생성
		class OkListener implements Button.ClickListener {
			
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
			
		}
		
		btnOk.setClickListener(new OkListener());
		
		// ok버튼 클릭하기
		btnOk.click();
	}
}
