package ex5_singleton;

public class AttendanceManager {
	// 학생 출석 수를 저장하는 count 변수가 있음
	// addAttendance() 메서드를 호출하면 출석 수가 1 증가함
	// getAttendance()로 현재 출석 수를 반환함
	// 프로그램 전체에서 출석관리 객체는 하나만 존재해야 함
	
	private static int count = 0;
	
	// 내부에서 객체 생성(private)
	private static AttendanceManager students = new AttendanceManager();
	
	// private 생성자 생성
	private AttendanceManager() {
		
	}
	
	// getInstance();
	public static AttendanceManager getInstance() {
		return students;
	}
	
	// addAttendance() 만들기 - public
	public void addAttendance() {
		count++;
	}
	
	// getAttendance() 만들기 - public
	public int getAttendance() {
		return count;
	}
}
