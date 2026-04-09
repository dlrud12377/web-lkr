package ex1_list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class ArrayListExample {
	public static void main(String[] args) {
		
		// ArrayList
		// List 인터페이스를 구현한 대표적인 클래스
		// 내부구조 : 배열을 기반으로 동작
		// 장점 : 조회 속도가 빠르다 (index로 접근하기 때문)
		// 단점 : 중간 삽입/삭제가 느림(데이터의 이동이 발생하기 때문)
		
		// 언제 쓰면 좋을까?
		// 삽입/삭제는 많지 않은데 조회가 많을 때
		
		//java.util 패키지에 들어있음
		
		// 구현 클래스의 객체는 해당 인터페이스의 타입변수에 담을 수 있다.
		
		List<String> list = new ArrayList<>();
		
		// 1. add(E) : 리스트에 데이터 추가하기
		list.add("김띵동");
		
		list.add("A");
		list.add("B");
		
		if(list.add("C")) {
			System.out.println("데이터가 정상적으로 추가되었습니다.");
		}
		else {
			System.out.println("데이터가 추가되지 않았습니다.");
		}
		
		// 2. add(E, index) : 내가 원하는 위치에 데이터 넣기
		list.add(1, "데이터");
		
		// [김띵동, **데이터**, A, B, C] // 인덱스 1번 자리에 해당하는 A를 뒤로 밀고 원하는 값을 추가했음
		
		// 3. set(E, index) : 원하는 위치 데이터 값 바꾸기
		list.set(1, "D");
		// 사이에 add나 remove를 하는거보다 set을 써서 null로 초기화만 시켜두고, 나중에 다시 자리를 써도 되지 않을까?
		
		
		// 4. 리스트의 출력
		System.out.println(list); // list는 자체적으로 배열을 스스로 출력함. 다만 toString도 사용 가능

		// 5. get(index) : 리스트에 들어있는 데이터를 하나만 꺼내기
		String dingdong = list.get(0);
		System.out.println(list.get(0)); // 김띵동
		
		// 연속되지 않은 인덱스에 값을 넣으려고 하면 
		// ArrayIndexOutOfBoundsException 발생
		// list.add(7,"F")
		
		// Q1. 정수 타입을 담을 수 있는 List객체 만들기
		// 변수명 : list2
		
		List<Integer> list2 = new ArrayList<>();
		
		// 2부터 짝수 데이터 10개 추가하기
		
		// 방법1 - 1부터 10까지의 수에 2 곱하기
		for (int i = 1; i <= 10; i++) {
			list2.add(2 * i);
		}
		
		// 방법2 - 조건문으로 홀수 걸러내기
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				list2.add(i);
//			}
//		}
		
		System.out.println(list2);
		
		// 6. remove(index) : 인덱스의 내용을 삭제 - 삭제된 값을 반환
		int delNum = list2.remove(3); // 3번 인덱스에 해당하는 6을 삭제 + 삭제한 값 저장
		System.out.println("삭제 후 : " + list2);
		System.out.println("삭제된 숫자 : " + delNum);
		
		// 데이터를 직접 지우고 싶음
		// 숫자 타입의 데이터는 객체화 후 삭제 - 반환 boolean
		boolean isRemove = list2.remove(Integer.valueOf(10)); // 값을 지정해서 삭제 - 가장 처음 만나는 10에 해당하는 값 삭제
		if (isRemove) {
			System.out.println("삭제가 정상적으로 진행되었습니다.");
		}
		
		// list2에 들어있는 모든 10 삭제하기
		list2.add(3, 10);
		list2.add(2, 10);
		list2.add(1, 10);
		list2.add(10);
		
		System.out.println("삭제 전 : " + list2);
		
//		for (int number : list2) {
//			if (number == 10) {
//				list2.remove(Integer.valueOf(number));
//			}
//		} // ConcurrentModificationException
		
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) == 10) {
				list2.remove(Integer.valueOf(list2.get(i)));
			}
			if (!list2.contains(10)) {
				break;
			}
		}
		
		System.out.println("삭제 후 : " + list2);
	}
}
