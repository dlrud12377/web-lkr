package ex4_input;

// java.util 패키지(JRE 내부)에 있는 Scanner 클래스를 불러옴
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		// 클래스에 정의되어있는 기능을 사용하려면
		// 클래스를 객체로 만드는 작업을 해야 함
		// 객체의 생성 : new 클래스명();
		Scanner sc = new Scanner(System.in);
		
		String name, address;
		int age;
		double height;
		
		// 객체를 통해 클래스 안에 정의된 기능을 호출
		
		System.out.println("이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		System.out.println("주소를 입력해주세요 : ");
		address = sc.nextLine();
		
		System.out.println("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		System.out.println("키를 입력해주세요(소숫점 첫째자리까지) : ");
		height = sc.nextDouble();
		
		// 순서가 바뀌면 nextLine을 사이에 한번 끼워서 줄정리 + 입력정리를 해주어야 함(엔터를 치는 판정이 nextLine이 진행되는 판정으로 들어가버림)
		
		System.out.println("모든 정보가 성공적으로 입력되었습니다!");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("주소 : %s\n", address);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1f\n", height);
		
		
	}
}
