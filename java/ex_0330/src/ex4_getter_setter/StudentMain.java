package ex4_getter_setter;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setAge(-5);
		
		s1.getAge();
		
		s1.setName("김띵동");
		s1.setAge(23);
		
		System.out.println("이름 : " + s1.getName() + ", 나이 : " + s1.getAge());
	}
}
