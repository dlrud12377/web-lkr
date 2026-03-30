package ex5_singleton;

public class Singleton {
	
	// 클래스 내부에서 객체를 생성함(밖에서는 private라서 못부르니, 미리 안에서 만들어두고, static까지 추가)
	private static Singleton singleton = new Singleton();
	
	// private 접근 제한을 갖는 생성자를 선언
	private Singleton() {
		
	}
	
	// 접근 가능한 static 메서드 제작
	public static Singleton getInstance() {
		return singleton;
	}
}
