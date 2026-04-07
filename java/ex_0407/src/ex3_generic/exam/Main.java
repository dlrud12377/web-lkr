package ex3_generic.exam;

public class Main {
	public static void main(String[] args) {
		 String[] name = {"김철수", "이영희", "박민수"};
		 Integer[] nums = {10, 20, 30};
		 
		 ArrayPrinter ap = new ArrayPrinter();
		 
		 ap.printArray(name);
		 ap.printArray(nums);
		 
		 StudentPrinter sp = new StudentPrinter();
		 sp.<String, Integer>printStudent("김영희", 37);
		 
	}
}
