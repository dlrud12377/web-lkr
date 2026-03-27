package ex2_method;

public class TimesTable {
	public void showTable(int dan) {
		// 구구단출력
		
		System.out.println("==========");
		
		System.out.println("구구단 " + dan + "단 출력!");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
		}
		
		System.out.println("==========");
	}
}
