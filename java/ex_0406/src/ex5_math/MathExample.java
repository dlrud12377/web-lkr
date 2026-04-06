package ex5_math;

import java.util.Arrays;

public class MathExample {
	public static void main(String[] args) {
		// ceil() : 올림
		double v1 = Math.ceil(5.3);
		System.out.println(v1); // 6.0
		
		// floor() : 내림
		double v2 = Math.floor(5.3);
		System.out.println(v2); // 5.0
		
		// abs() : 절댓값
		double v3 = Math.abs(-10);
		System.out.println(v3); // 10.0
		
		// max() : 최대값찾기
		long v4 = Math.max(3, 7);
		System.out.println("더 큰 수 : " + v4); // 더 큰 수 : 7
		
		// min() : 최솟값찾기
		long v5 = Math.min(3, 7);
		System.out.println("더 작은 수 : " + v5); // 더 작은 수 : 3
		
		// Q1. 아래 주어진 배열에서 최대최소 찾기
		
		int arr[] = {5,2,9,1,7};
		
		int max = arr[0]; // max값 저장(초기값 : 인덱스 첫번째 값)
		int min = arr[0]; // min값 저장(초기값 : 인덱스 첫번째 값)
		
		
		// Q1-1. 정석 풀이
		for (int number : arr) {
			if (number >= max) {
				max = number;
			}
			else if (number <= min) {
				min = number;
			}
		}
		
		System.out.println("배열 내 수의 최대값 : " + max + ", 최소값 : " + min);
		
		// Q1-2. max, min 메서드를 사용하여 최대값과 최소값 구하기 
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("배열 내 수의 최대값 : " + max + ", 최소값 : " + min);
		
		// Q1-2. 깊은 복사와 sort 메서드 활용하기
		int[] arr2 = Arrays.copyOf(arr,arr.length); // 깊은복사 활용 - 원본에 영향 안끼치게
		Arrays.sort(arr2); // 오름차순
		
		System.out.println("배열 내 수의 최대값 : " + arr2[arr2.length-1] + ", 최소값 : " + arr2[0]);
		
		
		// round() : 소숫점 첫째자리에서 반올림
		System.out.println(Math.round(3.15)); // 3
		
		// 내가 셋째자리에서 반올림을 하고싶다면?
		double pi = 3.14159;
		double result2 = Math.round(pi*100)/100.0; // 원하는 위치에서 반올림을 할 수 있게 10의 제곱수를 곱하고, 반올림 후에 곱한 만큼 나눠줌
		System.out.println(result2); // 3.14
		
		// pow(a,b) : a의 b제곱
		System.out.println(Math.pow(2,3)); // 2^3 = 8.0
		
		// sqrt() : 제곱근
		System.out.println(Math.sqrt(9.0)); // root(9) = 3.0
		
		// random() : 0.0 <= x < 1.0 의 랜덤한 난수 출력
		// Q2. random 사용해서 10 ~ 20사이의 수 출력하기
		int num = (int)(Math.random()*11) + 10; // 랜덤난수 * 원하는 수의 범위 + 범위 시작값
		System.out.println(num);
		
		// Q3. 두 점 사이의 거리를 구하세요
		// x1 = -5, x2 = 8
		int x1 = -5;
		int x2 = 8;
		
		int distance = Math.abs(x1-x2);
		System.out.println("두 점 사이의 거리 : " + distance);
		
		// Q4. 물건 53개를 한 박스에 8개씩 담으려고 한다.
		// 필요한 박스의 개수를 구하시오.
		int item = 53;
		int boxsize = 8;
		
		int result = Math.ceilDiv(item, boxsize); // (int)Math.ceil(item/(double)boxsize);가 정석
		System.out.println(result);
		
		
	}
}
