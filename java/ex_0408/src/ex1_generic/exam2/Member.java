package ex1_generic.exam2;

public class Member {
	
//	필드
	private String name;
	private int age;
	
//	생성자를 통해서 이름과 나이를 초기화한다.
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 생성자 초기화니 getter만
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
}
