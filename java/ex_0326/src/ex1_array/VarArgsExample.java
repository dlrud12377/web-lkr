package ex1_array;

public class VarArgsExample {
	// 가변길이 매개변수
	public static class VarArgs{
		// 메서드를 선언하는데 static을 사용하겠다.
		public static void printNumbers(int a, int... numbers) {
			// 전역, 객체 생성x, return 없음(가변길이 int형)
			System.out.println("매개변수 a : " + a);
			// 가변길이 매개변수 -> 배열이라고 했음. 
			// 향상된 for문 활용
			System.out.println("args : ");
			for (int num : numbers) {
				System.out.println(num);
			}
		}
	}
}

// 길이에 따라 오버로딩할 필요를 없애주는 형식