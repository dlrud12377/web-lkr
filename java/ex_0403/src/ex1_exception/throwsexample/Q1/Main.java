package ex1_exception.throwsexample.Q1;

import java.util.Scanner;

//Main클래스에서 문자열을 입력받아 Converter 객체를 이용해 호출한다.
//숫자로 변환할 수 없으면 "숫자로 변환할 수 없습니다." 출력하기

public class Main {
	public static void main(String[] args) {
		Converter c = new Converter();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		String data = sc.nextLine().replaceAll(" ", ""); // java strip?
		// https://hianna.tistory.com/526
		sc.close();
		
		try {
			int parsed = c.toInt(data);
			System.out.println("정상적인 숫자 출력 : " + parsed);
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
			System.out.println("예외 처리 + " + e.toString());
		}
		catch(Exception e) {
			System.out.println("예상하지 못한 예외가 발생했습니다.");
			System.out.println("예외 처리 + " + e.toString());
		}

	}
}
