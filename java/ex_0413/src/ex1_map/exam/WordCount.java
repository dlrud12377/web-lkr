package ex1_map.exam;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		// 단어 빈도수 분석기
		// 문자열을 공백을 기준으로 분리한다.
		// 모두 소문자로 바꾼다.
		// HashMap<String, Integer>에 단어별 개수를 저장한다.
		// String text = "Apple banana apple Banana apple";
		String text = "Apple banana apple Banana apple";
		String[] SplitedText = text.toLowerCase().split(" ");
		
		HashMap<String, Integer> textMap = new HashMap<String, Integer>();
		
		// 단어 세기
		
//		for (int i = 0; i < SplitedText.length; i++) {
//			if (i == 0) { // 처음을 밖으로 빼서 지정해도 됨. 그러면 향상된 for문도 가능할듯?
//				textMap.put(SplitedText[i], 1);
//				continue;
//			}
//			else {
//					if (textMap.containsKey(SplitedText[i])) {
//						textMap.put(SplitedText[i], textMap.get(SplitedText[i]) + 1);
//					}
//					else {
//						textMap.put(SplitedText[i], 1);
//					}
//			}
//			
//		}
		
		// 검사를 할거면 그냥 조건을 먼저 걸러도 되겠는데?
		
		for (String word : SplitedText) {
			if (textMap.containsKey(word)) {
				textMap.put(word, textMap.get(word)+1);
			}
			else {
				textMap.put(word, 1);
			}
		}
		
		// 훨씬 간단스.. 항상 조건의 선후상황 따져보면서 유리한 방향으로 생각하기
		
		// map 출력하여 결과 보기
		System.out.println(textMap);
		
	}
}
