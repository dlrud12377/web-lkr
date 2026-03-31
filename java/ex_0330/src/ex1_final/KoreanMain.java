package ex1_final;

public class KoreanMain {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456 - 1155332", "김띵동");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// k1.nation = "일본"; //final 필드는 바꾸려 하면 오류가 남
		k1.name = "나카무라";
		
	}
}
