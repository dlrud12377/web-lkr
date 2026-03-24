package ex1_operator;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		// 삼항연산자
		// 조건식 ? true일때 값 : false일때 값
		// 조건식 : 참, 거짓 판별이 가능한 식(boolean값을 가짐)
		
		int x = 10;
		String result = x > 5 ? "크다" : "작다";
		System.out.println(result); // 크다
		
		int a = 10;
		int b = 15;
		boolean result2 = ++a >= b ? true : false;
		// ++a : 11, b = 15이므로 11 > 15 (거짓)
		System.out.println(result2); // false
		
		// 정수, 문자형 또한 가능
		
		int score = 85;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println("성적 : " + grade); // 성적 : B
	}
}
