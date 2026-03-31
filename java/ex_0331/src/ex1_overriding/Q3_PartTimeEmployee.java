package ex1_overriding;

public class Q3_PartTimeEmployee extends Q3_Employee {
	public int workTime;
	public int MoneyForHour;
	public String position = "아르바이트";
	
	public int getPay() {
		return workTime * MoneyForHour;
	}
	
	public Q3_PartTimeEmployee(String name, int workTime, int MoneyForHour) {
		super(name);
		this.workTime = workTime;
		this.MoneyForHour = MoneyForHour;
	}
}
