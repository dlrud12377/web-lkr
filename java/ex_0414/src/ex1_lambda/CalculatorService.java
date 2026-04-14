package ex1_lambda;

public class CalculatorService {
	
	// 람다를 매개변수로 받는 메서드
	// 식 자체를 매개변수로 넘길 수 있음
	public void execute(Calculator calculator) {
		int result = calculator.calc(10, 20);
		System.out.println("결과 : " + result);
	}
	
	// 람다를 반환하는 메서드 -> 람다식을 반환하기 때문에 타입은 인터페이스
	// 매개변수로 "add"라는 문자열이 넘어오면 두 수를 더해서 반환
	// "sub"라는 문자열이 넘어오면 두 수를 빼서 반환
	public Calculator getCalculator(String type) throws NullPointerException {
		if (type.equals("add")) {
//			Calculator c = (a,b) -> a+b;
//			return c;
			// c라는 객체를 생략하고 return에 바로 박을 수 있음
			return (a,b) -> a + b;
		}
		else if (type.equals("sub")) {
			return (a,b) -> a - b;
		}
		else {
			return null;
		}
	}
}