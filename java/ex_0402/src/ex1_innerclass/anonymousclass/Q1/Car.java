package ex1_innerclass.anonymousclass.Q1;

public class Car {
	
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		// 익명클래스
		
		@Override
		public void roll() {
			System.out.println("오버라이딩 타이어가 굴러갑니다.");
		};
		
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	// 2. 지역변수 이용
	public void run2() {
		Tire tire = new Tire() {
			
			@Override
			public void roll() {
				System.out.println("지역변수 타이어가 굴러갑니다.");
			};
		};
	}
	
	// 3. 매개변수 이용
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
}
