package ex1_generic;

import java.util.List;

// 와일드카드
// 제네릭 타입에서 "정확한 타입은 모르겠지만, 어떤 범위 안에 있는 타입이다."
// 라고 표현할 때 사용한다.
// List<String> : 정확히 String을 담을 수 있는 리스트
// List<Integer> : 정확히 Integer를 담는 리스트

// <T extends Number> : 타입을 Number로 제한하는 것.

// 와일드카드의 기본문법
// <?> : 객체에서는 Object가 만능이었지만, 제네릭 타입은 캐스팅이 안되므로 ?가 만능이다.
// - ?의 의미 : 타입을 모름, 아무 타입이나 가능함
// 보통 타입을 제한하지 않으면 <? extends T> 라고 씀(제한할 타입은 나중에 너가 정해) 
// - T 또는 T의 자식 타입만 가능함(상한 제한)
// <? super T> : T 또는 T의 부모 타입만 가능(하한 제한)


public class WildCards {
	
	public void printList(List<?> list) {
		System.out.print("[");
		for (Object obj : list) {
			System.out.print(obj);
			if (list.get(list.size()-1) == obj) {
				continue;
			}
			System.out.print(", ");
		}
		System.out.println("]");
	}
	
	// 상한 제한 와일드카드(Number보다 상위 개념은 불가)
	public void printNumbers(List<? extends Number> list) {
		System.out.print("[");
		for (Number obj : list) {
			System.out.print(obj);
			if (list.get(list.size()-1) == obj) {
				continue;
			}
			System.out.print(", ");
		}
		System.out.println("]");
	}
}
