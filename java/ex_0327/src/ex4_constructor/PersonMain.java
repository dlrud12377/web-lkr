package ex4_constructor;

public class PersonMain {
	public static void main(String[] args) {
		// PersonMain에 Person 객체 생성
		// 각 객체의 필드는 생성자를 통해 초기화 한다.
		
		// 객체 생성
		
		Person p1 = new Person("김바스", 26);
		
		Person p2 = new Person("감바스", 22);
		
		Person p3 = new Person("크라바스", 24);
		
		Person[] people = {p1, p2, p3};
		
		for (Person person : people) {
			person.Introduce();
		}
	}
}
