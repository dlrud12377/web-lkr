package ex3_generic;

// 클래스에 제네릭을 부여하게 되면 해당 클래스를 선언할 때 데이터 타입을 부여하게 된다.
public class DataList<T> { // T = Integer
	
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	// default 사이즈만큼의 배열을 생성하는 생성자 만들기
	public DataList() {
		this.data = new Object[defaultSize];
	}
	
	// size값을 전달받아서 size 크기만큼의 길이를 받는 배열을 만드는 
	// 생성자 만들기
	public DataList(int size) {
		this.data = new Object[size];
	}
	
	// 값을 받아서 배열에 순차적으로 넣는 add 메서드
	public void add(T value) {
		data[size++] = value;
	}
	
	// 인덱스를 받아서 배열의 값을 반환하는 get메서드
	@SuppressWarnings("unchecked") // 일단 무시 - 제네릭 타입의 변화에 따라 발생하는 예외가 있는가?
	public T get(int index) {
		try {
			return (T)data[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return null; // 에러 의미를 지닌 문자열 반환
		}
	}
	
	// 배열에 데이터가 몇 개 들어가 있는지 확인하는 size() 메서드
	public int getSize() {
		return size; // 후위연산으로 추가됐을때의 인덱스값+1만큼이므로 size 자체가 크기가 맞음
	}
	
}
