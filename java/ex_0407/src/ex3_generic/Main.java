package ex3_generic;

// 제네릭은 static과 혼용이 불가능하다.
// why? 
// 1. 스태틱은 프로그램이 실행될 때 1순위로 올라감
// 2. 제네릭 변수는 제네릭을 사용하는 객체를 생성할 때 타입이 정해진다.
// 3. 즉 프로그램이 실행되는 타이밍에 변수가 결정되지 않기 때문에 혼용이 불가능하다.

public class Main {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		GenEx<String> v1 = new GenEx<String>();
		
		v1.setValue("변수1");
		System.out.println(v1.getValue());
		
		// 제네릭 타입이 정수인 객체 v2
		// 값 넣고 출력하기
		GenEx<Integer> v2 = new GenEx<>();
		
		v2.setValue(30);
		System.out.println(v2.getValue());
		
		
		// 제네릭 타입이 문자형인 객체 v3
		// 값 넣고 출력하기
		GenEx<Character> v3 = new GenEx<>();
		
		v3.setValue('변');
		System.out.println(v3.getValue());
		
		
		Sample<String> sample = new Sample<String>();
		sample.addElement("This is String", 5);
		System.out.println(sample.getElement(5));
		
		Printer p = new Printer();
		
		// 타입 추론
		// 제네릭 메서드를 호출할 때 전달한 값으로 타입을 자동 판단한다.
		p.printValue("안녕하세요");
		p.printValue(100);
		p.printValue(3.14);
		
		// 명시적으로 타입을 적는 방법
		p.<String>printValue("안녕");
		p.<Integer>printValue(100);
		
		System.out.println(p.getValue("자바"));
		System.out.println(p.getValue(1000));
	}
}
