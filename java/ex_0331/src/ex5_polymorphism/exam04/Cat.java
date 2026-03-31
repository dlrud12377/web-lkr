package ex5_polymorphism.exam04;

// 추상클래스를 상속받은 클래스는 추상 메서드를 "반드시" 오버라이딩 하여 내용을 구현해야 함
public class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println("고양이가 소리를 냅니다. 야옹");
	}

}
