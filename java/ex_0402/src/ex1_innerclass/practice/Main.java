package ex1_innerclass.practice;

public class Main {
	public static void main(String[] args) {
		
	// Q1. 인스턴스 내부 클래스
		RemoteControl.Button changer = new RemoteControl().new Button();
	changer.press();
	changer.press();
	
	// Q2. 정적 내부 클래스
		Calculator c = new Calculator();
		c.add(8, 5).show(); // builder처럼 한다는 것은 요런느낌
		// (호출한 메서드의 반환값이 클래스여서 그 클래스의 메서드를 다시 호출하는 액자식 구성)
	
	}
}
