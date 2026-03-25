package ex1_for;

public class MultiForExample {

	public static void main(String[] args) {
		// 지역변수
		// 전역변수
		// 클래스 변수
		
		
		// 이중 for문
		for(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++){
				System.out.println(i + " " + j);
			}
		}
	
		
		// Q1. 두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는 모든 경우의 수 출력하기
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <=6; j++) {
				if (i+j == 6) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
		
		// Q2. print(), println()을 한 번씩 사용해서 아래를 출력
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf(j + " ");
			}
			System.out.println();
		}
		
		
		// Q3. 아래를 출력하기
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf((4*i + j) + " ");
			}
			System.out.println();
		}
		
		// Q3 - 강사님 / 위보다 가독성/지속성(유지보수력)이 좋음
		
		int count = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%02d ", count++);
				
				;
			}
			System.out.println();
		}
		
		// Q4. 아래를 for문을 이용하여 출력
		// A B C D
		// E F G H
		// I J K L
		char a = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(a++ + " "); // char값은 int값과 덧셈 시 자동으로 아스키코드 형변환이 이루어짐
			}
			System.out.println();
		}
		
		
	}
	

}
