package ex3_class;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 활용할 곳
		
		Student chulSu = new Student("김철수", 25, 197.5);
		
		System.out.println("이름 : " + chulSu.name);
		System.out.println("나이 : " + chulSu.age);
		System.out.println("내신점수 : " + chulSu.score);
		
		chulSu.walk();
		
		// Q1. 학생 3명의 정보를 저장할 수 있도록 객체 "배열"을 만들고 출력하세요
		
		
		Student[] class101 = {new Student("김민수", 25, 188.2), new Student("김띵동", 27, 170.4), chulSu};
		
		for (Student student : class101) {
			System.out.println("이름 : " + student.name + ", 나이 : " + student.age +  ", 내신점수 : " + student.score);
		} // 객체명 지정 불가? 인덱스로만 쓸수있나?
	}

}
