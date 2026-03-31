package ex1_final;

import java.util.Scanner;

public class ParkingMain {
	public static void main(String[] args) {
		// 키보드에서 입력받아 총 금액 구하기
		
		// 총 금액
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주차 시간을 입력해주세요(1시간 이하 기본요금, 올림 적용) : ");
		double time = sc.nextDouble();
		
		System.out.println("주차 금액은 " + Parking.finalFee(time) + "원 입니다.");
	}
}
