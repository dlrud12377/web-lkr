package ex4_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		// 지역 변수 : 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		// 안에서 만든 변수는 바깥에서 사용할 수 없다.
		// 바깥에서 만든 변수는 안에서 사용할 수 있다.
		
		int i; // 바깥에서 만든 변수
		
		for(i = 1; i<=3; i++) { // 바깥 변수 i를 for문 내부에서 사용
			System.out.println(i); // 1 2 3
		}
		
		System.out.println(i); // 4
		
		
		System.out.println("-------------------------");
		
		// Q1. 5 4 3 2 1 출력하기(반복문 활용)
		for (i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		System.out.println("-------------------------");
		
		int sum = 0; // 총 합을 담을 변수
		for(i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i
		}
		
		System.out.println("1 ~ 10 까지의 총 합 : " + sum);
		System.out.println("-------------------------");
		
		// Q2. 1부터 10까지 3의 배수만 출력하는 for문 작성하기
		
		for(i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		
		System.out.println("-------------------------");
		
		// Q3. 1~20까지 홀수만 출력
		
		for(i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		
		System.out.println("-------------------------");
		
		// Q4. 정수형 변수를 하나 초기화한다. -> 스캐너로 받기
		// 해당 정수에 해당하는 구구단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 단수를 입력하세요 : ");
		int input = sc.nextInt();
		
		for (i=1; i<=9; i++) {
			
			System.out.printf("%d X %d = %d\n", input, i, (input * i));
		}
		
		System.out.println(" ");
		System.out.println("-------------------------");
		
		// Q5. 정수 n을 입력받고 sigma(n) 구하기
		
		sum = 0;
		
		// scanner 생략
		
		System.out.print("1~n 합을 구하겠습니다. 정수 n을 입력해주세요 : ");
		int n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		
		System.out.println(" ");
		System.out.println("-------------------------");
		
		// Q6. 10개의 정수를 입력받고 그 수들 중 짝수가 몇개인지 구하시오
		
		int count = 0;
		int num;
		
		for (i = 1; i <= 10; i++) {
			System.out.printf("%d번째 정수를 입력해주세요 : ",i);
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("방금 입력받은 수는 짝수입니다!");
				count++;
			}
			
			System.out.println(" ");
		}
		
		System.out.println("총 짝수의 개수 : " + count + "개");
		
	}
}
