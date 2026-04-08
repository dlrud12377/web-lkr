package ex1_generic.exam;

//제네릭 타입 T를 사용하는 클래스
public class GenericBox <T> {
	
	// item 필드 1개를 가진다. 타입은 T
	private T item;
	
	// setter로 값을 지정한다.
	public void setItem(T item) {
		this.item = item;
	}
	
	// getter로 메서드값을 반환한다.
	public T getItem() {
		return item;
	}
}
