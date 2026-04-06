package ex6_date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		// Java 8 이후에 등장한 현대적인 날짜 API
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 1. 원하는 날짜와 시간을 직접 만들기
		LocalDateTime dateTime = LocalDateTime.of(2026, 4, 6, 10, 30);
		System.out.println(dateTime);
		
		// 날짜 / 시간 전체를 알고있기 때문에
		// 연도, 월, 일, 시, 분 등을 꺼낼 수 있다.
		
		System.out.println("연도 : " + now.getYear()); // 연도 : 2026
		System.out.println("월 : " + now.getMonth()); // 월 : APRIL // getMonthValue 입력하면 숫자 4가 나옴
		System.out.println("일 : " + now.getDayOfMonth()); // 일 : 6
		System.out.println("시 : " + now.getHour()); // 시 : 16
		System.out.println("분 : " + now.getMinute()); // 분 : 17
		System.out.println("초 : " + now.getSecond()); // 초 : 14
		
		// 2. 날짜와 시간 더하기 빼기
		
		// 일 더하기
		System.out.println("10일 뒤 : " + now.plusDays(10));
		
		// 월 더하기
		System.out.println("2달 뒤 : " + now.plusMonths(2));
		// 년 더하기
		System.out.println("3년 뒤 : " + now.plusYears(3));
		
		// 빼기는 now.minus(calendarvalue)
		
		// 문자열도 출력형식 바꾸기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String result = now.format(formatter);
		
		System.out.println(result);
		
		// 문자열을 LocalDateTime으로 바꾸기
		String str = "2026/04/06 16:37";
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime dateTime2 = LocalDateTime.parse(str, formatter);
		
		System.out.println(dateTime2);
		
		// 게시글 작성 시간
		// 회원가입 시간
		// 주문 생성 시간
		// 예약 시간
		// 마감 시간
		// 로그인 시간
		// 수정 시간 등
		
		// 날짜 비교 가능
		// isBefore() : 앞선 시간인지 비교
		// isAfter() : 뒤의 시간인지 비교
		LocalDateTime meeting = LocalDateTime.of(2026, 4, 10, 14, 30);
		
		System.out.println(now.isBefore(meeting));
		System.out.println(now.isAfter(meeting));
		
		// 같은지 보려면 overriding된 isEqual 사용
		System.out.println(now.isEqual(meeting));
		
		// 날짜의 특정 부분만 바꾸기
		// 이미 만들어진 날짜 / 시간 객체에서
		// 연도나 월, 일, 시를 바꾼 새로운 객체를 만들 수 있다.
		LocalDateTime changed = now.withYear(2030)
								.withMonth(12)
								.withDayOfMonth(25)
								.withHour(9); // builder 패턴(다만 꼬리가 없는)
		
		System.out.println(now);
		System.out.println(changed);
		
		// Q1. 현재 시간이 09:00 ~ 18:00 사이인지 확인하여 예약 가능 여부를 출력하기
		
		// now에 있는 시, 분을 얻어내서 비교하면 될듯?
		// 시간은 9<=x<18, 분은 9시인 경우 0이 아니어야 함
		// 그냥 시간 강제바꾸기 활용하면 되나? 일단 만들어보자
		
		// 1. 시간, 분 정보 꺼내서 비교.. 별로임
//		int nowHour = now.getHour();
//		int nowMinutes = now.getMinute();
//		int nowSeconds = now.getSecond();
//		
//		if (nowHour >= 9 || nowHour < 18) {
//			System.out.println("예약 가능");
//		}
//		else if(nowHour == 18 && nowMinutes == 0 && ) { // 끝수 처리가 진짜 별로다
//			System.out.println("예약 가능");
//		}
		
		// 빌더패턴 사용해서 시간만 바꿔쓰기
		
		LocalDateTime start = now
							.withHour(9)
							.withMinute(0)
							.withSecond(0);
		
		LocalDateTime end = now
							.withHour(18)
							.withMinute(0)
							.withSecond(0);
		
		// 시간비교(isAfter, isBefore 활용)
		if (now.isAfter(start) && now.isBefore(end)) {
			System.out.println("예약이 가능합니다.");
		}
		else {
			System.out.println("예약이 불가합니다.");
		}
		
		
	}
}
