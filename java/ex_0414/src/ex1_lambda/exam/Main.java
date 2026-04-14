package ex1_lambda.exam;

public class Main {
	public static void main(String[] args) {
		
		// Main에서 다음의 작업 수행하기
		// - 모든 문자를 대문자로 변환
		// - "out of stock" -> "in stock"으로 변환
		String text = "This product is currently out of stock.";
		
		TextService ts = new TextService();
		StringProcessor sp = x -> x.replace("out of", "in").toUpperCase();
		
		// String result = ts.processText
		// (text, str -> str.replace("out of stock", "in stock").toUpperCase())
		// 요렇게도 가능 -> 요렇게 하면 아래에는 그냥 출력만 하면 ok
		
		System.out.println(ts.processText(text, sp));
	}
}
