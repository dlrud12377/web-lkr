package ex3_generic.exam;

public class ArrayPrinter {
	
	
	// 배열을 외부에서 전달받아 화면에 출력하는 기능을 가진 
	// printArray 제네릭 메서드 작성하기
	public <T> void printArray(T[] genArray) {
		System.out.print("[");
		for (int i = 0; i < genArray.length; i++) {
			System.out.print(genArray[i]);
			if (i != genArray.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	
	
	// Main에서 다음의 배열들을 출력하기
	// String[] name = {"김철수", "이영희", "박민수"};
	// Integer[] nums = {10, 20, 30};
	
}
