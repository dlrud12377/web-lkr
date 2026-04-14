package ex2_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
	public static void main(String[] args) {
		// 1. Consumer<T>
		// 값을 **하나 받아서** **소비**만 하는 인터페이스
		// 즉, 입력은 있지만 반환값은 없음
		// void accept(T t);
		
		Consumer<String> consumer = str -> System.out.println("출력 : " + str);
		// 출력 :  을 포기하면 더 짧게도 가능
		// Consumer<String> consumer = System.out::println;
		consumer.accept("문자열");
		consumer.accept("자바");
		
		List<String> fruits = Arrays.asList("사과", "바나나", "포도");
		
		// 과일 1개를 출력하는 람다식 만들기
		Consumer<String> printFruit = System.out::println;
		
		Iterator<String> fruitsIter = fruits.iterator();
		while(fruitsIter.hasNext()) {
			printFruit.accept(fruitsIter.next());
		}
		
		// 리스트에 들어있는 모든 내용을 람다식을 이용해 출력해보기
		printFruit.accept(fruits.toString());
		
		
		// 2. Supplier<T>
		// 값을 **만들어서 공급** 하는 인터페이스
		// 입력은 없고, 반환값만 있다.
		// T get()
		
		Supplier<String> supplier = () -> "안녕하세요";
		
		System.out.println(supplier.get());
		
		// 랜덤 주사위 눈을 반환받는 람다식 만들고 눈 뽑기
		
		Supplier<Integer> dice = () -> (int)(6 * Math.random()) + 1;
		System.out.println("주사위의 눈 : " + dice.get());
		System.out.println("주사위의 눈 : " + dice.get());
		
		// 객체 생성의 방식 4가지
		// 랜덤값 생성
		// 기본값 생성
		// 객체 생성
		// 지연 생성
		
		// 즉시 객체를 생성
		// 실행하면 무조건 객체가 만들어진다.
		ExpensiveObject obj = new ExpensiveObject();
		
		// supplier로 선언을 한다고 해서 객체가 만들어지는 것은 아님
		Supplier<ExpensiveObject> supplier2 = () -> new ExpensiveObject();
		
		// 따라서 필요할 때 get()을 호출해서 객체를 생성
		supplier2.get(); // 위에 선언만 해두었다가 필요할때 get으로 지연생성
		// 싱글톤 방식과 매우 유사함
		// 싱글톤은 private static으로 만들어둔 객체를 getinstance로 필요할 때 불러오는 느낌
		// 위의 방식은 객체를 만드는 "함수", 즉 메서드를 저장해 뒀다가, 필요할 때 get으로 객체를 만듦
		// 이렇게 객체 생성 시기의 차이는 있음
		
		// Function<T, R>
		// 입력값을 받아서 다른 결과값으로 변환하는 인터페이스
		// R apply(T t)
		
		// 문자열 길이 구하기
		Function<String, Integer> lengthFunction = str -> str.length();
		
		System.out.println(lengthFunction.apply("hello"));
		System.out.println(lengthFunction.apply("java"));
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> result = new ArrayList<Integer>();
		
		// numbers에 들어있는 모든 요소에 2를 곱하여 result에 넣기
		
		Function<Integer, Integer> multiTwo = x -> 2 * x;
		
		for (int number : numbers) {
			result.add(multiTwo.apply(number));
		}
		
		System.out.println(result);
		
		// Predicate<T>
		// 값을 받아서 조건을 검사한 뒤 true/false를 반환하는 인터페이스
		// boolean test(T t);
		
		// 필터링
		// 유효성검사
		// 조건 분기
		// 검색 조건 체크
		
		Predicate<String> p = str -> str.length() >= 5;
		System.out.println(p.test("java"));
		System.out.println(p.test("Spring"));
		
		// isLongText
		
		// BiConsumer<T, U>
		// 값을 두 개 받아서 소비만 한다.
		// void accept(T t, U u);
		
		BiConsumer<String, Integer> printUser = (name, age)
				-> System.out.println("이름 : " + name + ", 나이 : " + age);
		
		printUser.accept("김철수", 25);
		
		// BiPredicate<T>
		// 값을 **두 개** 받아서 조건을 검사한 뒤 true/false를 반환하는 인터페이스
		// boolean test(T t, U u);
		BiPredicate<String, String> isSame = (a,b) -> a.equals(b);
		
		System.out.println(isSame.test("java", "java"));
		System.out.println(isSame.test("java", "Spring"));
		
		
	}
}
