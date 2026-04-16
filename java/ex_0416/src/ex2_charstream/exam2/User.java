package ex2_charstream.exam2;

public class User {
	
	// 필드(private)
	private String id;
	private String password;
	
	// 필드는 생성자를 통해 초기화
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// getter setter
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// 아이디 비밀번호 문자열을 바이트배열로 만들어서 반환
	
	public byte[] toByteData() {
		return String
				.format("%s : %s\n", id, password)
				.getBytes();
	}
	
	
}
