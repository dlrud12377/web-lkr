package ex1_exception;

import java.util.Scanner;

// NullPointerException : 참조 변수가 null인 상태에서 필드나 메서드에 접근할 경우
// 발생하는 예외

public class ExceptionHandlingExample1 {
	
	// 문자열 데이터를 전달받아 문자열의 길이가 얼마인지 출력하는 메서드 작성
	public static void printLength(String sentence) {
		System.out.println("문자열의 길이(띄어쓰기 포함) : " + sentence.length());
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열을 입력하세요 : ");
//		String sentence = sc.nextLine();
//		
//		System.out.println("\n프로그램 시작");
//		printLength(sentence);
//		System.out.println("프로그램 종료\n");
		// sentence 자리에 null을 넣어서 NullPointerException이 발생하면 프로그램 종료가 뜨지 않음
		// 예외 이후의 모든 코드는 실행 중지 -> 그래서 try를 사용
		
		try {
			// 예외 발생 가능 코드 -> try에 넣어야 함			
			System.out.println("\n프로그램 시작");
			printLength(null);
			System.out.println("예외가 발생하면 이 코드는 뜨지 않습니다.");
		}
		catch(Exception e){
			System.out.print("발생한 예외 정보 : ");
			System.out.println(e.getMessage());
			// sysout(e.getMessage) : 예외가 발생한 이유만 반환
			// sysout(e.toString()) : 예외의 종류도 반환
			// e.printStackTrace() : 예외 관련 정보를 전부 띄워줌(예외 발생 위치 추적 정보까지)
			System.out.println("에러가 발생했습니다."); // 에러 발생 사실만 띄워줘도 될 때, 따로 전달할 말이 있을때
		}
		finally {
			System.out.println("예외가 발생하든 말든 실행되는 영역");
			System.out.println("프로그램 종료\n");
		}
	}
}
