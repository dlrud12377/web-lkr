package ex2_function;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// 람다식의 합성 : 여러 함수를 하나의 함수처럼 연결해서 새로운 함수를 만드는 것

// 람다식의 결합 : 함수 실행을 순서대로 이어서 실행

public class FunctionExample {
	public static void main(String[] args) {
		// 자바에서는 다음 인터페이스에서 합성을 지원한다
		// Function <T, R>
		// Predicate < T >
		// Consumer < T >
		
		// < 핵심 메서드 >
		
		// 1. andThen()
		// 현재 함수를 실행 -> 다음 함수를 실행한다.
		
		
		// Function
		Function<Integer, Integer> multiply = x -> 2 * x;
		Function<Integer, Integer> add = x -> x + 3;
		
		// andThen()의 반환값도 Function임. 그래서 Function 인터페이스 람다식에 저장
		Function<Integer, Integer> result = multiply.andThen(add);
		
		System.out.println(result.apply(5)); // 5 * 2 + 3 = 13
		
		// Consumer<T>
		// 반환값이 없는 함수라서 순서대로 실행하는 결합만 가능
		Consumer<String> print1 = s -> System.out.println("1 : " + s);
		Consumer<String> print2 = s -> System.out.println("2 : " + s);
		
		Consumer<String> result3 = print1.andThen(print2);
		
		result3.accept("hello");
//		1 : hello
//		2 : hello

		
		// 2. compose()
		// 괄호 안의 함수를 실행 -> 앞에 있는 함수를 실행
		
		result = multiply.compose(add);
		System.out.println(result.apply(5)); // (5 + 3 -> add) * 5 -> multiply = 16
		
		// 3. Predicate의 결합(조건 합치기)
		
		Predicate<Integer> isPositive = x -> x > 0;
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		// 3-1. and() : 조건 두개를 논리연산자 and로 묶음
		
		Predicate<Integer> result2 = isPositive.and(isEven);
		// x > 0 && x % 2 == 0
		
		System.out.println(result2.test(4)); // 짝수 & 양수 -> true
		System.out.println(result2.test(-2)); // 음수 -> false
		System.out.println(result2.test(7)); // 홀수 -> false
		
		System.out.println("--------------");
		// 3-2. or() : 조건 두개를 논리연산자 or로 묶음
		result2 = isPositive.or(isEven);
		
		System.out.println(result2.test(4)); // 짝수 & 양수 -> true
		System.out.println(result2.test(-2)); // 짝수 & 양수아님 -> true
		System.out.println(result2.test(-7)); // 짝수아님 & 양수아님 -> false
		
		// 3-3. negate() : 조건에 not연산을 붙임
		result2 = isPositive.negate();
		System.out.println(result2.test(5)); // 양수라 true -> not true -> false
		
		// 따라서 람다식은 조립이 가능한 함수다.
		
		// Q. 문자열을 입력받아서 다음의 처리를 하는 람다식 함수 파이프라인 만들기
		
		// 1. 공백 제거
		Function<String, String> stripper = s -> s.replace(" ", "");
		
		// 2. 소문자로 변환
		Function<String, String> lower = s -> s.toLowerCase();
		
		// 3. "user_" 접두사 붙이기
		Function<String, String> markUser = s -> "user_" + s;
		
		// 합성
		Function<String, String> stringPipe = stripper.andThen(lower.andThen(markUser));
		
		
		// 문자열 받기 & 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String text = sc.nextLine();
		
		System.out.println(stringPipe.apply(text));
		
	}
}
