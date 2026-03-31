package ex1_overriding;

public class Q3_Employee {
	public String name;
	public String position = "노동자";
	
	public Q3_Employee(String name) {
		this.name = name;
	}
	
	public int getPay() {
		return 0;
	}
}
