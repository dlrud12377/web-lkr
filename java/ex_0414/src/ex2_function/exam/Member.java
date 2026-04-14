package ex2_function.exam;



public class Member {
	
	//Member클래스
	//필드
	//name
	//age
	
	private String name;
	private int age;
	
	// getter/setter
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
