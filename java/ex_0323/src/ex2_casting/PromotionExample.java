package ex2_casting;

public class PromotionExample {
	public static void main(String[] args) {
		
//		 1. 자동 타입 변환(명시적 형변환)
//		 작은 자료형 -> 큰 자료형으로 바꾸려고 할 때 사용
//		 자동으로 변환이 된다.
				
		// (1). 정수형 타입의 자동변환
		byte byteValue = 10;
		int intValue = byteValue; // 따로 캐스팅처리 x
		System.out.println("intValue : " + intValue); // intValue : 10
		
		intValue = 50;
		long longValue = intValue; // 따로 캐스팅처리 x
		System.out.println("longValue : " + longValue); // longValue : 50
		
		// (2). 문자형 타입의 정수형 변환(문자형 -> 정수형)
		char c = 'A';
		int num = c; // 문자형 타입을 정수형 변수에 대입 -> 아스키 코드로 변환됨
		System.out.println(num); // 65(아스키코드상 A와 대응되는 수)
		
		// 2는 Demotion에서
	}
}
