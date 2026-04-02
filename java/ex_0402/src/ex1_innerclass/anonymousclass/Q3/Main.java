package ex1_innerclass.anonymousclass.Q3;

public class Main {
	public static void main(String[] args) {
		Calculator c = new Calculator() {
			
			// 접근 제한자를 부모보다 좁게 줄일 순 없음
			@Override
			public void add(int x, int y) {
				System.out.println("두 수의 합은 " + (x+y) + "입니다.");
			}
		};
		
		c.add(5, 8);
	}
}
