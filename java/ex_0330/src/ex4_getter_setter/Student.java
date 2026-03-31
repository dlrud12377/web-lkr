package ex4_getter_setter;

public class Student {
	
	// 필드 - 문자열 타입 이름, 정수 타입 나이 / private로 선언
	private String name;
	private int age;
	
	
	// 이름의 getter/setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 나이의 getter/setter(세팅 시 음수값이 나오지 않도록 조절)
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("잘못된 값을 입력하여 나이가 0으로 초기화됩니다.");
			this.age = 0;
			return;
		}
		else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	
}
