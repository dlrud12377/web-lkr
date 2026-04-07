package ex3_generic.exam;

public class StudentPrinter {
	// 제네릭 메서드 printStudent(T name, U age)를 작성한다
	// 이름은 문자열, 나이는 정수로 테스트
	
	public <T,U> void printStudent(T name, U age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}
