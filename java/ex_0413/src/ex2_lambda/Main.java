package ex2_lambda;

public class Main {
	public static void main(String[] args) {
		// 인터페이스 사용 방법
		
		// 1. 구현클래스를 만들어서 사용하기
		MyFunction mi = new MyFunctionImpl();
		mi.run();
		
		// 2. 익명 클래스 만들기
		MyFunction m = new MyFunction() {
			@Override
			public void run() {
				System.out.println("익명클래스");
			}
		};
		
		m.run();
		
		// 3. 람다식 사용하기
		MyFunction m2 = () -> {System.out.println("람다식");};
		m2.run();
		
		// 람다식을 사용하는 이유
		// 1. 코드가 짧아진다.
		// 익명 클래스보다 코드를 짧게 작성할 수 있다.
		
		// 2. 핵심 로직이 잘 보인다.
		// 클래스 선언, 메서드 선언과 같은 껍데기를 줄이고
		// 실제로 하고싶은 동작만 보이게 할 수 있다.
		
		// 3. 컬렉션 처리에 유용하다.
		// 정렬, 필터링, 반복 처리같은 작업에서 자주 사용된다.
		
		// 자바에서 함수는 독립적으로 호출이 가능한 것
		// 메서드는 클래스에 속해있는 함수
		
		// 4. 함수형 프로그래밍 스타일을 일부 사용할 수 있다.
		
		// 매개변수가 1개인 람다식
		
		// 람다식은 기본적으로 변수에 담을 수 있다.
		// 타입이 인터페이스여야 함
		PrintNumber pn = (x) -> {System.out.println(x);};
		pn.print(10);
		// PrintNumber pn = System.out::println;까지 가능.
		
		// Add
		// 매개변수가 2개일 때
		// 매개변수에 전달되 두 개의 숫자를 더하여 반환하는 람다식 작성하기
		// 명령이 한줄이고, return과 중괄호는 같이 생략할 수 있다.
		Add ad = (x,y) -> x+y;
		int result = ad.sum(3,5);
		System.out.println(result);
		
		// NumberCheck라는 함수형 인터페이스 만들기
		// 정수형 매개변수 1개를 갖고, 반환형이 논리형인 test() 추상메서드 작성
		
		// Main에서
		
		// 1. 짝수인지 판별하는 람다식을 만든다.
		// 2. 0보다 큰지 판별하는 람다식을 만들다.
		// 숫자를 전달하고 결과 확인하기
		
		NumberCheck nc = x -> x % 2 == 0;
		NumberCheck nc2 = x -> x > 0;
		boolean result1 = nc.test(4);
		boolean result2 = nc2.test(-4);
		
		System.out.println(result1 + ", " + result2);
		
	}
}
	
	
