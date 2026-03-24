package ex2_if;

public class IfElseIfExample {
	public static void main(String[] args) {
		int score = 75;
		// 점수가 100~90점 "A"
		// 10점마다 B~F까지
		
		if (score > 100 || score < 0) {
			System.out.println("잘못된 점수입니다. 0~100 사이의 수를 입력해주세요");
		}
		else if (score >= 90) {
			System.out.println("시험 등급은 A입니다.");
		}
		else if (score >= 80) {
			System.out.println("시험 등급은 B입니다.");
		}
		else if (score >= 70) {
			System.out.println("시험 등급은 C입니다.");
		}
		else if (score >= 60) {
			System.out.println("시험 등급은 D입니다.");
		}
		else {
			System.out.println("시험 등급은 F입니다.");
		}
		

	}
}
