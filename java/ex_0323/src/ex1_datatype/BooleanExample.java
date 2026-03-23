package ex1_datatype;

public class BooleanExample {
	public static void main(String[] args) {
		// 논리형(boolean) : 참거짓을 나타내는 변수, 1bit 사이즈
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1); // true
		System.out.println(b2); // false
		
		// 변수의 이름을 잘 지어야 함
		
		boolean isOn = true; // 전자기기, 전등 등이 켜져 있는 상태를 나타냄
		boolean isStudent = false; // 학생이 아님
		
		// boolean값을 다른값에 복사할 수 있다
		boolean copy = isOn;
		System.out.println("복사한 값 : " + copy); // 복사한 값 : true
		
		// boolean은 true/false값만 올 수 있다.
		isOn = false;
		System.out.println("전등 상태 바뀜 : " + isOn); // 전등 상태 바뀜 : false
		
		
	}
}
