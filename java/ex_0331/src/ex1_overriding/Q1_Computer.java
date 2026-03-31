package ex1_overriding;

public class Q1_Computer extends Q1_Calculator {
	public double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return 3.141592 * radius * radius;
	}
}
