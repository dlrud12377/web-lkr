package ex1_set.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// < Set 인터페이스가 제공하는 메서드 >
// void add(E e) : 데이터를 삽입
// void remove(Object o) : 선택된 데이터를 삭제
// void clear() : 모든 데이터를 삭제
// int size() : 저장된 데이터의 개수를 반환(length)



public class HashSetExample {
	public static void main(String[] args) {
		// HashSet 클래스는 Set 인터페이서에서 가장 많이 사용되는 구현클래스이다.
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Spring");
		set.add("React");
		set.add("Java"); // 겹쳐서 추가안됨
		
		System.out.println(set); // 얘도 그냥 출력됨 굿
		
		// HashSet(Collection < ? extends E > c - 컬렉션 프레임워크의 컬렉션 아래 내용들은 다 받을 수 있음)
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,3,3,5));
		
		System.out.println(set2); // 뒤 3,3,5 겹쳐서 추가안됨
		
		// Hashset으로 1~45 사이의 난수 6개를 담기
		
		Set<Integer> lotto = new HashSet<>();
		
		while (lotto.size() < 6) {
			lotto.add((int)(Math.random()*45) + 1);
		}
		
		System.out.println("로또 번호 : " + lotto);
		
		// Set은 순서가 보장되지 않으므로 리스트나 배열로 바꾸는 과정이 있을 수 있다
		
		// Set을 리스트로 바꾸려면?
		
		List<Integer> lotto2 = new ArrayList<Integer>(lotto);
		
		lotto2.sort(Comparator.naturalOrder()); // reverseOrder = 내림차순(역순)
		
		System.out.println(lotto2);
		
		
		// Set을 배열로 만들기
		
		Integer[] lotto3 = lotto.toArray(new Integer[0]);
		// new Integer[0] -> 배열의 방 개수를 0으로 하면 set이 add해둔 개수만큼 자동으로 배열의 index가 만들어진다.
		// 또는 0 대신 set.size()를 하면 된다
		
		System.out.println(Arrays.toString(lotto3)); // 그냥 배열은 출력기능이 없어서 Arrays 클래스를 사용
		
	}
}
