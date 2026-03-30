package ex5_singleton;

public class AttendanceManagerMain {
	public static void main(String[] args) {
		AttendanceManager students1 = AttendanceManager.getInstance();
		AttendanceManager students2 = AttendanceManager.getInstance();
		
		students1.addAttendance();
		students1.addAttendance();
		students1.addAttendance();
		students2.addAttendance();
		
		System.out.println("현재 출석 수 : " + students2.getAttendance());
		
		// 싱글톤 패턴을 사용하는 이유
		// 공유 자원을 효율적으로 관리하고, 구조를 안정적으로 유지하기 위해서
		// new 생성자(); 를 통해서 객체를 여러개 만들게 되면 메모리를 많이 사용함
		// 그것을 방지하기 위해서 반복적인 단일 자원 관리 작업에 한해 싱글톤 패턴을 적용
		
		// 어디서든지 같은 객체를 가져올 수 있다.
		// 데이터를 일관성 있게 유지할 수 있다.
		
		// 실무에서 쓰는 대표적인 사례
		
		// 1. DB연결 관리자
		// 2. 로그 시스템 -> 하나의 객체로 기록
		// 3. 설정(Config) -> 모든 곳에서 동일한 값을 가진다.
		
	}
}
