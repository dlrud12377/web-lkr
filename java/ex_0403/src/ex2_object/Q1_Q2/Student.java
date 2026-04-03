package ex2_object.Q1_Q2;

public class Student {
	
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	// getter(field가 private값이라서)
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	// Object 클래스의 hashCode() 메서드를 오버라이딩
	// 학생 번호와 이름 해시코드를 합한 새로운 해시코드를 반환
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
}
