package ex1_list.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	
	public static void main(String[] args) {
		
		// Integer 타입의 리스트 객체 만들기
		List<Integer> numbers = new ArrayList<>();
		
		// 리스트에 (1 ~ 30 사이의) 난수 10개 넣기 + 리스트에 담긴 데이터 중 홀수의 총합을 구하시오
		// 두 과정 한번에
		
		int oddSum = 0;
		int ranNow;
		for (int i = 0; i < 10; i++) {
			ranNow = (int)(Math.random()*30) + 1;
			numbers.add(ranNow);
			if (ranNow % 2 != 0) {
				oddSum += ranNow;
			}
		}
		// for문을 나누면 get을 써야되긴함
		System.out.println("출력된 난수 리스트 : " + numbers);
		System.out.println("리스트 중 홀수의 합 : " + oddSum);
		
	}
}
