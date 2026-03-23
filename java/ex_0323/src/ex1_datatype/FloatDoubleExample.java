package ex1_datatype;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 리터럴 : 변수에 저장하기 위한 값 자체
		
		// 실수 리터럴 값은 기본타입으로 double 취급함
		// 숫자 뒤에 f를 붙여 해당 값이 float타입이라는 것을 명시해야 한다.
		
		// 정밀도
		float f1 = 0.123456789023456789f;
		double d1 = 0.1234567890123456789;
		
		System.out.println("float : " + f1); // float : 0.12345679
		System.out.println("double : " + d1); // double : 0.12345678901234568
		//double type이 좀 더 정밀한 작업시 유용함
		
		//10의 거듭제곱 리터럴
		double d2 = 3e6; // -> 3 X 10^6을 의미
		float f2 = 3e6F; // -> 3 X 10^6(float값)
		double d3 = 2e-3; // -> 2 X 10^(-3)
		
		System.out.println("d2 : " + d2); // d2 : 3000000.0
		System.out.println("f2 : " + f2); // f2 : 3000000.0
		System.out.println("d3 : " + d3); // d3 : 0.002
		
	}
}
