package member;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		
		if (age < 0) {
			System.out.println("잘못된 값을 입력해 나이를 0살로 저장합니다.");
			this.age = 0;
		}
		else {
			this.age = age;
		}

	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
