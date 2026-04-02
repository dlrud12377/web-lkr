package app;

import java.util.Scanner;

import member.Member;
import service.MemberService;

public class Main {
	public static void main(String[] args) {
		
		// 이름 나이 입력받기(Scanner 임포트)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 입력받은 정보 토대로 객체 생성
		Member person = new Member(name, age);
		
		MemberService ms = new MemberService();
		ms.register(person);
		
	}
}
