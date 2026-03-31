package ex5_polymorphism.exam04;

public abstract class Animal {
	// Animal 클래스
	// 메서드 : sound() - "동물이 운다" 출력
	
	// 추상 메서드
	public abstract void sound();
	
	// Dog, Cat 클래스는 Animal 클래스를 상속받는다.
	// sound() 오버라이딩 해서 "멍멍", "야옹" 소리 나게 하기
}
