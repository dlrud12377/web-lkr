package ex3_class;

public class Student {
	// 학생의 정보를 저장하는 곳
	
	//field - 이름, 나이, 점수
	String name = "김철수";
	int age = 0;
	double score = 0.0; // 내신점수
	
	// 메서드
	public void walk() {
		System.out.println(name + "은(는) 걷는 중입니다!");
	}
	
	//생성자 기본형
	public Student() {
		
	}
	
	//생성자 - 값 입력형 override
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
	
	
}
