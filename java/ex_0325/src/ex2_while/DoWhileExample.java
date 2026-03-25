package ex2_while;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		//-------------------------------
		
		// Q1. 사용자가 비밀번호를 입력한다
		// 비밀번호가 "1234"와 같을 때까지 계속 입력받는다.
		int i = 0;
		String password;
		
		do {
			System.out.print("비밀번호를 입력해주세요 : ");
			password = sc.nextLine();
			if (!password.equals("1234")) {
				System.out.printf("비밀번호를 %d회 틀렸습니다. \n", ++i);
			}
		} while (!password.equals("1234") && (i < 5));
		
		if (password.equals("1234")) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("비밀번호를 " + i + "회 틀려 접속 차단되었습니다.");
		}
		
		
		// Q2. 정수를 입력받는다.
		// 입력받은 수를 뒤집어서 출력하기
		
		System.out.println("뒤집어 출력할 숫자를 입력해주세요 : ");
//		int input = sc.nextInt();
//		if (input < 0) {
//			System.out.print("-");
//			input = -input;
//		}
//		
//		do {
//			System.out.print(input%10);
//			input /= 10;
//		} while(input != 0);
		
		// 출력 말고 숫자 자체를 보존하려면?
		
		int input = sc.nextInt();
		int reverse = 0;
		
		do {
			reverse = reverse * 10 + input % 10;
			input /= 10;
		} while(input != 0);
		
		System.out.println("뒤집은 수 : " + reverse);
	}
}
