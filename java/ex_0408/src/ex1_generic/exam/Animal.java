package ex1_generic.exam;

public class Animal {
	
	public void move() {
		System.out.println("동물을 치료합니다");
	}

}

class Dog extends Animal {
	public void move() {
		System.out.println("강아지를 치료합니다");
	}
}

class Cat extends Animal {
	public void move() {
		System.out.println("고양이를 치료합니다");
	}
}