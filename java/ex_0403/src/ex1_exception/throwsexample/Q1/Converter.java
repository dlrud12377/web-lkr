package ex1_exception.throwsexample.Q1;


//문자열 정수 변환 프로그램
//Converter클래스
//toInt(String str)메서드를 만든다.
//ㄴ 문자열을 정수로 만들어서 반환한다.
//메서드 안에서 예외를 처리하지 않고 떠넘긴다.

public class Converter {
	public int toInt(String str) throws NumberFormatException  {
		int result = Integer.parseInt(str);
		return result;
	}
}
