package ex5_static;

public class Calculator {
	
	// static 키워드가 붙어있으면 메모리에 한번만 올라간다.
	// 모든 객체가 static 필드의 값을 공유한다.
	
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
