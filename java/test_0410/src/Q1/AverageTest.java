package Q1;

/*	
[1. 프로그램 설계서 확인]

기능: 정수형 배열에 저장된 점수들의 평균을 계산하여 출력한다.
조건 1: 배열 scores에는 {80, 90, 75, 100}이 저장되어 있다.
조건 2: 총합을 구하기 위해 for 반복문을 사용해야 한다.
조건 3: 평균은 소수점까지 표현될 수 있도록 실수형(double)으로 계산한다.
*/

public class AverageTest {

	   public static void main(String[] args) {

	      int[] scores = {80, 90, 75, 100};

	      int sum = 0;



	      for (int i = 0; i < scores.length; i++) { // 범위 수정( ≤ → < )

	         sum += scores[i];

	         }



	      double average = sum / (double)scores.length; // average 변수타입 double, 나누는 수 double 형변환. sum은 나눠지는 대상이라 자동 형변환이 됨



	      System.out.println("평균 점수: " + average);

	      }

	}
