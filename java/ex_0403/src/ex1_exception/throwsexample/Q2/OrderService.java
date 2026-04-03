package ex1_exception.throwsexample.Q2;

//OrderService 클래스에서 총 금액을 계산
public class OrderService {
	public void totalFee(int price, int quantity) throws IllegalArgumentException {
		
		if (price <= 0) {
			throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
		}
		
		System.out.println("최종 금액 : " + (price * quantity) + "원");
	}
}
