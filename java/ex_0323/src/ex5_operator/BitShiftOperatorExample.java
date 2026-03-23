package ex5_operator;

public class BitShiftOperatorExample {
	public static void main(String[] args) {
		int num1 = 1; // 0001
		int result1 = num1 << 3; // 2진수를 왼쪽으로 3칸 옮기기 -> 1000
		System.out.println("result1 : " + result1); // 1000(2) = 8(10)
		int result2 = num1 * (int)Math.pow(2, 3); // Math.pow(2, 3) : 2의 3제곱
		System.out.println("result2 : " + result2);
		
		int num2 = -8; // 8비트 2진수 -> ...00001000 -> ....11111000
		// 11111111 11111111 11111111 11111000 (int기준 32비트 표현)
		
		int result3 = num2 >> 3;
		// >> : 부호는 유지하면서 오른쪽으로 이동하는 연산
		// 11111111 11111111 11111111 11111111
		// >>> : 무조건 0으로 채움
		// 00011111 111111111 11111111 11111111
		System.out.println("result3 : " + result3); // 전부 1이면 보수가 0....01임
		// -보수이므로 -1 나옴
	}
}
