package ex2_iterator.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// 사용자로부터 학생 이름을 여러 개 입력받아 List에 저장한다.
		// 이후 중복을 제거하고 정렬하여 출력하는 프로그램 작성하기 -> set으로 할수도있고, iterator로 할수도 있고
		// 입력은 exit 입력 시 종료

		String name;
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		
		while (true) {
			System.out.print("문자열을 입력하세요 : ");
			name = sc.nextLine();
			
			if (name.equalsIgnoreCase("exit")) { // 대소문자 무시하고 같으면
				break;
			}
			
			if (names.contains(name)) {
				System.out.println("이미 존재하는 이름입니다.");
			}
			else {
				names.add(name);
			}
			
			
		}
		
		// 1. set으로 제거하기
		HashSet<String> listToSet = new HashSet<>(names); // set으로 변경해서 한번 제거
		names = new ArrayList<>(listToSet); // sort 하기위해 다시 list로 변경
		
		// 정렬
		Collections.sort(names);
		
		System.out.println(names);
		
		// 2. iterator 사용하여 제거하기.. 폐기
//		Iterator<String> listIter = list.iterator();
//		
//		while(listIter.hasNext()) {
//			String f = listIter.next();
//			if (listIter.next())		}
		
		
	}
}
