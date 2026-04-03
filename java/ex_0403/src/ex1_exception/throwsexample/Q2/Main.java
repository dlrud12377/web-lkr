package ex1_exception.throwsexample.Q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Converter2 c2 = new Converter2();
		OrderService o = new OrderService();
		try(Scanner sc = new Scanner(System.in);) {
			System.out.print("제품 가격을 입력해주세요 : ");
			String price = sc.next();
			int intPrice = c2.toInt(price);
			
			System.out.print("제품 수량을 입력해주세요 : ");
			String strQuantity = sc.next();
			int quantity = c2.toInt(strQuantity);
			
			o.totalFee(intPrice, quantity);
			
		}
		catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("예상 밖의 오류 발생");
			e.printStackTrace();
		}
	}
}
