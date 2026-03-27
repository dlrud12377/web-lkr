package ex4_constructor;

public class Person {
	// Person 클래스 생성
	// 필드 : String name, int age
	String name;
	int age;
	
	// 생성자로 초기화(this 활용하기)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Introduce 메서드 생성
	public void Introduce() { // 출력만이 목적이므로 반환값 없음
		System.out.println("안녕하세요. 저는 " + this.age + "살 " + this.name + "입니다.");
	}
}
