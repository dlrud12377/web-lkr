package ex1_innerclass.practice;

public class Calculator {
	public Result add(int a, int b) {
		return new Result(a+b); //? 이 객체를 반환해야함
	}
	
	static class Result {
		int value;
		
		public Result(int value) {
			this.value = value;
		}

		public void show() {
			System.out.println("계산 결과 : " + value);
		}
	}
}
