package ex1_innerclass.anonymousclass.Q3;

public interface Calculator {
	
	// 인터페이스의 추상메서드는 무조건 public이기 때문에, Main의 오버라이드 메서드의 public을 생략하여
	// default void add가 되면 범위가 인터페이스의 함수보다 좁아져 안됨
	void add(int x, int y);
}
