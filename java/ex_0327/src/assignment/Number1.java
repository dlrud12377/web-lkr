package assignment;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		//Q1. 키보드에서 입력받아 연속된 문자를 문자+개수 형태로 압축하기.
		//ex) aaabbc => a3b2c1
		// 로직
		// 입력받기
		// 연속된 값 찾아내기(인덱스 이용) -> 이전 문자와 다음 문자가 같으면 count수 증가
		// 연속되지 않은 값을 만나면 현재 문자열과 count수 출력 + count는 0으로 초기화
		
		
		
		// 키보드에서 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요(띄어쓰기 x) : ");
		String string = sc.nextLine();
		
		// 카운트 지정
		int count = 1; // 연속되는 게 없을 경우 1을 출력해야 하므로
		
		// 연속값 찾기
		for(int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i+1)) {
				count++;
			}
			else {
				System.out.printf("%s%d", string.charAt(i), count); // 반복된 문자 + count수 출력
				count = 1; // 다를 경우 카운트 초기화
			}
		}
		
		// 끝처리 : 마지막 수는 for문에서 돌아가지 않으므로 끝 문자열과 같은지 다른지를 체크해주어야 함
		
		if (string.charAt(string.length() - 1) != string.charAt(string.length()-2)) {
			System.out.printf("%s%d", string.charAt(-1), 1);
		}
		
	}

}
