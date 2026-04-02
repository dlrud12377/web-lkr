package ex1_abstract.Example3;

// 추상클래스(Delivery)를 상속받는다.
public class RocketDelivery extends Delivery {
	
	@Override
	public void ship() {
		System.out.println("로켓 배송을 시작합니다.");
	}

}
