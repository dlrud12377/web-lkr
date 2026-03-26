package ex3_class;


// 내가 자바에서 자동차를 어떻게 정의할 것인가를 정하는 클래스
public class Car {
	
	// public : 접근 제한자(public은 open source)
	// class : 변수 종류
	// Car : 클래스 변수 이름
	
	// 필드(멤버) : 클래스를 통해서 만들어진 객체들이 가질 정보(기본형 변수) - ex. 바퀴, 엔진, 브레이크, 색, 브랜드
	
	int wheel = 4; // 다음과 같이 기본값을 지정할 수 있다.
	int price;
	String color;
	String brand;

	// 메서드(행위) : 클래스가 수행할 수 있는 행위 - ex.전진, 후진, 멈춤
	
	
	// 기본 생성자의 정의 - 컴파일러가 기본으로 제공하는 형태(원래 보이지는 않음)
	public Car() {
		
	}

}



// 하나의 파일에서 여러 개의 클래스를 정의하는 것도 가능하다.
class Truck extends Car {};
class Bus extends Car {};