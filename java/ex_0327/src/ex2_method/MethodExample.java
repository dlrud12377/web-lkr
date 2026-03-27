package ex2_method;

import java.util.Scanner;

public class MethodExample {
	// 메서드의 구조
	// 접근제한자 반환형 메서드명(매개변수) {
	// 실행할 코드
	// return 반환값;
	// }
	
	// 반환할 값이 없으면 반환형은 void
	// 외부에서 받을 값이 없으면 매개변수는 생략 가능
	
	// "메서드가 호출되었습니다" 라고 출력되는 printInfo 메서드 작성하기
	
	public void printInfo() {
		System.out.println("메서드가 호출되었습니다.");
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double circleArea() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요(소숫점 가능) : ");
		double radius = sc.nextDouble();
		return 3.14*Math.pow(radius, 2);
	}
	
	public double circumference() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력해주세요(소숫점 가능) : ");
		double radius = sc.nextDouble();
		return 2 * 3.14 * radius;
	}
	
	
	// 정수 배열을 매개변수로 받아 짝수 개수를 반환
	public void countEven() {
		Scanner sc = new Scanner(System.in);
		
		// 배열 내부 수 입력받기
		
		System.out.println("입력하실 정수의 개수를 입력해주세요 : ");
		int rep = sc.nextInt(); // repeat counter
		int[] array = new int[rep];
		int i = 0;
				
		while (i < rep) {
			System.out.print("수 입력 : ");
			array[i] = sc.nextInt();
			i++;
		}
		
		System.out.println("수 입력 완료! 짝수를 count합니다");
		
		int count = 0;
		for (int number : array) {
			if (number % 2 == 0) {
				count++;
			}
		}
		
		System.out.println("입력받은 정수 중 짝수의 개수는 " + count + "입니다!");
		
	}
	
	
	// 문자열에서 해당 문자가 몇번 등장하는지 반환하는 countChar 메서드 작성
	public int countChar(char a) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		
		char[] senSplit = sentence.toCharArray(); // split("")을 써도 됨. 다만 값을 String으로 다뤄야함
		
		int count = 0;
		
		for (char element : senSplit) {
			if (element == a) 
			{
				count++;
			}
			else 
			{
				continue;
			}
			
		}
		
		return count;
	
	}
	
}
