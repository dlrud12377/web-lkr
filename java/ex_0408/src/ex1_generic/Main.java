package ex1_generic;

public class Main {
	public static void main(String[] args) {
		
		// 제네릭에 타입을 넣을 수 있는 것은 좋은데
		// 아무 타입이나 넣어도 된다는 것이 문제
		Calculator<Number> cal1 = new Calculator<Number>();
//		Calculator<Object> cal2 = new Calculator<Object>();
//		Calculator<String> cal3 = new Calculator<String>();
//		Calculator<Main> cal4 = new Calculator<Main>();
		
		// 어떤 기능을 만들 때는
		// 특정 성질을 가진 타입만 받아야 안전하다는 문제가 생긴다.
		
		// 제네릭에 넣을 수 있는 타입의 범위를 한정 (현재 Number로 한정함)
		Calculator<Integer> cal2 = new Calculator<Integer>();
		Calculator<Double> cal3 = new Calculator<Double>();
		Calculator<Long> cal4 = new Calculator<Long>();
	}
}
