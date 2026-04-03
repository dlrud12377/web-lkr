package ex2_object.Q3;

public class Member {
	
	// 필드 : id, name
	private String id;
	private String name;
	
	// 생성자로 초기화
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// equals overriding
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			if (id.equals(target.id) && name.equals(target.name)) {
				return true;
			}
		}
		return false;
	}
	
	
}
