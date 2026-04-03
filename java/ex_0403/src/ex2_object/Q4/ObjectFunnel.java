package ex2_object.Q4;

public class ObjectFunnel {
	
	// 싱글톤? 쓸수있을까 -> 집가서 해보자..
	
	public static void seperator(Object obj) {
		if (obj instanceof Integer) {
			System.out.println("정수 데이터 : " + obj);
		}
		else if (obj instanceof Double) {
			System.out.println("실수 데이터 : " + obj);
		}
		else if (obj instanceof Employee target) { // target 붙이면 형변환도 한번에 진행됨
			System.out.println("이름 : " + target.name + ", 부서 : " + target.dept);
		}
		else if (obj instanceof String) {
			System.out.println("문자열 데이터 : " + obj);
		}
	}
}
