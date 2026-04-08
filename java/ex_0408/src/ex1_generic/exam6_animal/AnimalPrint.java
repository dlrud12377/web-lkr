package ex1_generic.exam6_animal;

import java.util.List;

public class AnimalPrint {
	
	public void printAnimals(List<? extends Animal> list) {
		
		System.out.print("[");
		for (Object animal : list) {
			System.out.print(animal);
			if (list.get(list.size()-1) == animal) {
				continue;
			}
			System.out.print(", ");
		}
		System.out.print("]");
		// 주소만 나오는데.. 일단 포기
	}
}

