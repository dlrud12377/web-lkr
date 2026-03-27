package ex5_static;

public class Calculator {
	
	// 파이 : 3.141592;
	static double pi = 3.141592;
	
	// 외부에서 두 수를 받아 더하여 반환하는 plus 메서드 작성하기
	public static int plus(int a, int b) {
		return a+b;
	}
	
	// 외부에서 두 수를 받아 더하여 반환하는 minus 메서드 작성하기
	public static int minus(int a, int b) {
		return a-b;
	}
}
