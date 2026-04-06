package ex2_system;

public class TimeExample {
	public static void main(String[] args) {
		// 1970년 1월 1일 0시 0분 0초부터 현재까지 흐른 시간을 밀리초 단위로 반환
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		// currenttime 작업
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000000; i++) {};
		
		long end = System.currentTimeMillis();
		
		System.out.println("걸린 시간(ms) : " + (end-start));
		
		// nanotime 작업
		// 성능 테스트
		// 알고리즘 비교
		// currenttimeMillis보다 좀더 정밀함
		
		start = System.nanoTime();
		
		for (int i = 0; i < 10000000; i++) {};
		
		end = System.nanoTime();
		
		System.out.println("걸린 시간(ns) : " + (end-start));
	}
}
