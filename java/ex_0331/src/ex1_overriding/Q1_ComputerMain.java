package ex1_overriding;

public class Q1_ComputerMain {

	public static void main(String[] args) {
		
		double r = 5.0;
		
		// 각각의 areaCircle() 호출해보기
		
		Q1_Calculator calc = new Q1_Calculator();
		double result1 = calc.areaCircle(r);
		System.out.println(result1);
		// Calculator 객체의 areaCircle() 실행
		// 78.53981633974483
		
		
		Q1_Computer comp = new Q1_Computer();
		double result2 = comp.areaCircle(r);
		System.out.println(result2);
		// Computer 객체의 areaCircle() 실행
		// 78.5398		
		

	}

}
