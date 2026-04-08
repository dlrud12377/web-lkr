package ex1_generic.exam7;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> b = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
		
		Main.sum(a);
		Main.sum(b);
		
	}
	
	public static void sum(List<? extends Number> list) {
		
		double sum = 0;
		for (Number num : list) {
			sum = sum + num.doubleValue();
		}
		if (list.get(0) instanceof Integer) {
			System.out.println("총합 : " + (int)sum);
		}
		else if (list.get(0) instanceof Double) {
			System.out.println("총합 : " + sum);
		}	
	}
}
