package assignment;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args) {
		// 4. 이메일을 입력하면 아이디와 도메인을 나눠 정리해서 보여주는 코드
		// - 조건 : String[], split("@") 사용
		
		// 이메일을 입력해주세요. (입력받기 - Scanner)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일을 입력해주세요(아이디@도메인) : ");
		String email = sc.nextLine();
		
		// split 이용하여 쪼개고, 출력하기
		String[] emailParts = email.split("@");
		
		System.out.println("아이디 : " + emailParts[0]);
		System.out.println("도메인 : " + emailParts[1]);
		
	}
}
