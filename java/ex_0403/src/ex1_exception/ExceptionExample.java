package ex1_exception;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		
		// < 자주 발생하는 예외의 종류 >
		// 1. NullPointerException
		// - 참조형 변수의 값의 기본형이 null인데, null을 지정하거나 사용하는 경우에 발생하는 예외
		int[] array = null;
//		System.out.println(array[0]);
		
		// 2. NumberFormatException
		// - 잘못된 문자열을 숫자로 형변환 할 때 발생
		
		String str01 = "11.2";
		
//		int num01 = Integer.parseInt(str01); // 실수값을 담은 문자열을 정수형으로 형변환 -> 예외 발생
		
		// 3. ArrayIndexOutOfBoundsException
		// - 배열에서 인덱스 범위를 초과해 사용할 때 발생
		int[] array2 = {0, 1, 2, 3, 4, 5};
//		System.out.println(array2[8]); // index값이 5까지인 배열인데 8 입력 -> 범위초과 예외 발생
		
		// 4. ArithmeticException
		// 정수를 0으로 나누려고 할 때 발생한다.
//		System.out.println(10/0); // 0으로 나누는 상황 -> 답이 안나오므로 예외 발생
		
		// 5. InputMismatchException
		// 입력 메서드와 입력한 값의 타입이 맞지 않을 때
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
//		int num = sc.nextInt(); // 정수를 입력받아야 하는데 정수가 아닌 값을 입력하면 오류 발생
		
		// 6. IOException
		// - writer 사용 시 문제가 생길 때 나오는 예외
	}
}
