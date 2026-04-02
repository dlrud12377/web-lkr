package ex1_abstract.Example3;

//추상클래스(Delivery)를 상속받는다.
public class StorePickup extends Delivery {
	
	@Override
	public void ship() {
		System.out.println("매장에서 직접 수령합니다.");
	}
}
