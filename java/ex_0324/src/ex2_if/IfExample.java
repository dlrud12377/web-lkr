package ex2_if;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) // score가 90보다 크거나 같으므로 {} 안의 코드가 실행됨
		{
			System.out.println("점수가 90점보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) // score가 90보다 크므로 {} 안의 코드가 실행되지 않음
		{
			System.out.println("점수가 90점보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		// Q1. 정수 하나를 입력받아서 짝수면 "짝수", 홀수면 "홀수"를 출력하는 코드 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀짝 판별을 위해 정수를 입력해주세요 : ");
		int input = sc.nextInt();
		if (input % 2 == 0) {
			System.out.println(input + "은 짝수입니다.");
		}
		
		else { // else 대신 if (input % 2 != 0) 활용 가능
			System.out.println(input + "은 홀수입니다.");
		}
		
		
	}
}
