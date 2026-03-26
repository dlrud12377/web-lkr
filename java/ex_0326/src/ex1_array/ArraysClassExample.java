package ex1_array;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysClassExample {
	public static void main(String[] args) {
		// 1. 배열의 출력
		// toString();
		// 반복문의 도움 없이 배열의 요소를 출력할 수 있도록 도와줌
		// 배열에 들어있는 모든 요소를 하나의 문자열로 묶어서 출력해준다.
		
		int[] arr = {1, 6, 3, 10, 4, 7, 5, 2, 9, 8};
		
		System.out.println(Arrays.toString(arr));
		
		// 2. 배열의 정렬
		// 2-1. 오름차순 정렬 : sort() (기본)
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 2-2. 내림차순 정렬
		// Comparator.reverseOrder();
		//기본자료형 배열은 내림차 할 수 없다.
		// 기본타입의 클래스형인 Wrapper클래스가 있다.
		
		Integer[] arr2 = {1,6,3,10,4,7,5,2,9,8};
		// Arrays.sort(내림차순할 배열, Comparator.reverseOrder());
		Arrays.sort(arr2, Comparator.reverseOrder());
		
		for (int i : arr2) {
			System.out.print(i + " ");
		} // toString 사용해도 됨
		
		System.out.println();
		
		// 3. 배열이 같은지 비교
		// equals()
		int[] arr1 = {1,2,3};
		int[] arr3 = {1,2,3};
		
		System.out.println("두 배열이 같은가? :" + Arrays.equals(arr1, arr3));
		
		// 3. 배열의 복사
		// 배열은 한 번 생성하면 길이를 변경할 수 없음
		// 더 많은 데이터를 저장하거나 사본 배열을 생성하려면 우선 배열을 복사해야 됨
		
		int[] arr01 = {1, 2, 3};
		
		// 3-1. 얕은 복사(Shallow Copy)
		// 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 같이 변경된다
		
		int[] arr02 = arr01; 
		// 주소 값을 공유함. stack 위의 내부값이 바뀌면 함께 바뀜
		
		arr02[1] = 100;
		
		System.out.println(Arrays.toString(arr01)); // [1, 100, 3]
		// arr02의 값을 건드렸을 때 arr01의 값도 바뀌었음
		
		// 3-2. 깊은 복사(Deep Copy)
		// 복사된 배열이나 원본 배열이 변경될 때 서로 간의 값은 바뀌지 않는다
		
		int cards[] = {1, 6, 4, 5, 3, 2};
		int newCards[] = new int[cards.length];

		
		// 반복문을 이용한 깊은 복사
		for (int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i]; // 주소 내부값 자체를 하나씩 옮기는 작업 -> stack 영역의 기본값과 연결이 됨
		}
		
		// copyOf 메서드를 이용한 깊은 복사
		int newCards2[] = Arrays.copyOf(cards,cards.length);
		
		newCards[1] = 100;
		
	    System.out.println("cards 배열 : " + Arrays.toString(cards));
	    System.out.println("newCards 배열 : " + Arrays.toString(newCards));
	    System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		
	}
}
