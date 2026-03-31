package ex3_access.method.package2;

import ex3_access.method.package1.A;

// 다른 패키지 클래스
public class C {
	// C의 객체를 만들 때 같이 실행이 되는 효과
	public C() {
		A a = new A();
		
		a.field1 = 1;
		// a.field2 = 1; // default
		// a.field3 = 1; // private
		
		a.method1();
		// a.method2(); // default
		// a.method3(); // private
		
	}
}
