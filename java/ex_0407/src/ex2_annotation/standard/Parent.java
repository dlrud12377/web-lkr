package ex2_annotation.standard;

public class Parent {
	public void method() {};

}

class Child extends Parent{ 
	
	@Override // 상속 관계에서 메서드를 재정의할 때 쓰는 어노테이션
	public void method() {
		System.out.println("오버라이딩된 메서드");
	}
}
