package ex2_object.Q1_Q2;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
	
		// 해시코드가 같은지 검사
		
		// 문자열은 내용이 같으면 항상 동일한 해시코드값을 반환한다. 
		System.out.println(s1.hashCode() == s2.hashCode()); // true
		// 오버라이딩 안하면 : 두 객체의 해시코드값, 즉 주소값을 깡으로 비교하기 때문에 false가 나옴
	
	}
}
