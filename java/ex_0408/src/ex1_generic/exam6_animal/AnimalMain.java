package ex1_generic.exam6_animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalMain {
	public static void main(String[] args) {
//		List<Dog> dogs = new ArrayList<Dog>();
		List<Dog> dogs = Arrays.asList(new Dog("리트리버"), new Dog("삽살개"), new Dog("진돗개"));
		List<Cat> cats = new ArrayList<Cat>();
		
		AnimalPrint ap = new AnimalPrint();
		ap.printAnimals(dogs);
		ap.printAnimals(cats);
	}
}
