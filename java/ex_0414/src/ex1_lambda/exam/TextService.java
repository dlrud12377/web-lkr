package ex1_lambda.exam;

public class TextService {
	String processText(String text, StringProcessor processor) {
		String result = processor.process(text);
		return result;
	}
}
