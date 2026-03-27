package ex2_method;

public class ComputerMain {
	public static void main(String[] args) {
		Computer c = new Computer();
		
		// 1, 2, 3, 4, 5를 전달하여 총 합을 구하기
		
		int result = c.sum(1, 2, 3, 4, 5);
		System.out.println("1~5까지의 합 : " + result);
		
		// 1, 2, 3을 전달하여 총 합을 구하기
		
		int result2 = c.sum(1, 2, 3);
		System.out.println("1~5까지의 합 : " + result2);
		
		// 가변길이 매개변수는 이와 같이 자유롭게 개수를 지정 가능(배열 취급하기 때문)
	}
}
