package ex1_generic.exam6_animal;

//Animal클래스
//Animal을 상속받는 Dog, Cat클래스 만들기
//
//AnimalPrint클래스 만들기
//메서드
//Animal클래스를 상속받는 클래스의 제네릭 타입을 가진 리스트를 외부에서 받아서
//출력하는 printAnimals 만들기

//Main에서 Dog,Cat리스트를 만들어서 메서드로 전달하기


public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
}
class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
}