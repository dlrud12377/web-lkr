package ex2_object.Q1_Q2;

public class Member {
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	// instanceof 연산자 : 왼쪽에 있는 객체가 오른쪽의 타입인지 검사
	// 일치하면 target의 변수에 담는다
	
	// equals를 정의하려고 equals를 쓰면 문제되는 상황이 없는것인가..?
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target)
			if (id.equals(target.id)) { // id 문자열이 같은지 비교
				return true;
			}
		return false;
	}
}
