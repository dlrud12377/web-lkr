package ex3_access.package1;

public class E {
	// D와 같은 패키지의 클래스
	
	D d1 = new D(true); // default
	D d2 = new D(1); // public
	// D d3 = new D("헬로우"); // private -> 안됨
}
