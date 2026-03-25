package ex6_string;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		
		// String은 참조형이므로 주소값을 저장하는데, 선언 방식에 따라 주소가 달라짐
		// 또한 String은 클래스이고, 클래스 내에는 자주 사용하는 기능들이 메서드 형태로 정의되어 있음
		
		// 묵시적 객체생성
		// 같은 문자열이면 객체를 공유함
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		if (s1 == s2) {
			System.out.println("s1과 s2의 주소가 같습니다");
		}
		
		// 명시적 객체생성
		// 항상 새로운 객체가 만들어진다.
		String s3 = new String("홍길동");
		String s4 = new String("홍길동");
		
		if (s3 != s4) {
			System.out.println("s3와 s4의 주소가 다릅니다");
		}
		
		// 1. 문자열에서 문자 추출하기
		// charAt(index);
		// index : 컴퓨터가 숫자를 세는 방식(0부터 순차적으로 센다.)
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(3); // "프"
		
		// 아래 주민번호를 가진 사람이 남자면 "남자", 여자면 "여자"라고 출력하기
		String ssn = "9201231230123";
		String isMen = switch(ssn.charAt(6)) {
		case '1', '3' -> "남자";
		case '2', '4' -> "여자";
		default -> "**오류**";
		};
		System.out.println("이 사람은 " + isMen + "입니다.");
		
		// 2. 문자열의 길이 측정
		int length = subject.length();
		System.out.println("문자열의 길이 : " + length);
		
		// 3. 특정 문자열을 대체
		// replace("기존", "새로운");
		String newStr = subject.replace("자바", "JAVA");
		System.out.println(newStr);
		
		// 4. 문자열 잘라내기
		// substring(시작 index, 끝 index);
		String str = "동해물과 백두산이 마르고 닳도록";
		System.out.println(str.substring(2,9)); // 끝 index는 포함 x
		
		// 5. 위치 찾기
		// indexOf("문자열");
		// 입력한 문자열이 '시작'되는 위치의 인덱스를 반환함
		int index = subject.indexOf("프로그래밍");
		System.out.println(index); // 3
		
		// 만약 없는 문자열을 찾으려고 한다면?
		
		index = subject.indexOf("안녕하세요");
		System.out.println(index); // 주어진 문자열을 찾지 못했다는 의미로 -1이 나옴
		
		// 6. 문자열을 분리
		// split("기준값"); -> 반환을 Array로 함
		String board = "번호, 제목, 내용, 성명";
		System.out.println(Arrays.toString(board.split(", ")));
		
		// 7. 특정 문자열을 포함하고 있는지?(boolean값 반환)
		//contains("문자열");
		System.out.println(subject.contains("자바"));
		
		
		// Q1. 키보드에서 알파벳을 무작위로 입력받는다.
		// 입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하는 코드 작성하기

		
		// Q1 - 1. CharAt 활용하기
		// 로직
		// 스캐너 + sysout -> 알파벳 문자열 입력받기
		// for문 + length 활용 -> charAt과 인덱스값 이용해서 a인지 아닌지 판별
		// 판별하면서 count하기(int count)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("영어로 된 문자열을 입력해주세요 : ");
//		String aCount = sc.nextLine();
//		int count = 0;
//		
//		for (int i = 0; i < aCount.length(); i++) { // 향상된 for문?
//			if (aCount.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		
//		System.out.println("해당 문자열에는 a가 " + count + "개 들어있습니다.");
		
		// Q1 - 2. Array 활용하기
		// 로직
		// 스캐너 + sysout -> 알파벳 문자열 입력받기
		// 향상된 for문 활용 + count 하기
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.print("영어로 된 문자열을 입력해주세요 : ");
		String aCount = sc.nextLine();
		char[] aCountArray = aCount.toCharArray();
		
		for(char elements : aCountArray) {
			if (elements == 'a') 
			{
				count++;
			}
		}
		
		System.out.println("해당 문자열에는 a가 " + count + "개 들어있습니다.");
		
		// Q2. 문자열을 입력받고 그 문자열을 뒤집어서 원본과 같으면
		// "같습니다" / 다르면 "다릅니다" 출력하기
		
		System.out.println("원본 : ");
		String original = sc.nextLine(); 
		String reverse = "";
		
		for(int i = original.length()-1; i >= 0; i--) {
			reverse += original.charAt(i);
		}
		
		if (original.equals(reverse)) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
	}
}
