package ex1_stream.exam;

public class Member {
	
	// field
	private int id;
	private String name;
	private String status;
	
	// 생성자로 필드 초기화
	public Member(int id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	// getter
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return String.format("Member{id = %d, name = %s, status = %s}", id, name, status);
	}
}
