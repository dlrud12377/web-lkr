package ex1_list.LinkedList;

import java.util.LinkedList;
import java.util.List;

// 내부 구조 : 이중 연결 리스트
// 장접 : 삽입 / 삭제가 빠름
// 단점 : 조회가 느림

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
	
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(1, 90); // 1번 인덱스에 90 삽임
		
		System.out.println(list); // [10, 90, 20, 30]
	
	}
}
