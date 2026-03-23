package ex5_operator;

public class LogicOperatorExample {
	public static void main(String[] args) {
		
		// 1. 논리연산자
		int x = 10;
		int y = 5;
		
		boolean result = x >= 10 /* true */ && y == 10 /* false */; //true and false = false
		System.out.println("result : " + result); // result : false
		
		// &&(and) : TT - true / TF, FT, FF - false
		// ||(or) : TT, TF, FT - true / FF - false
		
		//Q.
		result = (x-y) >= 10 && (++y) == 5;
		
		//y의 값은?
		
		// and연산자를 사용했고, x-y=5 >= 10이 이미 false이기 때문에 뒤 연산을 아예 무시해버림
		// 즉 ++y는 없는 것이 되어버림. 따라서 y는 그대로 5
		
		// 정리 : &&의 경우 앞이 false이면 / ||의 경우 앞이 true이면 - 뒤의 내용은 연산하지 않는다는 특징이 있음
		
		// 2. 비트논리연산자
		// 기능은 논리연산자와 같지만, bit단위(2진수)의 연산만 가능
		// 피연산자가 1,0이라는 것과 산출 결과가 1,0이라는 점이 특징
		// 1은 true, 0은 false라고 생각하면 논리연산자와 차이는 없음
		
		// & : 논리곱(and - 교집합)
		// | : 논리합(or - 합집합)
		// ^ : 배타적 논리합(두 논리값이 달라야 true(대칭차집합))
		// ~ : 부정(논리값의 반대 - 여집합)
		
		int a = 10; // 1010;
		int b = 7; // 0111;
		int c = a & b; // 0010(겹치는 부분만 남음)
		System.out.println("c : " + c); // 0010(2) = 2(10)
		
		int a2 = 12; // 1100
		int b2 = 8; // 1000
		int c2 = a2 | b2; // 1100(둘 중 하나라도 1이면 1이기 때문)
		System.out.println("c2 : " + c2); // 1100(2) = 12(10)"
		
		int a3 = 9; // 1001
		int b3 = 11; // 1011
		int c3 = a3 ^ b3; // 0010;
		System.out.println("c3 : " + c3); // 0010(2) = 2(10)
		
		// ~연산
		// 2진수는 음수를 표현할 수 없다.
		// 비트의 맨 앞자리는 부호의 표현으로 쓰기로 약속했다.
		int n = 7; // 0111 -> 1000 -> 1001 (보수 개념 : 오버플로우가 일어나는 정확한 값을 찾으면 될듯?)
		System.out.println(~n);
		// 보수 개념 공부 조금만 더하기
	
		
	}
}
