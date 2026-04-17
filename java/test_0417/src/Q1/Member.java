package Q1;


public class Member {
	
	// 1. 멤버 클래스 작성 - field
	private String id;
	private String name;
	private int age;
	
	// 2. 모든 필드 초기화하는 생성자 작성
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 3. 회원 정보를 출력하는 printInfo() 메서드
	public void printInfo() {
		// 출력 형식: 아이디: hong, 이름: 홍길동, 나이: 20
		System.out.println(String.format("아이디: %s, 이름: %s, 나이: %d", id, name, age));
	}

	// age값을 활용하기 위한 getter
	public int getAge() {
		return age;
	}
}
