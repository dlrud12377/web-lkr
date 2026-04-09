package ex1_list.ArrayList;

public class Member {
	
	private String name = "";
	private int age = 0;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// overloading
	public Member() {
		
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { // age 예외처리 필요 - fix later
		try {
			if (age < 0) {
				throw new IntegerBoundOutOfRangeException("나이는 0살 아래의 값이 될 수 없습니다.");
			}
			else {
				this.age = age;
			}
		}
		catch(IntegerBoundOutOfRangeException e){
			System.out.println(e.getMessage());
			System.out.println("오류로 인한 나이 초기화");
			this.age = 0;
		}
		
	}
}
