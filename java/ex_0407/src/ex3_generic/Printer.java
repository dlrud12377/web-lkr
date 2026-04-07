package ex3_generic;

public class Printer <U> {
	
	private U value;
	
	public void printAnother(U data) {
		System.out.println("value의 값 : " + value);
	}
	
	
	// 클래스 제네릭 타입과 제네릭 메서드의 제네릭타입이 같으면
	// 제네릭 메서드의 제네릭 타입이 우선 적용이 된다. ( T -> U )
	public <T> void printValue(T value) {
		System.out.println(value);
	}
	
	public <T> T getValue(T value) {
		return value;
	}
}
