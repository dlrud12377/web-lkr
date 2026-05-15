package dto;

public class CustomerDTO {
	// 필드
	private int customer_id;
	private String name;
	private String phone;
	
	// 생성자
	public CustomerDTO(int customer_id, String name, String phone) {
		this.customer_id = customer_id;
		this.name = name;
		this.phone = phone;
	}
	
	// 생성자 오버로딩(id가 auto_increment이므로 없는 버전 하나 만들어줌)
	public CustomerDTO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// getter/setter
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// 정보 불러오는 메서드 -> 이거는 DAO에서
	
}
