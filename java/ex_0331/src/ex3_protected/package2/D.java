package ex3_protected.package2;

import ex3_protected.package1.A;

public class D extends A {
	public D() {
		super(); // A클래스의 생성자 호출
	}
	
	public void method1() {
		super.method();
		this.field = super.field;
		// protected 접근제한자는 상속관계라면 super를 이용해서 간접적으로 사용 가능
	}
	
	public void method2() {
		//A a = new A();
		//a.field = "value";
		//a.method();
	}
}
