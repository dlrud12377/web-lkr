package ex3_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	public static void main(String[] args) {
		// List, set 계열에서 공통적으로 쓰이는 메서드
		
		List<String> list = Arrays.asList("사과", "바나나", "포도");
		
		// forEach() - 혁명인데?
		// 컬렉션에 들어있는 요소를 하나씩 꺼내면서 람다로 처리할 때 사용하는 메서드
		list.forEach(System.out::println); // (s -> System.out.println(s))
		
		// Collection 인터페이스
		// removeIf()
		// 조건에 맞는 요소를 삭제할 때 사용하는 메서드
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		nums.removeIf(x -> x % 2 == 0); // 결과가 true인 것들을 삭제
		System.out.println(nums); // [1, 3, 5, 7, 9]
		
		Set<String> names = new HashSet<String>(Arrays.asList("김민수", "박갑수", "홍길동", "조랭이", "최민용"));
		
		// 이름에 "민" 글자가 들어있는 사람만 지운 후 출력하기
		
		names.removeIf(x -> x.contains("민"));
		
		System.out.println(names); // [조랭이, 홍길동, 박갑수]
		
		
		// List 인터페이스
		// replaceAll() : 각 요소를 바꿀 때
		// sort() : 정렬 기준을 람다로 넘길 때
		
		List<String> names2 = new ArrayList<String>(Arrays.asList("kim", "lee", "park"));
		
		names2.replaceAll(name -> name.toUpperCase());
		System.out.println(names2); // [KIM, LEE, PARK]
		
		names2.sort((a,b) -> a.compareTo(b));
		System.out.println(names2);
		
		// compareTo() : 문자열끼리 사전식 비교
		// 사전순으로 뒤에 있는 게 더 큰 수라고 판단
		// 음수 : a가 b보다 앞에 와야 함
		// 0 : 둘이 같음
		// 양수 : a가 b보다 뒤에 와야 함
		
		// 내림차순
		names2.sort((a,b) -> b.compareTo(a)); // a와 b의 위치 변경
		System.out.println(names2); // [PARK, LEE, KIM]
		
		// Map 인터페이스
		
		// forEach(BiConsumer<K,V>)
		// 키와 값을 같이 순회할 때 사용
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1000);
		map.put("바나나", 2000);
		map.put("포도", 1700);
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		
		// replaceAll()
		// 모든 값을 일괄 수정할 때 사용
		map.replaceAll((key, value) -> value + 500);
		System.out.println(map); // {포도=2200, 사과=1500, 바나나=2500}
	}
}
