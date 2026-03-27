package ex2_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodExample example = new MethodExample();
		
//		example.printInfo();
//		
//		// 두 수를 더하여 반환하는 add 메서드 작성하기
//		
//		int x = 3;
//		double y = 3.4;
//		
//		// 메서드 호출
//		System.out.println(example.add(x, y));
//		
//		// 원의 넓이
//		System.out.println("원의 넓이 : " + example.circleArea());
//		
//		// 원의 둘레
//		System.out.println("원의 둘레 : " + example.circumference());
//		
//		// 정수 배열을 매개변수로 받아 짝수 개수를 반환
//		example.countEven();
		
		// 특정 문자 개수 세기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾고 싶은 문자(알파벳 1개) : ");
		char ch = sc.next().charAt(0); // while문을 통해 1글자만 입력하도록 할수도 있을듯
		
		int result = example.countChar(ch);
		
		System.out.println(ch + "의 총 개수 : " + result + "개");
		
	}
}

