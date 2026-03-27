package ex2_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		
		// 입력받을 수 전달용(단수)
		Scanner sc = new Scanner(System.in);
		
		//TimesTable 객체 생성
		TimesTable tt = new TimesTable();
		
		System.out.print("출력할 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		tt.showTable(dan);
		
		
	}
}
