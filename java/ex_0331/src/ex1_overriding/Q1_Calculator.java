package ex1_overriding;


// 부모 클래스
public class Q1_Calculator {
	
	// 반지름을 외부에서 받아 원의 넓이를 반환하는 areaCircle 메서드 작성하기
	
	public double areaCircle(double radius) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * Math.pow(radius, 2);
	}
	
}
