package dto;

// DTO(Data Transfer Object)
// 쿼리 결과를 얻어온 데이터를 저장할 객체
public class MemberDTO {
	private int member_id;
	private String name;
	private String email;
	private int age;
	
	// 모든 필드를 매개변수로 갖는 생성자 만들기
	public MemberDTO(int member_id, String name, String email, int age) {
		this.member_id = member_id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public MemberDTO(String name, String email, int age) { // member_id가 auto_increment이므로 없는 버전 오버로딩
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
