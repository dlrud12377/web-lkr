package ex1_datatype;

public class CharExample {

	public static void main(String[] args) {
		// Char
		// 문자형 데이터는 무조건 한글자(2bit)
		// 데이터를 ' '에 담아야 함
		
		char c1 = 'A';
		char c2 = '가';
		char c3 = 65;
		char c4 = 44032;
		
		System.out.println(c1); // A
		System.out.println(c2); // 가
		System.out.println(c3); // A(ASCII code)
		System.out.println(c4); // 가(Unicode)
		// ASCII code - A~Z(65~90), a~z(97~122) 등 127개의 숫자에 맞는 문자가 대응되어있음.
		// 프로그래밍 시 문자형에서 숫자를 입력하면 등장
		// 유니코드 내에 아스키코드가 포함(자바에서는 유니코드를 사용한다 - 아스키코드 포함되어있음)
		
	}

}
