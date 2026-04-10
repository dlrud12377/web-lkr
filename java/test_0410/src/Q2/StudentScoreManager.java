package Q2;

//학생 1명의 이름과 3과목 점수를 입력받아
//총점, 평균, 합격 여부를 출력하는 프로그램을 작성한다.

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		String studentName; // 학생 이름
		int javaScore; // java 점수
		int dbScore; // db 점수
		int htmlScore; // html 점수
		
		// 학생의 이름과 과목 점수 입력받기
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 이름
		System.out.print("이름을 입력해주세요 : ");
		studentName = sc.next();
		
		// java
		System.out.print("Java 점수를 입력해주세요 : ");
		javaScore = sc.nextInt();
		
		// DB
		System.out.print("DB 점수를 입력해주세요 : ");
		dbScore = sc.nextInt();
		
		// HTML
		System.out.print("HTML 점수를 입력해주세요 : ");
		htmlScore = sc.nextInt();
		System.out.println(); // 버퍼 정리
		
		// 총점, 평균(실수형) 계산하기
		
		// 총점
		int totalScore = javaScore + dbScore + htmlScore;
		
		// 평균(총점 / 과목수(실수))
		double average = totalScore / 3.0;
		
		// 이름, 총점, 평균 출력하기
		System.out.println("이름: " + studentName);
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + average);
		
		// 합격, 불합격 결정하기
		
		// 60점 이상 if
		if (average >= 60) {
			System.out.println("결과: 합격");
		}
		else { // 60점 미만
			System.out.println("결과: 불합격");
		}
		// 가정을 통해 평균 0점 이하, 100점 이상은 처리하지 않았습니다
		
	}
}
