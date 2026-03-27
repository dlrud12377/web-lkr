package ex2_method;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int result = calc.getResult(5, 8, "/");
		
		System.out.println("계산 결과 : " + result);
	}
}
