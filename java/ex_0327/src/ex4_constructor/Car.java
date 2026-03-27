package ex4_constructor;

public class Car {
	
	// field
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 오버로딩
	
	// 기본생성자 - 반환 타입이 없음
	public Car() {
		
	}
	
	// this()
	// 현재 클래스에 선언되어 있는 생성자를 가리킬 수 있도록 하는 키워드이다.
	
	// 모델만 초기화 하는 생성자
	public Car(String model) {
		this.model = model;
	}
	
	
	// 모델과 색상을 초기화 하는 생성자
	public Car(String model, String color) {
		this(model);
		this.color = color;
	}
	
	// 모델, 색상, 최고 속도를 초기화하는 생성자
	public Car(String model, String color, int maxSpeed) {
		this(model, color);
		this.maxSpeed = maxSpeed;
	}

	
}
