package ex1_exception;

public class CatchExample {
	public static void main(String[] args) {
		// catch 메서드는 시스템으로부터 넘어오는 예외 객체를 받아서 처리한다.
		
		try {
			String[] array = {"100", "1oo"};
			
			for (int i = 0; i <= array.length; i++) { // <= : 인덱스 초과(ArrayIndexOutOfBoundsException)
				int value = Integer.parseInt(array[i]); // 1oo에서 parseInt 사용 불가 (NumberFormatException)
			}
			// 해당 타입의 예외가 발생하면 catch 블록이 실행됨.
			
		}
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());			
		}
		catch (ArrayIndexOutOfBoundsException e) { // 두 예외를 (ArrayIndexOutOfBoundsException | NumberFormatException e)로 묶을 수 있다.(& : and, | : or)
			System.out.println("배열의 인덱스 값을 초과함 : " + e.getMessage());
		}
		catch (Exception e) { // 다형성을 이용하여 모든 오류를 한번에 체크 가능.
			System.out.print("실행에 문제가 있습니다. 문제 상황 : ");
			e.printStackTrace();
		}
		// 예외 발생 시 catch 블록은 위에서부터 차례대로 검사 대상이 되는데, 
		// 하위 예외도 상위 클래스타입 변수에 대입될 수 있기 때문에
		// 마지막에 써야 한다.
		finally {
			System.out.println("프로그램 종료");
		}
	}
}
