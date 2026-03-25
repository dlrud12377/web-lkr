package ex3_break;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		// 1 ~ 45 사이의 난수 뽑기 -> updown 게임 만들기
		int rand = (int)(Math.random() * 45) + 1;
		
		Scanner sc = new Scanner(System.in);
		int input;
		int i = 1;
		boolean isMatched = false;
		
		while(i <= 10) { // 10번 반복이 정해져 있으니 for문을 사용해도 무방하긴 함
			System.out.printf("%d번째 시도\n", i);
			System.out.print("정답 입력 : ");
			input = sc.nextInt();
			
			if (input == rand) { // 입력받은 input과 난수가 일치하면 반복문 탈출
				System.out.println("정답입니다!");
				isMatched = true;
				break;
			}
			else if (input > rand) {
				System.out.println("down");
				i++;
			}
			else {
				System.out.println("up");
				i++;
			}
			
		}
	
		// 강사님 풀이 (for문 활용)
//		if (!isMatched) {
//			System.out.println("정답을 맞추지 못했습니다!");
//		}
//		
//		int magicNumber = (int)(Math.random()*50)+1;
//	      
//	      boolean isMatched = false;
//	      
//	      
//	      for(int i = 0; i < 10; i++) {
//	         System.out.print("찾는 숫자를 입력 >> ");
//	         int guess = sc.nextInt();
//	         
//	         if(guess == magicNumber) {
//	            System.out.println((i+1)+"번째에 맞췄습니다.");
//	            isMatched = true;
//	            break;
//	         } else if(guess < magicNumber) {
//	            System.out.println("up");
//	         } else if(guess > magicNumber) {
//	            System.out.println("down");
//	         }
//	      }
//	      
//	      if(!isMatched) {
//	         System.out.println("정답을 맞추지 못했습니다.");
//	      }
		
		// 라벨
		outer : for (int j = 1; j <= 5; j++) {
			for (int k = 1; k <= 5; k++) {
				System.out.println(j + " " + k);
				if(k == 3) {
					break outer; // outer를 적은 지점의 반복문을 깨버림. 다중중첩 반복문에서 사용
				}
			}
		}
		
		
		
		
		
	}
}
