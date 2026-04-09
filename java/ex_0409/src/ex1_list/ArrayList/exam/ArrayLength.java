package ex1_list.ArrayList.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		
		// 문자열 타입 리스트 객체를 만든다.
		// 리스트에 "Java", "Spring", "HTML", "CSS"를 저장하기
		List<String> comLang = Arrays.asList("Java", "Spring", "HTML", "CSS");
		// 정석 : add를 써서 하나하나 넣어주기
		
		// 각 문자열의 길이를 계산하여 lengths라는 새로운 리스트를 만들어서 저장하기
		List<Integer> lengths = new ArrayList<>();
		
		for (String lang : comLang) {
			lengths.add(lang.length());
		}
		
//		// lengths 리스트를 출력하기
//		System.out.println(lengths);
		
		// 두 정보 맵핑하기
		for (int i = 0; i < comLang.size(); i++) {
			System.out.println(comLang.get(i) + "의 길이 : " + lengths.get(i));
		}
		
		// 문자열 형태의 리스트 생성하기
		// "김철수", "이영희", "김철수", "박민수", "김철수" 저장하기
		// 리스트에 김철수가 몇 번 들어있는지 계산하여 출력
		
		List<String> names = Arrays.asList("김철수", "이영희", "김철수", "박민수", "김철수");
		
		int count = 0;
		String targetName = "김철수";
		for (String name : names) {
			if (name.equals(targetName)) {
				count++;
			}
		}
		
		System.out.println("리스트 내 target의 수 : " + count);
		
		// scores 라는 이름의 정수 타입 리스트를 만든다.
		// 88, 72, 95, 60, 81을 저장한다.
		
		// 최고 점수와 최소 점수를 찾아서 차이를 출력하세요 (max, min) 메서드도 써볼까용?
		
		List<Integer> scores = Arrays.asList(88, 72, 95, 60, 81);
		
		// 최대최소 기본값 인덱스 첫번째 값으로 저장(초기값 잡아주면 매우 안전)
		int maxScore = scores.get(0);
		int minScore = scores.get(0);
		
		for (int i = 1; i < scores.size(); i++) {
			maxScore = Math.max(maxScore, scores.get(i));
			minScore = Math.min(minScore, scores.get(i));
		}
		
		System.out.println("최대값 : " + maxScore);
		System.out.println("최대값 : " + minScore);
		System.out.println("두 점수의 차 : " + (maxScore - minScore));
	}
}
