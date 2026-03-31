package ex5_polymorphism.exam04;

public class Main {
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		// Animal(부모 클래스)
//		zoo.printSound(new Animal()); 추상 클래스로 바뀌어서 주석처리
		// 추상클래스는 객체를 직접 생성할 수 없다.
		// Animal a = new Animal(); x
		
		// Dog(자식클래스1)
		zoo.printSound(new Dog());
		
		// Cat(자식클래스2)
		zoo.printSound(new Cat());
	}
}
