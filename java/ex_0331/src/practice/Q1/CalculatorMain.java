package practice.Q1;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c = new CalPlus();
		System.out.println("CalPlus : " + c.getResult(16, 14));
		
		c = new CalMinus();
		System.out.println("CalMinus : " + c.getResult(30, 15));
	}
}
