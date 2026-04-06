package ex7_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PattternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
		String data = "010-883-2848";
		boolean result = Pattern.matches(regExp, data);
		
		System.out.println(result);
		
		// Q1. 주민등록번호 정규식 만들기
		
		// 조건 제대로 만들어보기
		// 1. 년도는 4의 배수가 2월 29일로 생각
		// 2. 달은 12월까지
		// 3. 일은 30일~31일까지
		// 어우 빡세다
		
		// 걍 단순구현(자리수만 맞추기)
		regExp = "[0-9]{6}-[0-9]{7}";

		String ssn = "010229-1234567";
		
		result = Pattern.matches(regExp, ssn);
		
		System.out.println(result);
		
//		// 제대로 구현하기 - 걍 매치 안쓰고 하는게..
////		regExp = "[0-9]{2}(0[1-9]|1[0-2])([12][0-9]|" 으악
//		
//		String birth = ssn.substring(0,6);
//		
//		int year = Integer.parseInt("20" + birth.substring(0,2));
//		System.out.println("생일 : " + year);
//		
//		int month = Integer.parseInt(birth.substring(2,4));
//		System.out.println("월 : " + month);
//		
//		int day = Integer.parseInt(birth.substring(4,6));
//		System.out.println("일 : " + day);
//		
//		try {
//			LocalDate.of(year, month, day);
//			
//		} catch (Exception e) {
//			System.out.println("잘못된 날짜입니다.");
//		}
		
		// 숫자만 입력되었는지 검사
		// 문자열이 숫자로만 이루어져 있는지 검사하는 코드
		// "12345"는 통과
		// "12a45"는 실패
		
		String str = "1235234";
		regExp = "[0-9]+";
		result = Pattern.matches(regExp, str);
		
		System.out.println(result);
		
		// 위 내용을 단순 for문으로 구현하려면
		result = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				result = false;
				break;
			}
		}
		System.out.println(result);

		
		// 영어 소문자로 시작
		// 영어 소문자 + 숫자만 허용
		// 5 ~ 12자
		
		str = "0cgh1j32ld";
		regExp = "[a-z]([0-9a-z]{4,11})";
		
		result = Pattern.matches(regExp, str);
		
		System.out.println(result);
		
		// 이메일 형식 검사
		// 아이디부분 : 영문, 숫자, _ 까지 허용
		// 도메인 포함(@, ., com or net or ai)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력 : ");
		str = sc.nextLine().replace(" ", "");
		regExp = "[0-9a-zA-Z_]{1,}@[0-9a-zA-Z]{2,63}.(com|net|ai|io)";
		
		result = Pattern.matches(regExp, str);
		System.out.println(result);
		
		// xn을 제외? - 진짜 규정에 맞춰서 만들어보고싶은데
		// 두글자를 한번에 체크해야 하는 경우에는 어려운듯..
	}
}
