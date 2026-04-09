package ex1_list.ArrayList.exam;

// 유저의 아이디와 패스워드를 가지는 UserInfo클래스


public class UserInfo {
	private String id;
	private int password;
	
	// getter setter
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public void printInfo() {
		System.out.println(this.getId());
		System.out.println(this.getPassword());
		System.out.println("-----------");
	}
}
