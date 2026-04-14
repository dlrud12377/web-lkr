package ex1_lambda;

public class Main {
	public static void main(String[] args) {
		
		// CalculatorService 객체 생성 후 내부 Calculator 람다식으로 부르기
		CalculatorService cs = new CalculatorService();
		
		Calculator c = (a,b) -> a + b;
		
		cs.execute(c);
		
		cs.execute((a,b) -> a-b); // 요렇게도 쓸 수 있음
		
		// 람다식 반환받아서 저장 후 사용도 가능
//		Calculator add = cs.getCalculator("add");
//		Calculator sub = cs.getCalculator("sub");
		
		System.out.println(cs.getCalculator("add").calc(10, 7));
		
		System.out.println(cs.getCalculator("sub").calc(8, 4));
	}
}
