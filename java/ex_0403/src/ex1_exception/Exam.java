package ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 키보드에서 정수를 입력받고, 정수 이외의 값이 입력되었다면
		// "정수만 입력 가능" 메시지 출력하기
		
		Scanner sc = new Scanner(System.in);
		
//		try {
//			System.out.print("정수를 입력하세요 : ");
//			int num = sc.nextInt();
//			System.out.println("입력된 정수 값 : " + num);
//		} catch (InputMismatchException e) {
//			System.out.println("정수만 입력가능 : " + e.getMessage()); // 왜 e.getMessage가 null로 출력이 되는가 -> 이 예외가 가지고있는 메시지가 없는듯
//		}
//		catch (Exception e) {
//			System.out.println("예상 범위 밖의 예외 발생 : " + e.getMessage());
//		}
//		finally {
//			System.out.println("프로그램 종료");
//		}
		
		String[] fruits = {"사과", "바나나", "포도", "복숭아"};
		// 인덱스를 입력받는다.
		// 해당 위치의 과일을 출력한다.
		// 숫자가 아닌 값을 입력하면 "숫자를 입력해야 합니다." 출력
		// 범위를 벗어난 인덱스를 입력하면 "존재하지 않는 인덱스입니다." 출력하기
		
		// 인덱스 범위를 체크하여 예외 처리를 하기 위해 구조는 try-catch 사용
		// 1. 인덱스 입력받기
		// Scanner 객체 위에 있으니 생략 // Scanner sc = new Scanner(System.in);
		try {
			System.out.print("인덱스값을 입력하세요 : ");
			int index = sc.nextInt();
			System.out.println("해당 인덱스에 입력된 과일 : " + fruits[index]);
		}
		// 2. 숫자가 아닌 값 입력 시 예외처리(InputMismatchException)
		catch(InputMismatchException e) {
			System.out.println("정수를 입력해야 합니다."); // e.message는 사용 안함(해당 예외는 오류 메시지가 없음)
		}
		// 3. 인덱스 초과 예외처리(ArrayIndexOutOfBoundsException)
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 인덱스입니다 : " + e.getMessage());
		}
		// 4. 그 외 예외상황
		catch (Exception e) {
			System.out.println("예상치 못한 예외 발생");
			e.printStackTrace();
		}
		
	}	
}
