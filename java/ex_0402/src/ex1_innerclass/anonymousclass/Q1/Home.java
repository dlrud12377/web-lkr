package ex1_innerclass.anonymousclass.Q1;

public class Home {
	// 인터페이스의 객체는 직접 만들 수 없다.
	// 인터페이스를 구현하는 클래스를 만들어 객체로 사용해야 한다.
	// -> 이럴때 이름 지정 안하고 바로 사용하는 innerclass 사용
	// -> 장점 : implements, 클래스 이름 등등의 부차적인 부분을 생략함
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켰습니다.");
		};
		
		@Override
		public void turnOff() {
			System.out.println("TV를 껐습니다.");
		};
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켰습니다.");
			};
			
			@Override
			public void turnOff() {
				System.out.println("TV를 껐습니다.");
			};
		};
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
}
