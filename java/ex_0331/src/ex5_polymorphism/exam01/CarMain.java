package ex5_polymorphism.exam01;

public class CarMain {
	public static void main(String[] args) {
		// 자동차 객체 만들기
		Car c =  new Car();
		c.tire = new Tire();
		// Tire 클래스값을 가진 Tire 또는 그 자식 클래스인 KumhoTire, HankookTire 3가지만 가능
		c.speed = 100;
		c.brand = "포르쉐";
		
		
		c.run();
		
		// 한국타이어로 교체
		c.tire = new HankookTire();
		c.run();
		
		// 금호타이어로 교체
		c.tire = new KumhoTire();
		c.run();
	}
}
