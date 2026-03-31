package ex4_class_casting;

class Parent {
	public void method1() {
		System.out.println("부모 메서드1");
	} // 부모 클래스에만 있는 메서드
	
	public void method2() {
		System.out.println("부모 메서드2");
	} // 공통 메서드
}

class Child extends Parent {
	
	// 자식 타입에만 있는 필드
	int x = 30;
	
	@Override
	public void method2() {
		System.out.println("자식 메서드2");
	} // 공통 메서드(오버라이딩)
	
	public void method3() {
		System.out.println("자식 메서드3");
	} // 자식 메서드에만 있는 메서드
}

public class UpCastingExample { // 파일 이름과 일치하는 클래스에만 public 붙일 수 있음
	public static void main(String[] args) {
		Child child = new Child();
		
		// 부모타입으로 변환
		Parent parent = child;
		
		parent.method1();
		parent.method2(); // 오버라이딩 된 메서드가 호출됨(자동 타입 변환이 일어남)
		// parent.method3(); -> 자식 클래스에 선언된 메서드를 호출하는 것은 불가능
		// parent.x -> 필드 역시 불가능
		
		// 자식 객체를 부모타입으로 변환하면
		// 자식클래스에 정의한 멤버(필드, 메서드)를 사용할 수 없다. (오버라이딩 된거만 가능)
		// -> 메서드의 경우는 실제 값 및 정보에 기반하여 진행이 되기 때문에, 자식 변수에 저장되어있는 오버라이딩 메서드가 나가긴 함
		
		// 만약 부모타입으로 변환된 상태에서 자식타입만 가지고있는 메서드를 쓰려면 강제형변환이 필요
		((Child)parent).method3(); // parent를 입시로 자식타입으로 강제 형변환 
		
		// 영구 변환
		Child c2 = (Child)parent;
		c2.x = 100;
	}
}
