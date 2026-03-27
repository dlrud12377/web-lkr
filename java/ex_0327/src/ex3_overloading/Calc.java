package ex3_overloading;

public class Calc {
	// 직사각형의 넓이를 구하는 area 메서드를 작성하기
	// 넓이는 메서드 내에서 출력하고 종료
	
	public void area(int a, int b) {
		System.out.printf("직사각형의 넓이는 %d X %d = %d입니다.\n", a, b, a*b);
	}
	
	public int area(int a) {
		return (int)Math.pow(a, 2);
	}
}
