package ex1_exception.throwsexample.Q2;

// *** 주문 금액 계산 시스템
// 상품 가격과 수량을 입력받아 총 금액을 계산하는 프로그램 만들기

// 1. 사용자로부터 가격과 수량을 입력받는다.
// Converter2 클래스에서 문자열 -> 정수 변환

// 예외 처리 규칙
// 숫자 변환 실패 -> "숫자 형식 오류"
// 수량이 0 이하 -> "수량은 1 이상이어야 합니다." -> 오류 만들어두고 쓰는거?(사용자 정의 예외)
// 가격이 0 이하 -> "가격은 1 이상이어야 합니다."
// IllegalArgumentException예외를 강제로 발생

public class Converter2 {
	public int toInt(String price) throws NumberFormatException {
		int result = Integer.parseInt(price);
		return result;
	}
}
