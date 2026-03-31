package ex1_overriding;

public class Q3_RegularEmployee extends Q3_Employee {
	public int salary;
	public String position = "정규직";
	
	public Q3_RegularEmployee(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	
	public int getPay() {
		return salary;
	}
}
