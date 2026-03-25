package ex7_array;

public class ArrayExample {
	public static void main(String[] args) {
		// {1, 2, 3, 4, 5}; -> 초기화 리스트
		// 배열을 선언함과 동시에 초기화 리스트를 사용하는 것이 가능하다.
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arr2; // 배열 선언
		
		// arr2 = {100, 200, 300}; -> 선언 후 초기화 리스트를 대입할 수는 없다.
		
		// new 연산자를 통한 배열의 생성
		
		// 값이 들어있지는 않지만 후에 값을 저장할 목적으로 배열을 미리 생성할 수 있음
		
		int[] ar = new int[5]; // 5개의 정수 원소를 포함 가능한 배열을 생성
		
		// new 연산자로 배열을 처음 생성하면 배열 항목은 기본값으로 초기화된다.
		// 정수형 : 0
		// 실수형 : 0.0
		// 문자형 : ' '
		// 참조형 : null
		
		 ar[0] = 100;
		 ar[1] = 200;
		 ar[2] = 300;
		 ar[3] = 400;
		 ar[4] = 500;
		 
		 System.out.println(ar[0]);
		 System.out.println(ar[1]);
		 System.out.println(ar[2]);
		 System.out.println(ar[3]);
		 System.out.println(ar[4]); // 지루하고 현학적임
		 
		 // for문
		 
		 for (int i = 0; i < ar.length; i++) { // 배열의 length는 메서드가 아닌 변수이므로 소괄호가 붙지 않음
			 System.out.println(ar[i]);
		 }
		 
		 // 배열 iAr에 들어있는 모든 요소의 총 합을 구하시오
		 
		 int[] iAr = {1,2,3,4,5,6,7,8,9,10};
		 int sum = 0;
		 
		 for (int i = 0; i < iAr.length; i++) {
			 sum += iAr[i];
		 }
		 
		 System.out.printf("iAr 내 모든 수의 합 : %d\n", sum);
		 
		 // 1. 문자열의 불변의 법칙
		 // 2. String을 이용한 문제 1개 출제하기
		 // 배우지 않은 method 사용해도 ok
	}
}
