package ex1_generic;

import java.util.Arrays;
import java.util.List;

public class WildCardsMain {
	public static void main(String[] args) {
		WildCards wc = new WildCards();
		
		List<String> list1 = Arrays.asList("A", "B", "C");
		
		wc.printList(list1);
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		wc.printList(list2);
		
		List<Double> list3 = Arrays.asList(1.1, 2.2, 3.3);
		
		wc.printNumbers(list3);
		wc.printNumbers(list2);
//		wc.printNumbers(list1); // String은 Number의 하위 개념이 아니므로 에러 발생
	}
}
