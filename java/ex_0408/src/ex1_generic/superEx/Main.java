package ex1_generic.superEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	// List<? super Dog> list에서 허용되는 타입
	// List<Dog>, List<Animal>, List<Object>
	// 하한이 제한되기 때문에 List<Puppy>는 그대로는 안됨
	public static void addDog(List<? super Dog> list) {
		list.add(new Dog());
		list.add(new Puppy()); // 하한 제한이 걸려있기 때문에 Puppy 객체는 Dog로 취급함(업캐스팅)
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Puppy> puppyList = new ArrayList<Puppy>();
		
		addDog(animalList);
		addDog(dogList);
//		addDog(puppyList); -> puppy리스트는 하한 제한에 의해 적용 불가
		
		
		// 각 리스트에 들어있는 객체의 메서드 호출하기
		for (Animal animal : animalList) {
			animal.speak();
		}
		
		for (Dog dog : dogList) {
			dog.speak();
		
		// 두 값을 한번에 아우르려면 Object 후에 형변환 하는 것이 좋음	

		}
	}
}
