package ex2_casting;

public class StringConvertExample {

	public static void main(String[] args) {
		
		// 1. 문자열 -> 기본 타입 변경하기
		int value = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value); // 10
		System.out.println(value2); // 3.14
		System.out.println(value3); // true
		
		// 2. 기본타입 -> 문자열
		// String.valueOf(데이터)
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf("true");
		
		System.out.println(str1 + 0); // 100
		System.out.println(str2 + 0); // 3.140
		System.out.println(str3 + 0); // true0
	}

}
