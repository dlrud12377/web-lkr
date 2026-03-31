package ex1_final;

import java.util.Scanner;

public class DiscountMain {
	
		public static void main(String[] args) {
			// 할인률을 결정하는 Discount 클래스
			// 할인률을 상수로 가지고 있음
			
			Scanner sc = new Scanner(System.in);

			System.out.print("결제 금액을 입력해주세요 : ");
			int money = sc.nextInt();
			
			System.out.println("현재 결제 금액에 대한 할인률 : " + Discount.discountRate(money) * 100 + "%");
			System.out.println("할인 적용 가격 : " + Discount.calculatePrice(money) + "원");
		
		
		}
}