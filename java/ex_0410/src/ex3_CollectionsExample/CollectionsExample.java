package ex3_CollectionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers); // [30, 10, 20] - 넣은 순
		
		// 오름차순 정렬
		Collections.sort(numbers);
		
		System.out.println(numbers); // [10, 20, 30]
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("cherry");
		
		// 문자열은 사전 순으로 정렬됨
		
		System.out.println(fruits); // [banana, apple, cherry] - 넣은 순
		
		Collections.sort(fruits);
		
		System.out.println(fruits); // [apple, banana, cherry] - 유니코드 순(사전 순)
		
		// 내림차순 정렬(역순)
		
		Collections.sort(numbers, Comparator.reverseOrder()); // Collections.reverseOrder() 도 같은 기능
		Collections.sort(fruits, Comparator.reverseOrder());
		
		System.out.println(numbers); // [30, 20, 10]
		System.out.println(fruits); // [cherry, banana, apple]
		
		// 순서 뒤집기
		
		List<Integer> numbers2 = new ArrayList<>();
		numbers2.add(30);
		numbers2.add(10);
		numbers2.add(20);
		
		System.out.println(numbers2); // [30, 10, 20]
		
		Collections.reverse(numbers2); // 단순 뒤집기
		
		System.out.println(numbers2); // [20, 10, 30]
		
		// 섞기
		// shuffle()
		List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		System.out.println(numbers3); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
		Collections.shuffle(numbers3);
		System.out.println(numbers3); // [13, 7, 4, 6, 11, 2, 12, 3, 9, 10, 5, 8, 1] - random
		
		// 이걸로 인디언홀덤, 원카드 등등 만들 수 있을듯
		
		// 최대값, 최소값
		// max(), min() - for문 돌릴 시간 줄어듦
		
		System.out.println("-------------------");
		
		int max = Collections.max(numbers3);
		int min = Collections.min(numbers3);
		
		System.out.println("최대값 : " + max); // 최대값 : 13
		System.out.println("최소값 : " + min); // 최소값 : 1
		
		// 문자열의 최대 최소값은 사전순으로 뒤에 나오는 것이 더 큼(유니코드값이 더 뒤인 값)
		System.out.println(Collections.max(fruits)); // cherry - c라서 제일 뒤 - 크다
		System.out.println(Collections.min(fruits)); // apple - a라서 제일 앞 - 작다
		
	}
}
