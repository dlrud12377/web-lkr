package ex_variable;

public class Ex1_Integer {
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수 11;(앞에 0b를 적어주어야 함)
		int var2 = 0206; // 8진수(앞에 0을 적어주어야 함)
		int var3 = 365; // 10진수
		int var4 = 0xB3; // 16진수(앞에 0x를 적어주어야 함) - B : 11 -> 11 * 16 + 3 = 179
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
