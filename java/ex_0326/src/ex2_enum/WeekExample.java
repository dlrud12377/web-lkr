package ex2_enum;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		// 왜 열거형을 사용해야 하는가?
		
		// 문자열로 상태를 관리하는 경우
//		String status = "배송wnd"; // 오타가 나도 그냥 문자열이기 때문에 프로그램은 실행이 됨
		
		// 상태를 숫자로 관리하는 경우
		// 1이 주문완료인지, 배송중인지, 배송완료인지 관계자 이외에는 알기가 어려움
		int status = 1;
		
		// 열거형을 사용하는 법
		Week today = null;
		
		// 날짜 및 시간 정보를 가진 객체
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일을 얻는다(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
		case 2:
			today = Week.MONDAY;
		case 3:
			today = Week.TUESDAY;
		case 4:
			today = Week.WEDNESDAY;
		case 5:
			today = Week.THURSDAY;
		case 6:
			today = Week.FRIDAY;
		case 7:
			today = Week.SATURDAY;
		}
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}
		else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
		// 열거형에 들어가는 값은 그냥 문자열이 아니다.
		// Week 타입 안에 정의된 상수이다.
		
		// int, double, char, boolean -> 기본타입 자료형
		// 우리가 만드는 열거형도 하나의 타입(자료형)이라고 할 수 있다.
		
//		today = "Sunday";
//		today = 1; -> 이런식으로 넣는 것이 불가능하다.
		
		// 상수(값을 바꿀 수 없는 자료)들의 배열
		
	}
}
