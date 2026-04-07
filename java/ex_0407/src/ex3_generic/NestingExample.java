package ex3_generic;

class Pair <T,U> {
	private T first;
	private U second;
	
	Pair(T first, U second) {
		this.first = first;
		this.second = second;	
	}
	
	// first와 second의 값을 출력하는 print() 메서드 만들기
	
	public void print() {
		System.out.println("first : " + first);
		System.out.println("second : " + second);
	}
}

class Box<V> {
	private V value;
	
	// setter / getter
	public void setValue(V value) {
		this.value = value;
	}
	
	public V getValue() {
		return value;
	}
}

public class NestingExample {
	public static void main(String[] args) {
		// 중첩 제네릭
		Box<Pair<String, Integer>> box = new Box<>();
		
		Pair<String, Integer> pair = new Pair<>("홍길동", 30);
		
		box.setValue(pair);
		
		box.getValue().print();
	}
}
