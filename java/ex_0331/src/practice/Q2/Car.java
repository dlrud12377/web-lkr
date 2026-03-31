package practice.Q2;

public class Car {
	public int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가스 : " + gasGauge);
	}
}
