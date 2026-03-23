package ex5_operator;

public class SingleOperatorExample {
	public static void main(String[] args) {
		// 부호를 결정하는 연산자
		int x = -100;
		x = -x;
		System.out.println("x의 값 : " + x);
		
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// ++ : 1을 증가
		// -- : 1을 감소
		
		// 전위연산
		// - 연산자가 앞에 오는 연산
		int a = 5;
		System.out.println(++a); //6
		
		// 후위연산
		// - 연산자가 피연산자 위에 오는 연산
		// - 사용을 먼저 하고, 그 뒤에 연산을 함
		int b = 5;
		System.out.println(b++); // 5..? -> 먼저 b를 출력을 하고, 1을 더하는 로직
		System.out.println(b); // 6
		
		x = 5;
		int result = ++x + x++; // ++x로 인해 x=6, 이게 x++에 적용되어 result는 12
		System.out.println(result); // 12
		System.out.println(x); // x의 값은 ++x, x++에서 각각 1씩 올랐으므로 7
		
		// Q.
		x = 2;
		int y = 3;
		int z = x++ + ++y;
		// x, y, z의 값을 구하시오
		// 1. x : x++로 인해 3
		// 2. y : ++y로 인해 4
		// 3. z : x++(증감 적용안됨. 2) + ++y(증감 적용됨. 4) = 6
		
		// 논리 부정 연산자
		// !논리형 데이터
		
		// true -> false
		// false -> true
		
		boolean isOn = true;
		System.out.println(!isOn); // false
		
	}
}
