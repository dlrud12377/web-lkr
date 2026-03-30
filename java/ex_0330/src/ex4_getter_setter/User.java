package ex4_getter_setter;

import java.util.Scanner;

public class User {
	
	// 필드 : 문자열 username, 문자열 password, 문자열 email
	String username;
	String password;
	String email;
	
	// username : 4글자 이상
	public void setUsername() {
		String username;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("4글자 이상의 아이디를 입력해주세요 : ");
			username = sc.next();
			
			if (username.length() >= 4) {
				break;
			}
			else {
				System.out.println("아이디는 4글자 이상이어야 합니다. 다시 입력해주세요");
				continue;
			}
		}
		this.username = username;	
	}
	
	public String getUsername() {
		return username;
	}
	
	
	// password
	public void setPassword() {
		String password;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("6글자 이상의 비밀번호를 입력해주세요 : ");
			password = sc.next();
			
			if (password.length() >= 6) {
				break;
			}
			else {
				System.out.println("비밀번호는 6글자 이상이어야 합니다. 다시 입력해주세요");
				continue;
			}
		}
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	// email
	public void setEmail() {
		String email;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디@도메인 형식의 이메일을 입력해주세요 : ");
			email = sc.next();
			
			if (email.contains("@")) {
				break;
			}
			else {
				System.out.println("이메일 형식이 아닙니다. 다시 입력해주세요");
				continue;
			}
		}
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setAllInfo() {
		setUsername();
		setPassword();
		setEmail();
	}
	
	public void getAllInfo(User user) {
		System.out.println("아이디 : " + user.getUsername());
		System.out.println("비밀번호 : " + user.getPassword());
		System.out.println("이메일 : " + user.getEmail());
	}
}
