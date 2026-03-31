package ex6_inheritance;

public class A {
	void hello() {
		System.out.println("A");
	}
}

class B extends A {
	 
}

class C extends A { // 한 부모에게서 여러 자식 클래스가 상속받는건 가능
	
}

//class D extends B,C{ 2개 상속은 안됨 - 상속받은 클래스들 중에서 어떤 메서드를 쓸건지 모호해짐
	
//}