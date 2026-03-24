package ex2_if;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		//
		
		
		// Q1. 사용자가 입력한 비밀번호가 맞는지 확인하기
		// 키보드에서 비밀번호를 입력받고, 입력한 비밀번호가 1234와 일치하면 로그인 성공
		// 일치하지 않으면 "비밀번호가 일치하지 않습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		String password = "1234";
		System.out.println("비밀번호를 입력해주세요 : ");
		String input = sc.nextLine();
		
		if (password.equals(input)) {
			System.out.println("로그인 성공!");
		}
		
		else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}
