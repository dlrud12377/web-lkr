package ex1_overriding;

public class Q3_EmployeeMain {
	public static void main(String[] args) {
		
		Q3_RegularEmployee chulsu = new Q3_RegularEmployee("김철수", 4500000);
		System.out.println(chulsu.position + " " + chulsu.name + "의 급여 : " + chulsu.getPay() + "원");
		
		Q3_PartTimeEmployee younghee = new Q3_PartTimeEmployee("이영희", 120, 10320);
		System.out.println(younghee.position + " " + younghee.name + "의 급여 : " + younghee.getPay() + "원");
	}
}