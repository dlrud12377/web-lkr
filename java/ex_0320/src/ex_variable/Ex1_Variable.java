package ex_variable;

public class Ex1_Variable {

	public static void main(String[] args) {
		// TODO 
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("홍길동");
		// sysout은 출력하는 것이지 정보를 담지 않음.
		// 정보값을 저장하려면 변수를 만들어야 함
		
		int age; // 변수 선언 (int : 정수 타입)
		age = 10; // 변수 초기화(=초기 값 설정) : 변수 age에 10을 대입

		// 프로그래밍 언어에서 =는 우변의 값을 좌변에 대입하겠다라는 의미(방향성이 있음)
		
		System.out.println(age+1); // 11
		
		// 연산 후 age의 값은? sysout은 정보 변경의 효과가 없어 그대로 11임
		
		System.out.println(age); // 10
		
		age = 55; // 기존 값을 새 값으로 덮어씌울 수 있음
		
		System.out.println(age); // 55
		
		age = age + 1;
		
		System.out.println(age); // 56
		
		// 변수 선언 + 초기화를 동시에 할 수 있음
//		int y = 30;
		
		// 변수는 출력문 / 연산식에 사용되어 값을 활용할 수 있음
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간"); // 3시간(hour, 3을 string으로 인식하여 시간과 합침)
		System.out.println(minute + "분"); // 5분
		System.out.println(hour + "시간 " + minute + "분"); //3시간 5분
		
		// 총 몇분인지 구하기
		int totalMinute = hour * 60 + minute;
		System.out.println("총 "+ totalMinute + "분"); // 총 185분
		
		// 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있음
		
		int a = 3; // a=3
		int b = a; // b=3
		a = 5; // a값 5로 초기화
		
		System.out.println("a=" + a); // a=5
		System.out.println("b=" + b); // b=3
		
		int x = 3;
		int y = 5;
		int t; // 매개변수 지정
		t = x; // t = 3
		x = y; // x = 5(변경완료)
		y = t; // y = 3(변경완료)
		
		System.out.println("결과 : " + x + "," + y); // 결과 : 5,3
		
		// 표기법 : 카멜 표기법(userName - 변수명 권장), 스네이크 표기법(user_name - 파이썬 권장)
		// 접두사 : 동사 + 목적어 많이 사용(ex. hasPermission, isThere)
		
		// byte, int, short, double 등등은 기존 자료로 복습
		
		
		
	}

}
