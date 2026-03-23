package ex1_datatype;

public class StringExample {
	public static void main(String[] args) {
		// char c1 = "홍길동"; -> 3글자(6bit), ""는 char값이 받아들이지 못함
		String s1 = "홍길동";
		System.out.println(s1); // 홍길동
		
		// 데이터를 변수에 넣어서 사용하는 이유
		System.out.println("홍길동"); // 이 결과 역시 s1을 print한 값과 동일하게 나옴.(홍길동)
		// 다만 s1에 변수를 저장해두면, 재사용이 가능함 + 데이터 수정에 용이
		
		s1 = "박길동"; // 수정 간단.
		// but System.out.println("홍길동");를 여러번 출력하는 코드에서 박길동으로 바꾸려면 일일이 교체해주어야 함
		// 즉 반복적으로 등장하거나 수정해야 하는 값이라면 변수에 넣어 저장하는 것이 유리
		
		// String값 출력 시 들어있는 값이 나옴
		// 원래는 주소값을 돌려주는 것이 맞으나, 문자열은 자주 쓰다 보니 주소에 들어있는 값을 반환하도록 설정이 되어있음
		
		System.out.println(s1.toString());
		
		// 이스케이프 문자
		// 문자열 안에서 특수한 기능을 수행하기 위한 문자
		System.out.println("안녕하세요 \"홍길동\"입니다."); // 쌍따옴표 앞에 달아서 쌍따옴표를 문자열 자체로 인식하게 변경
		// \" -> "라는 문자열로 인식
		
		// \(백슬래쉬)가 붙으면 "이 문자는 특별한 의미로 처리해라"라는 것을 의미
		// \n : 줄바꿈
		System.out.println("hello\nworld"); // hello ( 줄바꿈 ) world
		// \t : 탭 1개만큼 들여쓰기
		System.out.println("hello\tworld"); // hello	world
		// 그 외 \(문자) : 뒤의 문자를 기능을 없애고 문자 그대로를 출력함(', ", \ 등)
		
		
		// java 13부터는 텍스트블록 문법을 제공함
		String str = """
				영역 사이에
				작성을 합니다.
				어떤 값도 편하게 넣을 수 있습니다.
				"""; // 작성된 그대로의 문자열을 저장함.(SQLD 문법에서도 활용한 기억이 있음)
		
		System.out.println(str);
		
	}
}
