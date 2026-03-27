package ex2_method;

public class Computer {
	public int sum(int ... values) {
		int sum = 0;
		
		for (int x : values) {
			sum += x;
		}
		
		return sum;
	}
}
