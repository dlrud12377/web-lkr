package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map은 키(Key)와 값(value)을 한 쌍으로 저장하는 자료구조
// 키(key) : 값(value)를 찾기 위한 이름표 역할

// 키는 중복될 수 없다.
// 값은 중복될 수 있다.

// index가 없고 key를 통해 데이터에 접근한다.

public class MapExample {
	public static void main(String[] args) {
		// Map은 Key와 Value의 제네릭 타입을 각각 설정해야 함
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 1. map 데이터를 저장하는 방법
		// put(Key k, Value v); - List에서는 set, add
		map.put("사과", 1000);
		map.put("바나나", 2000);
		map.put("포도", 3000);
		
		// 내가 넣은 데이터 순으로 출력을 보장하지는 않음
		System.out.println(map);
		//{포도=3000, 사과=1000, 바나나=2000}
		
		// 2. 저장한 데이터를 꺼내는 방법
		// get(key) - List와 동일(index 대신 key)
		
		int price = map.get("포도");
		
		System.out.println("포도의 가격 : " + price);
		
		// 없는 key를 조회하려고 한다면 null값이 나온다.
		System.out.println(map.get("딸기"));
		
		map.put("사과", 1500); // 키 중복 x -> value가 덮어씌워짐
		System.out.println("사과의 가격 : " + map.get("사과"));
		
		// 3. 데이터 삭제하기
		// remove(key) - List와 동일
		// 삭제 후에 삭제된 value값을 반환한다.
		
		System.out.println("삭제한 값 : " + map.remove("사과")); // 삭제한 값 : 1500
		
		System.out.println(map);
		
		// 4. key의 존재 여부 확인하기
		// containsKey(key) - List와 동일하나 key, value값에 따라 메서드가 나누어짐
		
		if (map.containsKey("포도")) {
			System.out.println("포도가 존재합니다.");
		}
		
		// 5. value의 존재 여부 확인
		// containsValue(value) : 유일하게 value를 확인하는 메서드 - 4번 주석 참조
		
		if (map.containsValue(3000)) {
			System.out.println("3000원짜리 상품이 존재합니다.");
		}
		
		// 6. map에 들어있는 데이터의 개수 확인
		// size() - List와 동일
		System.out.println("map의 크기 : " + map.size());
		
		
		// 7. 컬렉션이 비어있는지 확인
		// isEmpty() - List와 동일
		System.out.println("map에 데이터가 들어있는지 확인 : " + map.isEmpty()); // false(비어있지 않으니)
		
		
		// 8. Map에서 전체 데이터를 다루는 방법
		
		// map에 들어있는 모든 key를 set으로 반환
		// keySet()
		
		Set<String> set = map.keySet();
		
		for (String s : set) {
			System.out.println(s);
		}
		
		// 9. key-value 쌍 전체를 Set<Entry<K,V>> 형태로 반환
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		
		for (Map.Entry<String, Integer> entry : set2) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Map<Integer, Character> map2 = new HashMap<Integer, Character>();
		
		map2.put(1000, 'A');
		map2.put(45, 'B');
		map2.put(29, 'F');
		map2.put(57, 'D');
		
		// 10. key가 존재하면 value를 반환하고, 없으면 기본값(default)를 반환하는 메서드
		// getOrDefault(Key k, defaultValue v)
		
		// get() 했을 때 key가 없으면 null을 반환
		
		System.out.println(map.getOrDefault("사과", 1500)); // 현재 map에 사과가 없으므로 뒤의 defaultValue가 출력
		
		// 11. Map에 존재하는 모든 값을 지울 때
		// clear()
		
		// 12. 키에 대응하는 값이 없을때만 key-value쌍을 맵에 저장
		// putIfAbsent(K key, V value)
		
		// 13.replaceAll - String값을 받기 때문에 정규표현식까지 활용 가능
		
		// 14. replace - CharSequence값을 받기 때문에 교체가 번거로움. 단순 작업에는 좋음
		
		// 15. values() - value값들을 List형식으로 반환
		
		
	}
}
