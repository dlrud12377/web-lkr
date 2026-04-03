package ex2_object.Q4;

public class Main {
	public static void main(String[] args) {
		Object[] arr = {"Java", 100, 3.14, new Employee("홍길동", "개발팀")};
		
		// 반복문으로 배열을 순회하면서
		// 문자열이면 "문자열 데이터 : xx"
		// 정수면 "정수 데이터 : xx"
		// 실수면 "실수 데이터 : xx"
		// Employee 객체면 이름과 부서를 출력
		
		for (Object element : arr) {
				ObjectFunnel.seperator(element);
			}
	}
}
