package ex3_access.method.package1;


// 같은 패키지의 다른 클래스
public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; -> private라서 불가
		
		a.method1();
		a.method2();
		// a.method3(); -> private라서 불가
	}
}
