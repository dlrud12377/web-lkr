package Q3;

public class Employee {
	
	// field
	private String name;
	private int salary;
	
	// 생성자(필드초기화)
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	// 직원 정보를 출력하는 printInfo()
	public void printInfo() {
		System.out.println(String.format("이름: %s, 급여: %d", name, salary));
	}
	
	// salary의 getter
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
}
