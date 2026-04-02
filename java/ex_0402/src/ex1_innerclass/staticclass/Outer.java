package ex1_innerclass.staticclass;

// 정적 내부 클래스를 사용하는 이유
// 관련 있는 클래스들을 논리적으로 묶기 위해(논리적 : 역할이 연결되어 있음)
// 바깥 객체 참조가 필요 없는 내부 구조를 만들기 위해

public class Outer {
	
	int a = 10; // normal field(멤버 변수)
	static int b = 20;  // static field(클래스 변수)
	
	// 바깥 클래스와 완전히 단절된 것은 아니고, 필요하면 객체를 전달받아 사용이 가능
	static class Inner{
		// 정적 내부 클래스는 Outer 객체에 연결되어 있지 않기 때문에
		void print() {
			// System.out.println(a); -> 이게 오류가 남
			System.out.println(b); // 가능
		}
		
		void print(Outer outer) {
			System.out.println(outer.a); // 이건 가능. 객체가 생성되었다는 가정 하에 진행되는 상황
		}
	}
}
