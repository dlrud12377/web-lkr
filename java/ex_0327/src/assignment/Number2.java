package assignment;

public class Number2 {
	public static void main(String[] args) {
		// 2. 다음 문자열에서 "프로그래밍"이라는 단어가 몇 번째 위치에 있는지 찾아 출력하시오. 
		// 만약 단어가 없으면 "찾을 수 없음"을 출력하세요.
		
		String text = "나는 자바 프로그래밍을 공부합니다.";
		
		// 프로그래밍 위치를 찾기 : indexOf() 사용
		
		int index = text.indexOf("프로그래밍");
		
		if (index != -1) {
			System.out.println("주어진 문자열은 " + (index+1) + "부터 시작합니다.");
		}
		
		else {
			System.out.println("주어진 문자열이 없습니다.");
		}
		
	}
}
