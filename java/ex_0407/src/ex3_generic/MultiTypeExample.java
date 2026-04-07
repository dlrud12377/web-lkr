package ex3_generic;

// 제네릭타입은 두 개 이상도 작성할 수 있다.
class PairBox<T,U> {
	private T first;
	private U second;
	
	public void set(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	// getter 만들기(setter는 생성자에서 받았으니 필요없음)
	
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
	
}


public class MultiTypeExample {
	public static void main(String[] args) {
	
		PairBox<String, Integer> box1 = new PairBox<>();
		box1.set("홍길동", 20);
		System.out.println(box1.getFirst());
		System.out.println(box1.getSecond());
		
		
		PairBox<String, Double> box2 = new PairBox<>();
		box2.set("김철수", 178.3);
		System.out.println(box2.getFirst());
		System.out.println(box2.getSecond());
	}
}
