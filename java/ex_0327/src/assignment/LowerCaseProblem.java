package assignment;

import java.util.Scanner;

public class LowerCaseProblem {
	public static void main(String[] args) {
//		1. 영어 문장을 하나 입력받고, 이 문장의 모음의 개수를 센 뒤, 모음이 단어마다 몇 개 들어있는지 확인하는 코드를 작성하시오.
//	    	(1). toCharArray(), toLowerCase(), split(’ ’)을 이용하는 것이 좋습니다.
//	    	(2). 여기서 의미하는 ‘단어’는 띄어쓰기로 구분되는 단위를 말합니다.(ex.)There is a cat → There, is, a, cat
		// 심화 -> 몇번째 단어 어디에 위치하는지 출력하는 코드를 작성하시오.
		
		// 문장을 입력받기 위한 단계(스캐너 객체 등록, 문장 입력받기
		Scanner sc = new Scanner(System.in); // 쓰고 Ctrl+Shift+O
		
		System.out.print("모음을 조사할 문장을 선택해주세요 : ");
		String sentence = sc.nextLine(); // There is a cat
		
		// toLowerCase를 이용하여 소문자로 변환 ( 나중에 검사를 편하게 하기 위함)
		String lowerSentence = sentence.toLowerCase(); // there is a cat
		
		// String을 split을 이용해 쪼개주기
		// There is a cat -> { {t,h,e,r,e} , {i,s}, {a}, {c,a,t}}
		String[] senSplit = lowerSentence.split(" "); // 단어 단위로 String객체들이 들어가있는 배열 생성 -> {"there", "is", "a", "cat"}
		
		// for문과 toCharArray를 이용하여 각 객체들을 다시 쪼개줌
		char[][] charSentence = new char[senSplit.length][]; 
		
		for (int i = 0; i < senSplit.length; i++) {
			charSentence[i] = senSplit[i].toCharArray(); // 쪼개서 넣기 ({ {t,h,e,r,e} , {i,s}, {a}, {c,a,t}})
		}
	
		
		// count 변수를 생성하고 index를 이용해 이중 for문 사용하여 검사
		int count;
		
		for (int i = 0; i < charSentence.length; i++) {
			count = 0; // 단어 하나 셀 때마다 count 변수 초기화해주기
			for (int j = 0; j < charSentence[i].length; j++) {
				if (charSentence[i][j] == 'a'
					|| charSentence[i][j] == 'e'
					|| charSentence[i][j] == 'i'
					|| charSentence[i][j] == 'o'
					|| charSentence[i][j] == 'u') {
					count++;
				}
				else {
					continue;
				}
					
			}
			
			System.out.println((i+1) + "번째 단어에는 모음이 " + count + "개 들어있습니다.");
		}
			
	}
}
