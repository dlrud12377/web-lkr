package ex1_array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayExample {
	public static void main(String[] args) {
		// 1. 2차원 배열 : 1차원 배열을 요소로 갖는 배열
		
		// 2. 2차원 배열의 초기화
		int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
		
		// 3. 2차원 배열의 선언과 생성
		//  - 1차원 배열과 마찬가지로 길이를 지정해줘야 한다.
		int[][] ar = new int[2][3]; // 바깥 2개, 안쪽 3개씩
		
		// 4. 배열의 각 공간에 접근하는 방법
		// arr의 5에 접근하고 싶을 때?
		System.out.println(arr[1][1]); // 2번째 묶음(인덱스 1) 2번째 수(인덱스 1)
		
		// (1). 전부 출력하려면(정석)
		
		for (int i = 0 ; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		} // 1 2 3 4 5 6 7 8 9 
		System.out.println();
		
		// (2). Arrays.toString() 사용 - for문을 하나 줄임
		for (int i = 0 ; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		} /* 
		[1, 2, 3]
		[4, 5, 6]
		[7, 8, 9]
		*/
		
		// (3). Arrays.deepToString() : 다차원 배열의 값 출력 메서드(Arrays)
		System.out.println(Arrays.deepToString(arr));
		// [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		
		
		// 5. 각 1차원 배열에 들어가는 데이터의 개수가 다른 경우
		
		// 2차원 배열에 들어가는 요소 개수만 정해두고, 1차원 배열은미리 결정하지 않고 공백으로 둔다.
		int[][] iAr = new int[3][]; 
		
		// 각 1차원 배열의 들어가는 데이터의 개수를 따로 지정할 수 있다.
		iAr[0] = new int[1]; // 1번째 배열은 1개
		iAr[1] = new int[2]; // 2번째 배열은 2개
		iAr[2] = new int[3]; // 3번째 배열은 3개
		
		// iAr = {{x}, {x, x}, {x, x, x}}의 형식
		
		iAr[0][0] = 100;
		iAr[1][0] = 200;
		iAr[1][1] = 300;
		iAr[2][0] = 400;
		iAr[2][1] = 500;
		iAr[2][2] = 600;
		
		// Q1. 다음 2차원 배열의 모든 요소의 총 합을 구하세요
//		int[][] num = {{1}, {2,3}, {4,5,6}, {7,8,9,10}};
//		
//		// Q1-1. 향상된 for문 활용
//		
//		// 합을 담을 변수 생성
//		int sum = 0;
//
//		// 향상된 for문 활용 (for each)
//		for (int[] elements : num) {
//			for (int realNum : elements) {
//				sum += realNum;
//			}
//		}
//		
//		System.out.println("요소들의 총합 : " + sum);
		
		
		// Q1-2. 일반 for문 활용
		
		int[][] num = {{1}, {2,3}, {4,5,6}, {7,8,9,10}};
		
		// 합을 담을 변수 생성
		int sum = 0;

		// 일반 for문 활용, 데이터의 개수가 다르므로 .length 변수 활용
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
		}
		
		System.out.println("요소들의 총합 : " + sum);
		
		
	// Q2. 학생들의 수학과 영어 성적을 등록하는 프로그램이 있다.
	// 프로그램을 실행하면 몇명의 정보를 저장할 것인지를 입력한 후,
	// 입력받은 수 만큼 학생들의 이름과 수학, 영어 성적을 입력받는 프로그램 작성하기
	
	// 스캐너 객체 생성
	Scanner sc = new Scanner(System.in);
	
	// 등록할 인원 수 받아오기
	System.out.print("등록할 인원 수 : ");	
	int studentNum = sc.nextInt();
	
	// 받은 인원수로 array 객체 생성(사람이름용, 수학/영어 성적용)
	
	// 점수저장용
	int [][] studentScore = new int[studentNum][2]; // 2: 과목 수. 늘어나면 변수 하나 만드는게 좋을듯
	
	// 이름저장용
	String [] studentName = new String[studentNum];
	
	// 입력받은 수 만큼 for문 돌리기(length 활용)
	for (int i = 0; i < studentNum; i++) {
		
		// 이름 입력
		System.out.print("이름 : ");
		studentName[i] = sc.next();
		
		// 성적 입력
		System.out.print("수학 : ");
		studentScore[i][0] = sc.nextInt();
		
		System.out.print("영어 : ");
		studentScore[i][1] = sc.nextInt();
		
		System.out.println("-----------------");
		}
	
	// 출력
	
	System.out.println(studentNum + "명 등록 완료!");
	for (int i = 0; i < studentNum; i++) {
		System.out.printf("%s : %d %d\n", studentName[i], studentScore[i][0], studentScore[i][1]);
	}
		
	// ** 향상된 for문 / 구조만 알고있기
	// for (type i : 배열) {실행할 코드} -> 배열 안에 있는 i타입 변수를 반복문 안에서 사용하여 진행한다.
	
	
		
	

	
	}
}
