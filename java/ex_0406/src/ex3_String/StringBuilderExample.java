package ex3_String;

// 인덱스 범위를 가지고 사용하는 메서드는 끝값을 포함시키지 않음

public class StringBuilderExample {
	public static void main(String args[]) {
		String data = new StringBuilder() // builder 패턴 쓰듯이 진행(method chaining pattern)
				.append("DEF") // 추가하고 싶은 문자열(초기값) - StringBuilder type
				.insert(0, "ABC") // 추가할 위치 인덱스 - StringBuilder type
				.delete(3,4) // 지우고 싶은 시작 인덱스 / 끝 인덱스(미포함) -> 이 경우 인덱스 3값만 지워짐  - StringBuilder type
				.toString(); // 마무리(StringBuilder 타입을 string 타입으로 반환)
		
		System.out.println(data); // ABCEF
		// DEF의 0번인덱스, 제일 앞에 ABC를 추가하여 ABCDEF -> 3번 인덱스 값을 지워 ABC(D-삭제)EF
		
		// 자주 변경되는 문자열이 있을 때 String에 넣지 말고, StringBuilder에 넣으면 버퍼 시스템을 이용해 메모리 절약이 가능함
	}
}
