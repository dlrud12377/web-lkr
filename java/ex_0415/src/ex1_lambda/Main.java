package ex1_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Printer {
	public void print(String message)  {
		System.out.println("출력 : " + message);
	}
}

class Person {
	
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person 객체 생성");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class Main {
	
	public static void main(String[] args) {
		// 메서드 참조 : 람다식을 더 짧게 쓸 수 있는 참조
		// 이미 존재하는 메서드를 그대로 호출만 하는 형태일 때 사용 가능
		List<String> names = Arrays.asList("Kim", "Lee", "Park");
		
		// 메서드 참조를 하는 이유
		names.forEach(s-> System.out.println(s));
		
		// 람다식은 리스트에 있는 요소를 받아서 출력만 함
		// 직접 계산을 하거나 로직을 조합하는 형태가 아님
		
		// 의미는 같으나 코드가 더 짧고 의도가 분명하다.
		names.forEach(System.out::println);
		
		// 메서드 참조 사용하는 법
		// 클래스명::메서드명
		// 변수명::메서드명
		
		// 메서드 참조의 4가지 종류
		// 1. static 메서드 참조
		// 클래스명::메서드명
		
		// 문자열을 전달받아 정수로 변환하는 람다식 만들기 - parseInt
		Function<String, Integer> f1 = Integer::parseInt;
		System.out.println(f1.apply("100"));
		
		// 2. 특정 객체의 메서드를 참조활 때
		// 객체변수명::메서드명
		Printer printer = new Printer();
		Consumer<String> c1 = printer::print;
		c1.accept("Hello");
		
		// 어떤 객체를 사용할지가 이미 정해져있음
		
		// 3. 객체의 메서드 참조
		BiFunction<String, String, Integer> f2 = String::compareTo;
		// 어차피 String 매개변수 2개 들어올거 알고있으니 저렇게 비교
		// 첫 번째 매개변수 -> 메서드를 호출할 객체
		// 두 번째 매개변수 -> 메서드의 인자
		// 이 형식으로 자동적용됨
		
		// (a,b) -> a.compareTo(b)에서
		// a : 메서드 호출의 주체
		// b : 메서드 인자
		
		System.out.println(f2.apply("apple", "banana")); // -1 / apple이 banana보다 앞에 있으므로 apple이 banana보다 사전적으로 더 작음
		// 따라서 앞의 값이 더 작으니 -1
		
		// 4. 생성자의 참조
		// 클래스명::new
		Supplier<Person> s1 = Person::new;
		Function<String, Person> f3 = Person::new;
		BiFunction<String, Integer, Person> f4 = Person::new;
		
		Person p1 = s1.get();
		Person p2 = f3.apply("홍길동");
		Person p3 = f4.apply("김길현", 28);
		
		
		
	}
}
