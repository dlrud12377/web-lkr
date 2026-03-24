package ex2_if;

import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		// Math
		// random() 메서드
		// - 0.0 <= ~ < 1.0 사이의 double 타입 난수를 하나 뽑아주는 기능이 있음
		
		int num = (int)(Math.random()*6) + 1; // 1 <= x < 7;
		
		// 어떤 주사위 눈이 나왔는지 출력하기
		
		System.out.println(num + "이(가) 나왔습니다.");
		
		
		// Q1. 구매 금액에 따라 할인율이 적용된 금액 구하기
		// 10만원 이상 구매 시 20% 할인
		// 5만원 이상 구매 시 10% 할인
		// 보드에서 금액을 입력받고 몇 % 할인받았는지, 최종금액이 얼만지 출력
		
		int discount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매한 금액을 입력해주세요 : ");
		int payMoney = sc.nextInt();
		
		
		if (payMoney >= 100000) {
			discount = 20;
		}
		else if (payMoney >= 50000) {
			discount = 10;
		}
		else {
			discount = 0;
		}
		
		int finalPayment = (int)(payMoney * (1 - discount/100.0));
		
		System.out.println("적용받은 할인율은 " + discount + "%입니다.");
		System.out.println("최종 소비 금액은 " + finalPayment + "원입니다.");
		
		

	}
}
