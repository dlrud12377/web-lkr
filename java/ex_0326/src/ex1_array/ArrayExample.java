package ex1_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		String cardsOrigin = "1LO2V3E";
		char[] cards = cardsOrigin.toCharArray();
		
		// Q1. 배열에서 문자만 뽑아서 단어 만들기
		// 아스키 코드 활용하기
		
		// 약간 불완전
		String myWord = "";
		for (char elements : cards) {
			if (elements >= 65 && elements <= 90) { // ASCII 코드 상 대문자 영어에 해당하는 영역 65~90
				// "문자"가 숫자를 제외한 모든 값을 의미한다면 조건 : elements < 48 || elements > 57이 되어야 할듯
				myWord += elements;
			}
			// int word = elements;
			// if word >= 65 && word <= 90
			// {myWord = (char)word;} : 형변환 명시가 깔끔한 버전
			
		}
		
		System.out.println("생성된 단어 : " + myWord);
		
		
		// Q2. 변수 money에 10 ~ 5000원 사이의 난수를 발생시켜 넣는다.
		// 단, 1의 자리 숫자는 반드시 0이 되도록 한다.
		// 발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개 필요한지 코드로 작성하기
		// 가능한 적은 수의 동전을 사용하도록 한다.
		// array로 코인 종류마다 개수 따로 저장하기(upgrade)
		
		int[] coin = {500, 100, 50, 10};
		
		int[] coinNum = new int[4];
		
		int money = (int)(499 * Math.random()) * 10 + 10; // 1~499까지의 정수 발생 * 10 + 10 -> 10~5000
		
		System.out.println("현재 금액 : " + money);
		
		int count = 0;
		
		for(int i = 0; i < coin.length; i++) {
			if (money >= coin[i]) {
				coinNum[i] = money / coin[i];
				count += coinNum[i];
				money -= coin[i] * coinNum[i]; // money = money % coin[i]로 해도 무방
				System.out.printf("%d원 동전의 개수는 %d개 입니다.\n" , coin[i], coinNum[i]);
			}	
		}

		System.out.printf("동전의 총 개수는 %d개 입니다.\n", count);
		
		// Q3. 키보드에서 배열의 길이를 입력받는다.
		// 입력받은 배열의 길이만큼 알파벳을 요소로 넣는다.
		// 배열의 모든 요소를 출력한다.
		// 배열의 길이 : 5
		// -> ABCDE / 아스키코드 사용해야할듯?
		// 알파벳 개수를 넘어가는 숫자 or 음수를 입력하면 다시 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		int arrayLength;
		
		do {
			System.out.print("알파벳 배열의 길이를 입력해주세요(1~26) : ");
			arrayLength = sc.nextInt();
			
			if (arrayLength < 1 || arrayLength > 26) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요");
			} // 배열의 길이를 입력할 때, 알파벳 개수인 26개를 넘어버리면 재입력하도록
		}
		while (arrayLength < 1 || arrayLength > 26); // do-while로 arrayLength를 입력받는 부분이 먼저 진행되도록
		
		
		char[] capitalWords = new char[arrayLength]; // 알파벳 담을 배열 선언

		int asciiCount = 65;
		
		for (int i = 0; i < arrayLength; i++) {
			capitalWords[i] = (char)asciiCount;
			asciiCount++;
			// System.out.println(capitalWords[i] = (char)asciiCount++); - 이렇게 줄여 써도 됨
		}
		
		System.out.println(capitalWords);
		
		
		// Q4. 로또번호 구하기
		// 1 ~ 45 사이의 난수를 발생시켜 로또번호 6자리를 만드는 코드 작성하기
		// 번호가 중복되는지 비교하기
		
		// Q4 - 1. for문
//		int[] lotteryNum = new int[6];
//		
//		outer : for (int i = 0; i < lotteryNum.length;) {
		
			// 난수를 뽑아 배열에 저장
//			lotteryNum[i] = (int)(Math.random() * 44) + 1;
		
			// 저장한 수가 기존의 수와 같은지 확인
//			for (int j = 0; j < i; j++)
//				if (lotteryNum[i] == lotteryNum[j]) 
//			{
//					System.out.println("겹친 수 발생");
//		
//					// 같으면 i++ 생략 -> 기존 인덱스에 랜덤 난수를 다시 덮어씌움
//					continue outer; 
//				}
//			// 기존 수와 같은 값이 없었으면 i 증가시킨 후 다음바퀴
//			i++;
//			}
//		
//		System.out.println("현재 로또번호는 " + Arrays.toString(lotteryNum) + "입니다");
		
		// Q4 - 2. while문
		
		int[] lotteryNum = new int[6];
		int i = 0;
		
		outer : while (i < 6) {
			lotteryNum[i] = (int)(Math.random() * 44) + 1;
			for (int j = 0; j < i; j++)
				if (lotteryNum[i] == lotteryNum[j]) {
					System.out.println("겹친 수 발생");
					continue outer;
				}
			i++;
		}
		
		System.out.println("현재 로또번호는 " + Arrays.toString(lotteryNum) + "입니다");
	}
}
