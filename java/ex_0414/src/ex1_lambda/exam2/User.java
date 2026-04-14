package ex1_lambda.exam2;

public class User {
	
//	필드(생성자를 통해서 초기화)
	private String name;
	private int age;
	private String city;
	
	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	public void printUser() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("거주 지역 : " + city);
	}

}
