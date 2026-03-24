package ex1_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		
		// Q1. 상자 하나에는 농구공이 5개 들어갈 수 있음
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가? -> 5개
		// 23 / 5의 몫이 얼마인지 + 나머지가 있는지(true = 1, false = 0)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("농구공은 박스 1개당 5개까지 넣을 수 있습니다.");
		System.out.print("농구공의 개수를 입력해주세요 : ");
		int basketBall = sc.nextInt();
		
		int box = (basketBall / 5) + ((basketBall % 5 != 0) ? 1 : 0);
		
		System.out.println("필요한 박스의 최소 개수 : " + box); // 5
		
		
		// Q2. 직사각형의 가로와 세로의 길이를 입력받아 넓이와 둘레 구하기
		
		// scanner 생략
		
		System.out.print("직사각형의 가로 길이를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("직사각형의 세로 길이를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		
		double sqaure = num1 * num2;
		double perimeter = 2 * (num1 + num2);
		
		System.out.printf("직사각형의 둘레 길이(소수 첫째자리까지) : %.1f\n", perimeter);
		System.out.printf("직사각형의 넓이(소수 첫째자리까지) : %.1f\n", sqaure);
		
		
		// Q3. 학생은 하루에 일정한 금액의 용돈을 받는다
		// 하루에 받는 용돈 : money, 날짜 수 : day
		// 총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을 출력하는 코드 작성하기
		// 각 값들은 키보드로 입력받음
		
		// scanner 생략
		
		System.out.print("하루마다 받는 용돈의 양을 적어주세요(숫자만) : ");
		int money = sc.nextInt();
		
		System.out.print("용돈을 며칠 받았는지 적어주세요(숫자만) : ");
		int day = sc.nextInt();
		
		System.out.print("지금까지 총 얼마를 사용했는지 적어주세요(숫자만) : ");
		int used = sc.nextInt();
		
		int leftMoney = money * day - used;
		
		System.out.println("현재 잔고 : " + leftMoney);
		
		
		// Q4. 국어, 영어, 수학에 대한 점수를 키보드에서 입력받는다.
		// 1. 세 과목에 대한 합계 출력하기
		// 2. 평균 출력하기 (합계 / 3.0)
		// 3. 세 과목의 점수가 각각 60점 이상이고, 평균이 60점 이상일 때 합격 / 아니면 불합격 처리
		
		System.out.print("국어 점수를 입력하세요(소숫점 1자리) : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 점수를 입력하세요(소숫점 1자리) : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 점수를 입력하세요(소숫점 1자리) : ");
		double math = sc.nextDouble();
		
		double average = (korean + english + math) / 3.0;
		
		String result = korean >= 60
				&& english >= 60
				&& math >= 60
				&& average >= 60
				? "합격" : "불합격";
				
		System.out.println("시험 결과는 " + result + "입니다.");
	}
}
