package ex_0722.coupling;

// 제어 결합도
// 제어 신호를 넘겨 상대 모듈의 내부 실행 흐름을 통제하는 형태
public class ControlCouplingExample {

	static class OrderService{
		// 1. isVIP라는 boolean 클래스 값에 따라 내부 로직이 달라진다.
		// 2. 호출하는 쪽에서 OrderServicec 내부가 isVIP를 어떻게 처리하는지 알고 있어야 한다.
		// 3. 새로운 등급이 생길 때마다 메서드 내부의 if-else문을 계속 수정해야 한다.
		// 4. 하나의 메서드가 VIP가격 계산과 일반 가격 계산이라는 두 가지 책임을 동시에 가진다.
		public double calculatePrice(double price, boolean isVIP) {
			if(isVIP) {
				return price * 0.8;
			}
			else {
				return price;
			}
		}
	}
	
}
