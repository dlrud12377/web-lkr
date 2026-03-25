package ex2_while;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
//		int x = 1;
//		
//		while (x < 4) {
//			System.out.println(x);
//			x++; // 초기식의 값을 변화시켜줄 수 있는 증감식을 따로 작성해주어야 함
//		}
		
		// Q1. 1 ~ 6 사이의 난수를 뽑아 변수에 저장하기 + 정답 입력받아 맞추기
		
//		int ran = (int)(Math.random() * 6) + 1;
//		int answer = 0;
		Scanner sc = new Scanner(System.in);
//		
//		while(answer != ran) {
//			System.out.print("정답 : ");
//			answer = sc.nextInt();
//		}
//		
//		if (answer == ran) {
//			System.out.println("정답입니다!");
//		}
		
		
		// Q2. 1 ~ 100까지의 총 합 구하기 (while문)
		
		int i = 1;
		int sum = 0;
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ 100까지의 합 : " + sum);
		
		// Q3. 키보드에서 정수를 하나 입력받아, 각 자리의 합을 더한 결과를 출력
		// ex. 12345 -> 15 출력
		
		System.out.print("값을 입력해주세요 : ");
		int input = sc.nextInt();
		int sum2 = 0;
		
		while (input != 0) {
			sum2 += (input % 10);
			input /= 10;
		}
		
		System.out.println("모든 자리 수의 합 : " + sum2);
		
	}
}
