package ex1_generic.exam;

public class Main {
	public static void main(String[] args) {
		
		// Main에서 GenericBox<String> 객체에게 "사과" 저장 후 출력
		GenericBox<String> box1 = new GenericBox<>();
		box1.setItem("사과");
		
		System.out.println(box1.getItem());
		
		// GenericBox<Integer> 객체에 100 저장 후 출력
		GenericBox<Integer> box2 = new GenericBox<Integer>();
		box2.setItem(100);
		
		System.out.println(box2.getItem());
		
		
		AnimalHospital<Dog> dogHospital = new AnimalHospital<Dog>(new Dog());
		AnimalHospital<Cat> catHospital = new AnimalHospital<Cat>(new Cat());
		
		// 동물병원은 동물만 다루는 곳인데
		// 문자열이나 숫자 다른 객체가 들어오면 이상해진다.
		dogHospital.treat();
		catHospital.treat();
	}
}
