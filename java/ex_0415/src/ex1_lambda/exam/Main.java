package ex1_lambda.exam;

import java.util.function.Consumer;

public class Main {
	
	static void executePrint(Consumer<String> action, String message) {
		action.accept(message);
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		executePrint(printer::print, "람다식 전달 연습");
		// Main클래스 안의 메서드이므로 그냥 Main.ex~가 아니라 ex 바로 진행해도 됨
	}
}
