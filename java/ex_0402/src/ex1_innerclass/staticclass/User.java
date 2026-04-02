package ex1_innerclass.staticclass;

// Builder 패턴
// 객체를 만들 때 생성과정을 단계적으로 분리하는 설계 방식
public class User {
	String id;
	String password;
	String name;
	String email;
	int age;
	String address;
	String phone;
	
	public User(Builder b) {
		this.id = b.id;
		this.password = b.password;
		this.name = b.name;
		this.age = b.age;
	}
	
	// 객체 생성 책임 분리
	// Builder가 값을 하나씩 모으고
	// 마지막에 build() 메서드를 통해서 실제 객체를 만드는 방식
	public static class Builder {
		private String id;
		private String password;
		private String name;
		private int age;
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			// this -> Builder 객체
			return new User(this); // 리턴값이 user
		}
	}
	
	// 정리 : 
	

	
}
