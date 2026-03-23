package ex5_operator;

public class DoubleOperatorExample {
	public static void main(String[] args) {
		// 1-1. 산술연산자
		// +,-,*,/,%(더하기 빼기 곱하기 나누기-몫 나머지-몫)
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result = v1 + v2; // 모든 피연산자는 int로 변환됨
		
		long result2 = v1 + v2 - v4; // 모든 피연산자는 long타입으로 변경됨
		
		double result3 = v1/v3; // 몫 2
		
		int result4 = v1 % v2; // 나머지 2
		
		// 1-2. 산술변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 가능함
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은 쪽으로 타입이 맞춰짐.
		
		// double <- float <- long <- int <- byte
		
		// 2. 관계(비교)연산자
		// 크기비교(<, <=, >, >=)
		// 동등비교(==, !=)
		
		// 비교연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 실행의 흐름을 제어할 때 주로 사용
		// 두 값을 자동타입변환을 통해 타입을 일치시킨 뒤, 비교가 진행됨
		// 다만 float과 double은 정밀도 차이 때문에 double을 float로 바꿔주어야 함
		
		int num1 = 10;
		int num2 = 10;
		
		// 2-1. 비교연산자의 결과는 항상 논리형으로 반환됨
		boolean isSame = (num1 == num2); // 같으면 true, 같지 않으면 false
		System.out.println("result : " + isSame); // result : true
		
		boolean isNotSame = (num1 != num2); // 같으면 false, 같지 않으면 true
		System.out.println("result : " + isNotSame); // result : false
		
		boolean isBig = (num1 <= num2); // num2가 더 크거나 같으면 true, 아니면 false
		System.out.println("result : " + isBig); // result : true(크거나 "같기" 때문)
		
		char char1 = 'A';
		char char2 = 'B';
		
		boolean result5 = (char1 < char2); // 유니코드(아스키코드)로 비교하여 B가 더 크면 true
		System.out.println("result : " + result5); // true(65 < 66)
		
		// 2-2. 문자열끼리의 비교
		
		String str1  = "자바";
		String str2 = "Java";
		String str3 = new String("자바");
		
		// 참조자료형의 변수는 ==으로 비교하면 주소값을 비교한다.
		boolean result6 = str1 == str3;
		System.out.println("result : " + result6); // result : false -> 주소값이 달라서
		
		// 그렇다면 문자열의 내용물을 비교하려면?
		// -> equals() 메서드 사용
		// 사용방식 : 변수.equals(비교변수);
		result6 = str1.equals(str3);
		System.out.println("result : " + result6); // result : true
		
		
	}
}
