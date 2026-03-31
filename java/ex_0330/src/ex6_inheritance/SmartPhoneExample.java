package ex6_inheritance;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// 스마트폰 객체 생성하기
		SmartPhone myPhone = new SmartPhone("갤럭시", "블랙");
		
		System.out.println("모델명 : " + myPhone.model);
		System.out.println("모델명 : " + myPhone.color);
		

		
		//Phone으로부터 상속받은 메서드 호출
		myPhone.bell();
		myPhone.sendMessage("여보세요");
		myPhone.receiveMessage("안녕하세요! 저는 홍길동인데요");
		myPhone.sendMessage("아~ 네, 반갑습니다.");
		myPhone.hangup();
		
		//SmartPhone의 메서드를 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}
