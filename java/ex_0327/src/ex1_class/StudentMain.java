package ex1_class;

public class StudentMain {
	public static void main(String[] args) {
		Student Chulsu = new Student("김철수", 25, 197.5);
		
		System.out.println("이름 : " + Chulsu.name);
		System.out.println("나이 : " + Chulsu.age);
		System.out.println("내신점수 : " + Chulsu.score);
		
		Chulsu.walk();
		
		Student Minsu = new Student("김민수", 25, 188.2);
		
		Student Dingdong = new Student("김띵동", 27, 170.4);
		
		// Q1. 학생 3명의 정보를 저장할 수 있도록 객체 "배열"을 만들고 출력하세요
		
		// 배열에는 같은 타입의 데이터만 넣을 수 있다.
		// 데이터의 타입은 배열 앞에 명시한다.
		Student[] class101 = {Minsu, Dingdong, Chulsu};
		
		for (Student student : class101) {
			System.out.println("이름 : " + student.name + ", 나이 : " + student.age +  ", 내신점수 : " + student.score);
		}
	}
}
